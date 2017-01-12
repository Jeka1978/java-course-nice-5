package polymorhpism;

import java.util.Random;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class SwordKickBehavior implements KickBehavior {
    private Random random = new Random();
    @Override
    public void kick(Character c1, Character c2) {
        int damage = random.nextInt(c1.getPower());
        c2.decreaseHp(damage);
    }
}
