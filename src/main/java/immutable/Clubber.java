package immutable;

import lombok.Builder;
import lombok.NonNull;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 12/01/2017.
 */
@Builder
@ToString
public class Clubber {
    @NonNull
    private final String name;
    private int maxBeerLiters;
    @Singular
    private List<String> beers;

    @Singular
    private Map<String,Integer> rates;


}






