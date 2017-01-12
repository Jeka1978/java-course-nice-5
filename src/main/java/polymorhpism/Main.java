package polymorhpism;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(2), new Dog(5), new Dog(1));
        dogs.sort((o1, o2) -> o1.getAge()-o2.getAge());
        dogs.forEach(System.out::println);
    }
}
