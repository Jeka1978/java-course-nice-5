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
public class Person implements Serializable {
    private transient int id;
    private String name;





}
