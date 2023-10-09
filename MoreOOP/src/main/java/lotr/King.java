package lotr;

import java.util.Random;

public class King extends Character{

    public King(int hp, int power) {
       super(new Random().nextInt(10)+5, new Random().nextInt(10)+5);
        
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(this.getPower()));
    }
    
}
