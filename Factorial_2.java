package uno;

public class Factorial_2 {
static long fact(int n){// 1
		
		if(n == 1 ) return 1;
		else  return n * fact(n-1);// 5 * 4 * 3  
		// fact(4)---> 4 * 3 * 2 * 1
		// fact(3)---> 3 * 2 * 1
		// fact(2)---> 2 * fact(1)
		// fact(1)--->1
	}
	
	public static void main(String[] args) {
	
	// recursion
		
		int n =5;// 5!--- 5 * 4 * 3 * 2 * 1---120
		System.out.println("Factorial of " +n + " is " +fact(n));
		
	}

}
