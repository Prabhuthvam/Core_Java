package uno;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int number = sc.nextInt();
        int temp=number,Reverse_number = 0;
        while (number != 0) {
            int Last_Digit = number % 10;
            Reverse_number = Reverse_number * 10 + Last_Digit;
            number = number / 10;
        }
        if(temp==Reverse_number) {
        System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
        	
	}

}
