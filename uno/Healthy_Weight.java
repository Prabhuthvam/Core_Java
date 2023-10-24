package uno;
import java.util.*;

public class Healthy_Weight {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		float Weight,Height,BMI;
		double Target_Weight;
		String Gender;
		System.out.println("Enter Gender(Male/Female) :");
		Gender=sc.nextLine();
		System.out.println("Enter Weight(kgs) :");
		Weight=sc.nextFloat();
		System.out.println("Enter Height(Inches):");
		Height=sc.nextFloat();
		System.out.println("Current Weight="+Weight+"kgs");
		BMI=(Weight/(Height*Height));		
		System.out.println("BMI="+BMI);
		
		if(BMI<18.5) {
			System.out.println("Status=UnderWeight");
		}
		else if(BMI>=18.5 || BMI<=24.9) {
			System.out.println("Status=Normal");
		}
		else if(BMI>=25.0 || BMI<=29.9) {
			System.out.println("Status=OverWeight");
		}
		else if(BMI>30.0){
			System.out.println("Status=Obese");
			}
		if(Gender.equalsIgnoreCase("Male")){
			Target_Weight=50.0+2.3*(Height - 60);
		}
		else {
			Target_Weight=45.5+2.3*(Height - 60);
		}
		System.out.println("Target_Weight="+Target_Weight);
		
		double Weight_diff = Weight-Target_Weight;
		
		if(Weight_diff > 0) {
			System.out.println("You must lose"+Weight_diff+"kg to get fit");
		}
		else if (Weight_diff < 0){
			System.out.println("You must gain"+Weight_diff+"kg to get fit");
		}
		else {
			System.out.println("You must lose"+Weight_diff+"kg to get fit");
		}
			
				
	}

}
