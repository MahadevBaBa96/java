package task4;
import java.util.Scanner;
public class findArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Shape \n 1.Triangle\t 2.Circle \t 3.Square\t 4.rectangle");
		int ch=s.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter the base and height:");
			double base=s.nextDouble();
			double height=s.nextDouble();
			double area=0.5*base*height;
			System.out.println("AREA:"+area);
		case 2:
			System.out.println("enter the radius:");
			double radius=s.nextDouble();
			double area2=3.14*radius*radius;
			System.out.println("AREA:"+area2);
		case 3:
			System.out.println("enter the base:");
			double b=s.nextDouble();
			double area3=b*b;
			System.out.println("AREA:"+area3);
		case 4:
			System.out.println("enter the breadth and height:");
			double breadth=s.nextDouble();
			double height1=s.nextDouble();
			double area4=breadth*height1;
			System.out.println("AREA:"+area4);
		default:
			System.out.println("INVALID INPUT");
				
			
		}

		s.close();
			

	}

}
