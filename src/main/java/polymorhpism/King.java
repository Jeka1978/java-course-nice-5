package polymorhpism;

import lombok.Setter;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class King implements Character {
    @Setter
    private KickBehavior kickBehavior = new SwordKickBehavior();
    @Override
    public void kick(Character character) {
        kickBehavior.kick(this,character);
    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public void decreaseHp(int delta) {

    }
}
