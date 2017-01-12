package polymorhpism;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Evegeny on 12/01/2017.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal {
    private int age;
    @Override
    void makeVoice() {
        System.out.println("a a");
    }

    public void guard() {
        System.out.println("Gav gav");
    }
}
