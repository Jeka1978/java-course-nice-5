package hystrix;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.strategy.properties.HystrixPropertiesFactory;

/**
 * Created by Evegeny on 15/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        MyCommand command = new MyCommand();
        String str = command.execute();
        System.out.println("str = " + str);
        System.out.println(123);
    }


    static class MyCommand extends HystrixCommand<String> {

        public MyCommand() {
            super(HystrixCommandGroupKey.Factory.asKey("str"));
        }

        @Override
        protected String run() throws Exception {
            Thread.sleep(900);
            return "abc";
        }
    }
}

