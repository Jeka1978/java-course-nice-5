package lab1;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class JUnitRunner {
    public void runTests(Class testClass) throws Exception {
        Object testObject = testClass.newInstance();
        Method[] methods = testClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                method.invoke(testObject);
            }
        }

    }
}
