package core_java;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value number:");
		int a =sc.nextInt();
		System.out.println("enter b value number:");
		int b =sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c=a;
		a=b;
		b=c;
	
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
