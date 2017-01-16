package factory;

/**
 * Created by Evegeny on 16/01/2017.
 */
public class MyServiceImpl implements MyService {
    @Override
    public void doWork() {
        System.out.println("working");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("drink beer");
    }
}
