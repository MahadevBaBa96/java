package task4;
import java.util.Scanner;
public class votingEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();


	        System.out.print("Are you an Indian citizen? (true/false): ");
	        boolean citizen = sc.nextBoolean();

	        if (age >= 18 && citizen == true) {
	            System.out.println("Eligible for voting");
	        } else {
	            System.out.println("Not eligible for  voting");
	        }
	        sc.close();

	}

}
