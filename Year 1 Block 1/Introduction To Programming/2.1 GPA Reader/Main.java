import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Students are objects, this makes 2 student objects.

        System.out.println("please enter the students name");
        String studName = obj.nextLine();
        
        System.out.println("please enter the students age");
        int studAge = obj.nextInt();
        
        // Validate age
        if(studAge == 0){
            System.out.println("You are not 0, you are at least 1");
            studAge = 1;
        } else if (studAge <= -1) {
            studAge = Math.abs(studAge);
        } else if (studAge >= 121) {
            System.out.println("I don't believe you, you are 8 years old now");
            studAge = 8;
        }

        System.out.println("please enter the students qca");
        double studQCA = obj.nextDouble();

        Student Obj1 = new Student(studName, studAge, studQCA);

        // Shows silly students info
        Obj1.displayInfo();
    }


    class Student {
        // Attributes of the object
        String name;
        int age;
        double gpa;

        // Constructor to initialize student details
        public Student(String name, int age, double gpa) {
            this.name = name;
            this.age = age;
            this.gpa = gpa;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            if (age >= 18){
                System.out.println("This person is a legal adult");
            }
            else{
                System.out.println("This person is not a legal adult");
            }
            System.out.println("GPA: " + gpa);
            if (gpa >= 0 && gpa <= 1.99){
                System.out.println("You need to lock in and improve");
            } else if (gpa >= 2 && gpa <= 2.99) {
                System.out.println("Good work");
            } else if (gpa >= 3 && gpa <= 4) {
                System.out.println("Your doing excellent");
            }
            else{
                System.out.println("You entered a false GPA, GPA cant be " + gpa + " you idiot");
            }
        }
    }
}

