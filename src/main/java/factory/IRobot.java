package factory;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class IRobot {
    private Speaker speaker;
    private Cleaner cleaner;


    public IRobot() throws Exception {
        speaker = ObjectFactory.getInstance().createObject(Speaker.class);
        cleaner = ObjectFactory.getInstance().createObject(Cleaner.class);
    }

    public void cleanRoom() {
        speaker.sayMessage("I started");
        cleaner.clean();
        speaker.sayMessage("I finished");


    }
}
