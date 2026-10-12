package task4;
import java.util.Scanner;
public class largestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int largest = (num1 > num2) ? num1 : num2;

        System.out.println("Largest Number = " + largest);

        sc.close();

	}

}
