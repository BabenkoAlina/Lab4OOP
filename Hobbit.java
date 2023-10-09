package lotr;

public class Hobbit extends Character{
    
    public Hobbit() {
        super(3, 0);
    }
    
    @Override
    public void kick(Character c){
        setHp(0);
        toCry();
    }
   
    public void toCry(){
        System.out.print("Crying");
    }
}