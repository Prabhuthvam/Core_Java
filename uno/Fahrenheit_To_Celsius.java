package uno;
import java.util.*;

public class Fahrenheit_To_Celsius {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Double Fahrenheit , Celsius;
		System.out.println("Enter The Fahrenheit Temparature :");
		Fahrenheit =sc.nextDouble();
		
//USING FLOAT
		/*Fahrenheit =sc.nextFloat();
		Celsius =((Fahrenheit-32)*5)/9;
		System.out.println("The Celsius Temparature is :"+Celsius);*/
		
		Celsius =(Fahrenheit-32)/1.8;
		System.out.println("The Celsius Temparature is :"+Celsius);
		
	} 

}
