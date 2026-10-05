
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(3.5);
        grades.add(2.8);
        grades.add(1.5);
        grades.add(3.7);
        grades.add(2.0);

        int arraysize = grades.size();

        System.out.println("GPA: " + GradesMethods.calculateGPA(grades, arraysize));
        System.out.println("Honors Grades: " + GradesMethods.countHonorsGrades(grades, arraysize));
        System.out.println("Passing Grades: " + GradesMethods.getPassingGrades(grades, 1.99, arraysize));
        System.out.println("Original Grades: " + grades);
        }
        
    }

class GradesMethods {
    public static double calculateGPA(ArrayList<Double> list, int arraysize){
        double meangpa = 0;
        for(int i = 0; i < arraysize; i++){
            double t = list.get(i);
            meangpa = meangpa + t;
        }
        meangpa = meangpa / arraysize;
        return meangpa;
    }
    public static double countHonorsGrades(ArrayList<Double> list, int arraysize){
        double h = 0;
        for(int k = 0; k < arraysize; k++){
            double t = list.get(k);
            if(t > 2.5){
                System.out.println("Grade above 2.5: " + t);
                h++;
            }
        }
        return h;
    }
    public static ArrayList<Double> getPassingGrades(ArrayList<Double> list, double passingGrade, int arraysize){
        ArrayList<Double> passingGrades = new ArrayList<>();
        for(int k = 0; k < arraysize; k++){
            double t = list.get(k);
            if(t > passingGrade){
                passingGrades.add(t);
            }
        }
        return passingGrades;
    }
}
