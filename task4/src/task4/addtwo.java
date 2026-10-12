package task4;
import java.util.Scanner;
public class addtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number1:\t");
		int a = s.nextInt();
		
		System.out.println("enter the number2:\t");
		int b =s.nextInt();
		
		int sum=a+b;
		System.out.println("SUM:"+sum);
		
		s.close();
		

	}

}
