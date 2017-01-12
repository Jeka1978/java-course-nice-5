package polymorhpism;

import java.util.Comparator;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class DogsComparatorByAge implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getAge()-o2.getAge();
    }
}
