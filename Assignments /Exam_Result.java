package uno;
import java.util.*;
public class Exam_Result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A,B;
		System.out.println("Enter A Subject marks :");
		A=sc.nextInt();
		System.out.println("Enter B Subject Marks :");
		B=sc.nextInt();
		if(A>=55 && B>=45 || A>=45 && B>=55 )
		{
			System.out.println("The Student has passed");
		}
		else if(A>=65 && B<45) {
			System.out.println("The Student has failed but can appear for exam B ");
		}
			else {
				System.out.println("The Student has failed");
		}
	}

}
