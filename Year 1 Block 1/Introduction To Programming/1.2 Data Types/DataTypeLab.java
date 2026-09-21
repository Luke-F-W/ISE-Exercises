public class DataTypeLab {
    public static void main(String[] args) {

        // ==========================================
        // TASK 1: Fix the Type Mismatches & Overflow
        // ==========================================
        // UNCOMMENT the block below and fix all syntax/compiler errors.
        

        int studentAge = 130;
        long worldPopulation = 8000000000L;
        double pi = 3.14159;
        String initial = "J";
        boolean isEnrolled = true;


        // ==========================================
        // TASK 2: Observe Integer Division vs. Floating Point
        // ==========================================
        double a = 7;
        double b = 2;
        double exactResult = a / b;

        System.out.println("Result of 7 / 2 stored in double: " + exactResult);

        // YOUR FIX FOR TASK 2:
        // Write a new line of code that correctly calculates 7 / 2 as 3.5 
        // using type casting or floating-point literals.


        // ==========================================
        // TASK 3: Primitives vs. Reference Types (Strings)
        // ==========================================
        int x = 10;
        int y = x;
        y = 20;

        String str1 = new String("Java");
        String str2 = str1;
        str2 = "Python";

        System.out.println("x value: " + x);
        System.out.println("str1 value: " + str1);
    }
}
