import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String opt = "";
        int p = 0;
        while(!opt.equals("A") && !opt.equals("B")){
            System.out.println("Please choose A for task A or B for task B");
            opt = obj.nextLine();
        }
        //a
        if(opt.equals("A")){
            System.out.println("How many star rows would you like?");
            int starAmount = obj.nextInt();
            for(int i = -1; i < starAmount; i++){
                System.out.println("");
                for(int j = -1; j < i; j++){
                    System.out.print("*");
                }
            }
        }
        //b
        if(opt.equals("B")){

            System.out.println("How many stars would you like?");
            int starAmount = obj.nextInt();
            p = starAmount;
            int starp = starAmount + 1;
            for(int i = 0; i < starp; i++){
                System.out.println("");
                for(int s = 0; s < p; s++){
                    System.out.print(" ");
                }
                p--;
                //handles 1 half of triangle
                for(int st = 0; st < i; st++) {
                    System.out.print("*");
                }
                //handles second half of triangle
                for(int st = 1; st < i; st++) {
                    System.out.print("*");
                }
            }
        }
    }
}
