package polymorhpism;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class AnimalDoctor {
    public void treat(Animal animal) {
        int x = 12;
        String str = "x = " + x;

        if (animal instanceof Dog) {
            ((Dog) animal).guard();

        }
    }
}
