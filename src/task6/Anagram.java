package task6;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
	     String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
	     char[] a = str1.toCharArray();
	     char[] b = str2.toCharArray();
	     Arrays.sort(a);
	     Arrays.sort(b);
	     if (Arrays.equals(a, b))
	    	 System.out.println("Two Strings are Anagrams");
	     else
	         System.out.println("Two Strings are Not Anagrams");

	}

}
