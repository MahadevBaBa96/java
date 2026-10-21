package task6;
import java.util.*;
public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int count = str.isEmpty() ? 0 : str.split("\\s+").length;
        System.out.println("Words = " + count);

	}

}
