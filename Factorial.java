package uno;

public class Factorial {

	static long fact(int n){
		long res = 1;
		for(int i=1;i<=n;i++) {
			res = res * i;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
	
	// recursion
		
		int n =5;// 5!--- 5 * 4 * 3 * 2 * 1---120
		System.out.println("Factorial of " +n + " is " +fact(n));
		
	}

}
