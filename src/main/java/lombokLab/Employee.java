package lombokLab;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 10/01/2017.
 */
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Employee{

    @Delegate(excludes = PersonExclusion.class)
    @Setter
    @Getter
    @JsonIgnore
    private Person person;

    @Setter
    @Getter
    private int salary;

}
