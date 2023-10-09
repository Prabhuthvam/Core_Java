package core_java;
import java.util.*;
public class Biggest_Of_3_Numbers_Using_If {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a value :");
		a=sc.nextInt();
		System.out.println("Enter b value :");
		b=sc.nextInt();
		System.out.println("Enter c value :");
		c=sc.nextInt();
		if(a>=b&&a>=c)
		{
			System.out.println("the a value is greater :"+a);
		}
		else if(b>=c) {
			System.out.println("the b value is greater :"+b);
		}
			else {
				System.out.println("the c value is greater :"+c);
		}
			}

}
