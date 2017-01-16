package factory;

/**
 * Created by Evegeny on 16/01/2017.
 */
public interface Config {
    <T> Class<T> getImpl(Class<T> ifc);
}
