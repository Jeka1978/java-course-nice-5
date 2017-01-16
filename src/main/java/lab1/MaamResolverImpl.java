package lab1;

import lombok.SneakyThrows;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class MaamResolverImpl implements MaamResolver {
    @Override
    @SneakyThrows
    public double getMaam() {
        Thread.sleep(100);
        return 0.18;
    }
}
