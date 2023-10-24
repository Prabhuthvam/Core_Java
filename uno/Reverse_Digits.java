package uno;

import java.util.Scanner;

public class Reverse_Digits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number That You Want To Reverse:");
		int number = sc.nextInt();
        int Reverse_number = 0;
        while (number != 0) {
            int Last_Digit = number % 10;
            Reverse_number = Reverse_number * 10 + Last_Digit;
            number = number / 10;
        }
        System.out.println(Reverse_number);
		

	}

}
