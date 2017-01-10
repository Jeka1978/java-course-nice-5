package lab1;

/**
 * Created by Evegeny on 10/01/2017.
 */
public class RealMaamResolver implements MaamResolver {

    @Override
    public double getMaam() {
        int x = 12;
        double sin = Math.sin(30);
        return 0.18;
    }


    public static void main(String[] args) {
        System.out.println(234);
        new RealMaamResolver().getMaam();
    }
}
