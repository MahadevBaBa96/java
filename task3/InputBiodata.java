
import java.util.Scanner;
public class Input_Biodata {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Gender: ");
	        String gender = sc.nextLine();

	        System.out.print("Enter Course: ");
	        String course = sc.nextLine();

	        System.out.print("Enter University: ");
	        String university = sc.nextLine();

	        System.out.print("Enter Year: ");
	        String year = sc.nextLine();

	        System.out.print("Enter Skills: ");
	        String skills = sc.nextLine();

	        System.out.println("        BIO DATA ");
	        System.out.println("Name       : " + name);
	        System.out.println("Age        : " + age);
	        System.out.println("Gender     : " + gender);
	        System.out.println("Course     : " + course);
	        System.out.println("University : " + university);
	        System.out.println("Year       : " + year);
	        System.out.println("Skills     : " + skills);
	        sc.close();
	    }
}