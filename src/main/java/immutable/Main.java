package immutable;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        Client.Builder builder = new Client.Builder();
        Client moshe = builder.age(12).salary(12222).build();
        System.out.println("moshe = " + moshe);
    }
}
