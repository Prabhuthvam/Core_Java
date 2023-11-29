package interfaces;
import java.util.*;

public class Num_To_Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] singleDigit = {
								"zero","one","two","three","four","five",
								"six","seven","eight","nine"
						  	   };
		String[] twoDigit = {
							 "","elevan","tweleve","thirteen","fourteen","fifteen","sixteen",
							 "seventeen","eighteen","nineteen"
							 };
		String[] tenDigit = {
								"",	"ten","twenty","thirty","fourty","fifty",
								"sixty","seeventy","eighty","ninety"
							};
		
		String inWords = "";
		System.out.println("Pls Enter Number in Between 0---100000000?");
		int num = sc.nextInt();
		
		// 123... 456...999
		int p=1;
		int t = num;
		while(num !=0) {
			num = num/ 10;
			p=p*10;
		}
		p=p/10;
		num = t;
		int r;
		// 719
		// 239
		while(num != 0) {
			r = num / p;//39
			
			if(p==100000000) {
				inWords = inWords + tenDigit[r]+" ";
			}else if(p==10000000) {
				inWords = inWords + singleDigit[r]+" crore ";
			}else if(p==1000000) {
				inWords = inWords + tenDigit[r]+" ";
			}
			else if(p==100000) {
				inWords = inWords + singleDigit[r]+" lakh ";
			}
			else if(p==10000) {
				inWords = inWords + tenDigit[r]+" ";
			}
			else if(p==1000) {
				inWords = inWords + singleDigit[r]+" thousand ";
			}
			else if(p==100) {
				inWords = inWords + singleDigit[r]+" hundred ";
			}
			else if( (p==10) && ((num >=11) && (num <=19)) ) {
				inWords = inWords +" "+ twoDigit[num % 10];
				break;
				//p=0;
				
			}
			else if( p==10) {
				inWords = inWords +" "+ tenDigit[num / 10];// 39 /10---3
				
			}
			else if(p==1) {
				inWords = inWords +" "+ singleDigit[num];// 39 /10---3
					
			}
			num = num % p;// 83
			p= p/10;
		}
		
		System.out.println(inWords);
	}
	
}

