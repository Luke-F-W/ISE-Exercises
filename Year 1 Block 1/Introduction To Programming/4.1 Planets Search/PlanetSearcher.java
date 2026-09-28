import java.util.Scanner;
public class PlanetsFun {
    public static void main(String[] args) {
        // Creating a fixed-size array for all 8 planets in our solar system
        Scanner obj = new Scanner(System.in);
        String search = "";
        Planet[] solarSystem = new Planet[8];

        // Populating the array with Planet instances
        solarSystem[0] = new Planet("mercury", 2439.7, 0.39);
        solarSystem[1] = new Planet("venus", 6051.8, 0.72);
        solarSystem[2] = new Planet("earth", 6371.0, 1.00);
        solarSystem[3] = new Planet("mars", 3389.5, 1.52);
        solarSystem[4] = new Planet("jupiter", 69911.0, 5.20);
        solarSystem[5] = new Planet("saturn", 58232.0, 9.58);
        solarSystem[6] = new Planet("uranus", 25362.0, 19.22);
        solarSystem[7] = new Planet("neptune", 24622.0, 30.05);

        // Iterating through the array to call methods on each object
        for (Planet planet : solarSystem) {
            planet.displayInfo();
        }
        try{
            System.out.println("Enter the name of the planet you would like to look for");
            search = obj.nextLine();
            Planet.findPlanetByName(solarSystem, search);
        }
        catch(Exception e){
            System.out.println("Error, bad input detected");
        }
        finally{
            System.out.println("Search Operation Finished");
        }
        obj.close();
        
    }
}

class Planet {
    private String name;
    private double radiusKm;
    private double distanceFromSunAu;

    // Constructor
    public Planet(String name, double radiusKm, double distanceFromSunAu) {
        this.name = name;
        this.radiusKm = radiusKm;
        this.distanceFromSunAu = distanceFromSunAu;
    }

    // Method to display planet information
    public void displayInfo() {
        System.out.println("Planet: " + name + " | Radius: " + radiusKm + " km | Distance: " + distanceFromSunAu + " AU");
    }
    public double displayRadius() {
        return radiusKm;
    }
    public String displayName(){
        return name;
    }
    public static void findPlanetByName(Planet[] planets, String name){
        int j = 0;
        for (int i = 0; i < planets.length; i++) {
            try{
                
                String tempname = planets[i].displayName();
                if(tempname.equals(name.toLowerCase())){
                    planets[i].displayInfo();
                    j = 1;
                }

            }
            catch(Exception e){
                System.out.println("error, bad input");
            }
            }
                if(j == 0){
                    System.out.println("Planet not found");
                }
        }
        
    }
