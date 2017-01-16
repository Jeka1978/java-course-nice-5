package factory;

import lombok.SneakyThrows;

import java.lang.reflect.Field;

/**
 * Created by Evegeny on 16/01/2017.
 */
public class InjectByTypeAnnotationObjectConfigurer implements ObjectConfigurer {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                ObjectFactory factory = ObjectFactory.getInstance();
                Object object = factory.createObject(field.getType());
                field.setAccessible(true);
                field.set(t,object);
            }
        }
    }
}












