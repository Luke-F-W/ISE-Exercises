import java.util.Scanner;
public class DataTypeLab {
    public static void main(String[] args) {
        //declare scanner
        Scanner obj = new Scanner(System.in);

        //get info ab the user
        System.out.println("Please Enter Your Name:");
        String name = obj.nextLine();
        System.out.println("Please Enter Your Year Of Birth:");
        int yearofbirth = obj.nextInt();
        System.out.println("Please Enter Your Current Net Worth:");
        float networth = obj.nextFloat();
        System.out.println("Please Enter The Current Year");
        int year = obj.nextInt();


        //calculations
        int age = year - yearofbirth;
        int retirementyear = 67 - age;
        for(int i = 0; i < retirementyear; i = i + 1){
            networth = networth * 2;
        }

        //output
        System.out.println(name + ", your age is " + age);
        System.out.println("you have " + retirementyear + " years left to retirement");
        System.out.println("your estimated net worth is " + networth);
    }
}
