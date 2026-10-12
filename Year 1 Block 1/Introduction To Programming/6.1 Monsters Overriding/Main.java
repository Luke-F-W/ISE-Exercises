import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int i = 0;
        Monsters vampire = new Monsters("Vampire", 3.65);
        Monsters zombie = new Monsters("Zombie", 5.32);
        Monsters ghost = new Monsters("ghost", 4.24);
        List<Monsters> monsterList = new ArrayList<>();

        monsterList.add(0, zombie);
        monsterList.add(1, ghost);
        monsterList.add(2, vampire);
        spoopy spoopy = new Halloween(){};


        System.out.println("=== Spooky List (Order of Appearance) ===");
        for(Monsters m : monsterList){
            m.getInfo();
            System.out.printf("Index is: %d\n", i);
            i++;
            String name = m.getName();
            Halloween halloween = new Halloween() {};

            halloween.haunt(m.getName());;
            }
        i = 0;
        System.out.println("=== Spooky List (by Level) ===");
        for(Monsters m : monsterList){
            m.getInfo();
            System.out.printf("Index is: %d\n", i);
            i++;
            String name = m.getName();
            Halloween halloween = new Halloween() {};

            halloween.scare(m.getName(), m.getLvl());
        }

        }

    }

interface spoopy{
    void haunt(String name);
}
interface scary{
    void scare(String name, double scarinessLvl);
}

abstract class Halloween implements spoopy, scary{

    @Override
    public void haunt(String name){
        System.out.printf("%s floats through walls saying: Boo!\n", name);
    }

    @Override
    public void scare(String name, double scarinessLvl){
        System.out.printf("%s jumps out with a Scariness Level of %f\n", name, scarinessLvl);
    }
}

class Monsters{
    private String name;
    private Double scarinessLvl;

    public Monsters(String name, Double scarinessLvl){
        this.name = name;
        this.scarinessLvl = scarinessLvl;
    }

    public void getInfo(){
        System.out.printf("Name is: %s\n", this.name);
        System.out.printf("Scariness Level is: %.2f\n", this.scarinessLvl);
    }

    public String getName(){
        return this.name;
    }
    public double getLvl(){
        return this.scarinessLvl;
    }
    @Override
    public String toString(){
        return "";
    }
}
