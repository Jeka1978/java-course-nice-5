package lombokLab;

import lombok.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

import static java.lang.Math.*;

/**
 * Created by Evegeny on 10/01/2017.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Person implements Serializable {
    private transient int id = 23;
    private String name;





}
