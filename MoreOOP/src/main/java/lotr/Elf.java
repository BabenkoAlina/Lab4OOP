package lotr;

public class Elf extends Character{

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (this.getPower() > c.getPower()){
            c.kill();
            return;
        }
        c.setPower(c.getPower() - 1);
        
    }
    
}
