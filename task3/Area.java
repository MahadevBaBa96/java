
import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        double area = l * b;

        System.out.println("Area of Rectangle = " + area);
        sc.close();
    }
}