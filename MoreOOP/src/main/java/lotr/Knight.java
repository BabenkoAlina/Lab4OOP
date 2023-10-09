package lotr;
import java.util.Random;

public class Knight extends Character{

    public Knight() {
        super(new Random().nextInt(10)+2, new Random().nextInt(10)+2);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(this.getPower()));
    }
}