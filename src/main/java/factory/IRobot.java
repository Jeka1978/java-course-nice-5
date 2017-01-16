package factory;

import lombok.Setter;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 12/01/2017.
 */
@Setter
@Benchmark
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;


    @PostConstruct
    public void init() {
        System.out.println(speaker.getClass());
    }

    public void cleanRoom() {
        speaker.sayMessage("I started");
        cleaner.clean();
        speaker.sayMessage("I finished");


    }
}
