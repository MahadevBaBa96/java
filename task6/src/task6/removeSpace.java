package task6;
import java.util.*;
public class removeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn = new Scanner(System.in);
	        String str = scn.nextLine();
	        str = str.replaceAll("\\s+", "");
	        System.out.println(str);

	}

}
