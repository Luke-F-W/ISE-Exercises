import java.util.Random;

public class TemperaturesMath {
	public static void main(String[] args) {
        int addingtemps = 0;
        int freezingdays = 0;
        int largestnum = 0;
        int smallestnum = 0;
        
        int temperatures[] = new int[30];
        Random random = new Random();

        //int temperatures[] = {1, 5, 3, 7, 6, 5, 9, 12, 16, 11, 14, 20, 22, 21, 26, 32, 34, 20, 24, 23, 11, 13, 17, 5, 8, 9, -2, -5, 0, -7};
        for(int k = 0; k < 30; k++){
            temperatures[k] = random.nextInt(-10, 35);

        }
        
        int templength = temperatures.length;
        for(int i = 0; i < templength; i++){
            addingtemps = addingtemps + temperatures[i];
            System.out.println(temperatures[i]);
            if(temperatures[i] <= 0){
                freezingdays++;
            }
            if(temperatures[i] > largestnum){
                largestnum = temperatures[i];
            }
            if(temperatures[i] < smallestnum){
                smallestnum = temperatures[i];
            }
        }
        int meanOfTemps = addingtemps / templength;
        System.out.printf("The mean temperature is: %d\n", meanOfTemps );
        System.out.printf("The number of freezing days is: %d\n", freezingdays );
        System.out.printf("The highest temp was: %d\n", largestnum );
        System.out.printf("The lowest temp was: %d\n", smallestnum );


    }
}
