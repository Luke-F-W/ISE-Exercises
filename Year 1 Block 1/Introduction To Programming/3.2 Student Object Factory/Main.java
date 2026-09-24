import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Students are objects, this makes 2 student objects.
		Scanner myScanner = new Scanner(System.in);
		String option = "";
		Student Obj1 = new Student("", 0, 0.01);
		Student james = new Student("James", 43, 3.98);
		Student molly = new Student("Molly", 21, 3.54);


		do{
			System.out.println("Press 1 to make a student");
			System.out.println("Press 2 to search for a student");
			option = myScanner.nextLine();
		}
		while(!option.equals("1") && !option.equals("2"));
		if(option.equals("1")){
			System.out.println("Enter the students name");
			String nameOfObj = myScanner.nextLine();
			
			System.out.println("Enter the students ID");
			int IDOfObj = myScanner.nextInt();

			System.out.println("Enter the students GPA");
			double GPAOfObj = myScanner.nextDouble();

			Obj1 = StudentFactory.makeStudent(nameOfObj, IDOfObj, GPAOfObj);
			Obj1.displayInfo();

			
		}
		else if(option.equals("2")){
			System.out.println("Please enter the student you would like to search");
			String nametosearch = myScanner.nextLine();
			Obj1.displayInfo();
		}
	}
	

static class Student {
	// Attributes of the object
	private String name;
	private int id;
	private double gpa;
	
	// Constructor to initialize student details
	public Student(String name, int id, double gpa){
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		}
	
	// Silly silly method showing silly silly students info
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("GPA: " + gpa);
	}


}

public class StudentFactory {
	public static Student makeStudent(String name, int id, double GPA){
		Student Obj1 = new Student(name, id, GPA);
		return Obj1;

}
}
}
