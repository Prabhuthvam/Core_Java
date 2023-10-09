package core_java;
import java.util.Scanner;

public class Max_Min {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a,b,c,max,min;
			System.out.println("Enter a value :");
			a=sc.nextInt();
			System.out.println("Enter b value :");
			b=sc.nextInt();
			System.out.println("Enter c value :");
			c=sc.nextInt();
			if(a > b) {
				max=a;
				min=b;
			}
			else {
				max=b;
				min=a;
			}
			
			if(c > max) {
				max=c;
			}
			if(c < min) {
				min=c;
			}
			System.out.println("The Max of given numbers :"+max);
			System.out.println("The Min of given numbers :"+min);
			}

}
