package factory;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class ConsoleSpeaker implements Speaker {


    @Override
    public void sayMessage(String message) {
        System.out.println(message);
    }
}
