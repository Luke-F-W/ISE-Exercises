import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Warrior> army = new ArrayList<>();
        Celtic celticFighter = new Celtic("James", 110);
        Viking vikingFighter = new Viking("Chris", 90);
        Kshatriya kshatriyaFighter = new Kshatriya("Molly", 82);

        army.add(celticFighter);
        army.add(vikingFighter);
        army.add(kshatriyaFighter);

        for(Warrior w : army){
            w.preformSpecialMove();
        }
    }
}
class Warrior{
    protected String name;
    protected int health;

    public Warrior(String name, int health){
        this.name = name;
        this.health = health;
    }

    public void preformSpecialMove(){
        System.out.println("RAHHHHHHHH!!");
    }
    public void displayStats(){
        System.out.println("Health is: " + this.health);
        System.out.println("Name is: " + this.name);
    }
}

class Celtic extends Warrior{

    public Celtic(String name, int health) {
        super(name, health);
        this.name = name;
        this.health = health;
    }

    public void preformSpecialMove(){
        System.out.println(this.name + " Performs a Woad Berserk Charge dealing high damage!!");
    }
}

class Viking extends Warrior{

    public Viking(String name, int health) {
        super(name, health);
        this.name = name;
        this.health = health;
    }

    public void preformSpecialMove(){
        System.out.println(this.name + " Executes a Shield Wall Crush with an battle cry!!");
    }
}


class Kshatriya extends Warrior{

    public Kshatriya(String name, int health) {
        super(name, health);
        this.name = name;
        this.health = health;
    }

    public void preformSpecialMove(){
        System.out.println(this.name + " Unleashes a Dharmic Sword Strike driven by martial honor.");
    }
}

