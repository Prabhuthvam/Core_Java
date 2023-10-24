package uno;
import java.util.*;
public class Swapping_WithOut_Variable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value number:");
		int a =sc.nextInt();
		System.out.println("enter b value number:");
		int b =sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//using addition 
		a=a+b;
		b=a-b;
		a=a-b;
	
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
