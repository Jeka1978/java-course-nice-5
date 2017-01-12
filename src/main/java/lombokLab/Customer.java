package lombokLab;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
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

    public Customer() {
        person = new Person();
    }

    @Setter
    @Getter
    private String favoriteColor;
}
