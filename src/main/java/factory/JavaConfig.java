package factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 16/01/2017.
 */
public class JavaConfig implements Config {
    private Map<Class, Class> ifc2Impl = new HashMap<>();

    public JavaConfig() {
        ifc2Impl.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Impl.put(Cleaner.class, PowerCleaner.class);
        ifc2Impl.put(MyService.class, MyServiceImpl.class);
    }

    @Override
    public <T> Class<T> getImpl(Class<T> ifc) {
        return ifc2Impl.get(ifc);
    }
}









