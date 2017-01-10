package lombokLab;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 10/01/2017.
 */
@AllArgsConstructor
@ToString
public class Customer {

    @Delegate
    @Setter
    @Getter
    @JsonIgnore
    private Person person;


    @Setter
    @Getter
    private String favoriteColor;
}
