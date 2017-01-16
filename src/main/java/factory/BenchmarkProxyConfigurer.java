package factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Evegeny on 16/01/2017.
 */
public class BenchmarkProxyConfigurer implements ProxyConfigurer {
    @Override
    public <T> T wrapWithProxy(Object t, Class<T> type) {
        if (type.isAnnotationPresent(Benchmark.class) || isBenchmarkOnMethodPresent(type)) {
            return (T) Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Method implMethod = type.getMethod(method.getName(), method.getParameterTypes());
                    if (implMethod.isAnnotationPresent(Benchmark.class) || type.isAnnotationPresent(Benchmark.class)) {
                        System.out.println("*********** BENCHMARK START ********** " + method.getName());
                        long start = System.nanoTime();
                        Object retVal = method.invoke(t, args);
                        long end = System.nanoTime();
                        System.out.println(end - start);
                        System.out.println("*********** BENCHMARK END ********** " + method.getName());
                        return retVal;
                    } else {
                        return method.invoke(t, args);
                    }
                }
            });
        } else {
            return (T) t;
        }
    }

    private <T> boolean isBenchmarkOnMethodPresent(Class<T> type) {
        Method[] methods = type.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                return true;
            }
        }
        return false;
    }
}






