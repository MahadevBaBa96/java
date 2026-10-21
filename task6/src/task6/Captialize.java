package task6;
import java.util.*;
public class Captialize {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (!str.isEmpty())
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(str);
		// TODO Auto-generated method stub

	}

}
