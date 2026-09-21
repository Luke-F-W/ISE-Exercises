public class Driver {
    public static void main(String[] args) {

        // ====================================================================
        // 1. Accessing Static Variable WITHOUT Any Objects
        // ====================================================================
        // Static members exist at the CLASS level, so we access them using
        // the class name directly: ClassName.variableName
        System.out.println("Initial total animals: " + Animal.totalAnimalCount); // Output: 0

        System.out.println("\n--- Creating Animals ---");

        // Uses default constructor
        Animal a1 = new Animal();

        // Uses parameterized constructor
        Animal a2 = new Animal("Siobhan", 64, false);
        Animal a3 = new Animal("Trang", 57, true);

        a1.setName("Ben");
        a1.setWeight(10.43);
        a1.setMammal(true);



        // ====================================================================
        // 2. Accessing Non-Static (Instance) Variables
        // ====================================================================
        // Each object holds its own distinct value for 'name'
        System.out.println("a1 name: " + a1.getName()); // "Unknown Animal"
        System.out.println("a2 name: " + a2.getName()); // "Lion"
        System.out.println("a3 name: " + a3.getName()); // "Elephant"

        System.out.println("a1 weight: " + a1.getWeight()); // "Unknown Animal"
        System.out.println("a2 weight: " + a2.getWeight()); // "Lion"
        System.out.println("a3 weight: " + a3.getWeight()); // "Elephant"

        System.out.println("is a1 a mammal: " + a1.getMammal()); // "Unknown Animal"
        System.out.println("is a1 a mammal: " + a2.getMammal()); // "Lion"
        System.out.println("is a1 a mammal: " + a3.getMammal()); // "Elephant"

        // ====================================================================
        // 3. Accessing Static Variable AFTER Object Creation
        // ====================================================================
        // Preferred Way: Access via Class Name
        System.out.println("\nTotal animals via Class Name: " + Animal.totalAnimalCount); // Output: 3

        // Techically possible (though discouraged by compiler warnings): Access via Instance
        // ALL instances point to the same shared memory location for static fields!
        System.out.println("Total animals via a1 instance: " + a1.totalAnimalCount); // Output: 3
        System.out.println("Total animals via a2 instance: " + a2.totalAnimalCount); // Output: 3

        System.out.println("Total animals via static call: " + Animal.getNumber());
    }
}

class Animal {
    // Instance variable: Unique to each Animal object
    private String name;
    // Static class variable: Shared across ALL Animal objects
    public static int  totalAnimalCount = 0;
    private double weighKG = 0;
    private boolean mammal;
    // Explicit Default Constructor
    public Animal() {
        this.name = "Unknown Animal";
        // Increment the shared static counter every time an Animal is created
        totalAnimalCount++;
    }

    // Parameterized Constructor
    public Animal(String inName, double inWeight, boolean isMammal) {
        name = inName;
        weighKG = inWeight;
        mammal = isMammal;
        totalAnimalCount++;
    }

    // getters, gets a value from an animal obj
    public static int getNumber() {

        return totalAnimalCount;
    }

    // Instance Method (Non-static)
    public String getName() {
        
        return name;
    }

    public double getWeight() {
        
        return weighKG;
    }

    public boolean getMammal() {
        
        return mammal;
    }
    // setters
    public void setName(String newName){
        
        name = newName;
    }

    public void setWeight(double newWeight){
        
        weighKG = newWeight;
    }

    public void setMammal(Boolean newMammal){
        
        mammal = newMammal;
    }
}
