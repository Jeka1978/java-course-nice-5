package immutable;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Created by Evegeny on 12/01/2017.
 */
@ToString
@AllArgsConstructor
public final class Client {
    private final String name;
    private final int age;
    private final int salary;



    public Client incAge(int delta) {
        return new Client(name, age+delta, salary);
    }
}









