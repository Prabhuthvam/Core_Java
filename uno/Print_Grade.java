package uno;
import java.util.*;
public class Print_Grade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Marks:");
		int marks =sc.nextInt();
		String grade = (marks >= 90 && marks <= 100) ? "A" :
			(marks >= 75 && marks <= 89) ? "B" :(marks >= 60 && marks <= 74) ? "C" : "F";
		System.out.println(grade);
		
		
	}

}
