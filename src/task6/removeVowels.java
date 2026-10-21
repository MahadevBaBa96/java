package task6;
import java.util.*;
public class removeVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("(?i)[aeiou]", "*");
        System.out.println(str);

	}

}
