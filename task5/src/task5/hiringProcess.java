package task5;
import java.util.Scanner;
public class hiringProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter GD marks: ");
        int g = sc.nextInt();

        if (g >= 60) {
            System.out.print("Enter marks: ");
            int aptitude = sc.nextInt();

            if (aptitude >= 60) {
                System.out.print("Enter Technical Interview marks: ");
                int tech = sc.nextInt();

                if (tech >= 60) {
                    System.out.print("Enter HR Interview marks: ");
                    int hr = sc.nextInt();

                    if (hr >= 60) {
                        System.out.println("Congratulations! You are selected.");
                    } else {
                        System.out.println("Rejected in HR Interview.");
                    }
                } else {
                    System.out.println("Rejected in Technical Interview.");
                }
            } else {
                System.out.println("Rejected in Aptitude.");
            }
        } else {
            System.out.println("Rejected in GD.");
        }

        sc.close();

	}

}
