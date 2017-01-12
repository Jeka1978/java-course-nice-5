package immutable;

import lombok.ToString;

/**
 * Created by Evegeny on 12/01/2017.
 */
@ToString
public final class Client {
    private final String name;
    private final int age;
    private final int salary;

    private Client(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static class Builder {
        private String name;
        private int age;
        private int salary;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build() {

            validate();

            Client client = new Client(name, age, salary);
            clean();
            return client;
        }

        private void clean() {
            age=0;
            salary=0;
            name = null;
        }

        private void validate() {
            if (name == null) {
                throw new IllegalStateException("name can't be null");
            }
        }
    }

    public Client incAge(int delta) {
        return new Client(name, age+delta, salary);
    }
}









