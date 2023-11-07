package interfaces;

interface EvenOdd{
	boolean isEven(int num);
}
public class EvenOdd_using_interface {

	public static void main(String[] args) {
		EvenOdd eOdd = 	 (num)->{
			 if(num % 2 == 0) return true;
			 else return false;
		 };
		 
		 boolean res = eOdd.isEven(13);
		 
		 System.out.println(res);
	}

}
