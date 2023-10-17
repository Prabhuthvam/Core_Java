package uno;

import java.util.Scanner;

public class Vowels_In_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String :");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			//if(str.charAt(i)=='a'||'e'||'i'||'o'||'u')
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| 
			   str.charAt(i)=='o'|| str.charAt(i)=='u')	
			System.out.println("The String "+str+" has Vowel "+str.charAt(i)+ " at " +i);

		}
	}

}
