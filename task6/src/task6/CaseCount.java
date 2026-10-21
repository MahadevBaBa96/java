package task6;
import java.util.Scanner;
public class CaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper = 0, lower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                upper++;
            else if (Character.isLowerCase(str.charAt(i)))
                lower++;
        }
        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);

	}

}
