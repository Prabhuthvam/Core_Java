package core_java;
import java.util.*;

public class Increment_And_Decrement_Operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a value :");
		a=sc.nextInt();
		//PreIncrement
		int b=++a;
		System.out.println(" b value after PreIncrement b=++a :"+b);
		//PostIncrement
		int c= a++;
		System.out.println(" c value after PostIncrement c=a++ :"+c);
		System.out.println("a value :"+a);

		//PreDecrement
		int d=--a;
		System.out.println(" b value after PreDecrement d=--a :"+d);
		//PostDecrement
		int e=a--;
		System.out.println(" c value after PostDecrement e=a-- :"+e);
		System.out.println("a value :"+a);

		

		

	}

}
