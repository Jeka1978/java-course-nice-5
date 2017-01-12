package factory;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }


    public <T> T createObject(Class<T> type) throws Exception {
        if (type.isInterface()) {
            //replace type with real one   type = config.getImpl(type)
        }
        T o = type.newInstance();
//        type.getDeclaredFields()
//        getAnnotation(InjectRandomInt.class)
        return o;
    }












}
