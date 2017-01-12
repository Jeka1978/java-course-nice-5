package polymorhpism;

/**
 * Created by Evegeny on 12/01/2017.
 */
public interface Character {
    void kick(Character character);
    int getPower();

    void decreaseHp(int delta);
}
