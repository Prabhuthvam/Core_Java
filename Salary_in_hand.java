package uno;

import java.util.Scanner;

public class Salary_in_hand {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Monthly Salary :");
		int salary =sc.nextInt();
		System.out.println("Enter Tax Saving Investment :");
		int Tax_Saving_investment =sc.nextInt();
		int Annual_Salary = salary * 12;
		System.out.println("Annual Salary ="+Annual_Salary);
		int Taxable_Income = Annual_Salary - Tax_Saving_investment;
		System.out.println("Taxable Income ="+Taxable_Income);
		double Tax_payable ,After_Tax,Salary_Per_Month;
		if( Annual_Salary <= 250000) {
			Tax_payable= 0 *Annual_Salary;
			System.out.println("Tax payable(per year)"+Tax_payable);
			After_Tax = Taxable_Income - Tax_payable;
			Salary_Per_Month = (After_Tax / 12);
			System.out.println("Salary in hand(per month)"+Salary_Per_Month);
		}
		else if(Annual_Salary >= 250000 || Annual_Salary <= 500000) {
			Tax_payable= 0.05 * Annual_Salary;
			System.out.println("Tax payable(per year)"+Tax_payable);
			After_Tax = Taxable_Income - Tax_payable;
			Salary_Per_Month = (After_Tax / 12);
			System.out.println("Salary in hand(per month)"+Salary_Per_Month);
			}
		else if(Annual_Salary >= 500000 || Annual_Salary >= 1000000) {
			Tax_payable= 0.2 * Annual_Salary;
			System.out.println("Tax payable(per year)"+Tax_payable);
			After_Tax = Taxable_Income - Tax_payable;
			Salary_Per_Month = (After_Tax / 12);
			System.out.println("Salary in hand(per month)"+Salary_Per_Month);
			
		}
		else if(Annual_Salary >= 1000000){
			Tax_payable= 0.3 * Annual_Salary;
			System.out.println("Tax payable(per year)"+Tax_payable);
			After_Tax = Taxable_Income - Tax_payable;
			Salary_Per_Month = (After_Tax / 12);
			System.out.println("Salary in hand(per month)"+Salary_Per_Month);
			}

		
		
		
	}

}
