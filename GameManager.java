package lotr;

public class GameManager {
    public void fight(Character c1, Character c2){
        if (c1.getHp() > 0){
            System.out.println("First character attacks second one");
            c1.kick(c2);
            System.out.println("Player 1 kicked Player 2");
            if (c2.getHp() > 0){
                System.out.println("Second player is still alive!");
                this.fight(c2, c1);
            }

        }
        System.out.println("Game over: one of them is dead");
        
    }
}
