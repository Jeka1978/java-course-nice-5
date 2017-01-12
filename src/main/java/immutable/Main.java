package immutable;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class Main {
    public static void main(String[] args) {

        Client sabi = new Client("Sabi", 44, 64000);
        Client client = sabi.incAge(1);
        System.out.println("client = " + client);
    }
}
