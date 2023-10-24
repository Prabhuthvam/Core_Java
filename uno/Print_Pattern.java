package uno;

import java.util.Scanner;

public class Print_Pattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n = sc.nextInt();
		int i,j;
		for(i=0;i<=n;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
