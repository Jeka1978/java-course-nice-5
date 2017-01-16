package factory;

/**
 * Created by Evegeny on 16/01/2017.
 */
public interface ProxyConfigurer {
    <T> T wrapWithProxy(Object t, Class<T> type);
}
