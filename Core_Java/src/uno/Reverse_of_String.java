package uno;
import java.util.*;

public class Reverse_of_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String That You Want To Reverse:");
		String str = sc.nextLine();
		String rstr="";
		int len=str.length();
		for(int i=len-1;i>=0;i--){
			rstr =rstr + str.charAt(i);
			System.out.println("The Reverse String= "+rstr);

		}
		 
	}

}
