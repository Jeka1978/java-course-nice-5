package immutable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class MainForClubber {
    public static void main(String[] args) {
        Clubber clubber = Clubber.builder().maxBeerLiters(1).beer("Baltica").beer("Leff")
                .rate("Gambrinus", 99).rate("Dublin", 75).build();

        System.out.println(clubber);
    }
}
