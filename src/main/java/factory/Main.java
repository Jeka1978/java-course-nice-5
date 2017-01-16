package factory;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class Main {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
        MyService myService = ObjectFactory.getInstance().createObject(MyService.class);
        myService.doWork();
        myService.drinkBeer();
    }
}
