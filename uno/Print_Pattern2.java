package uno;

import java.util.Scanner;

public class Print_Pattern2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n = sc.nextInt();
		int i,j;
		for(i=n;i>=11;i--) {
			for(j=11;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
