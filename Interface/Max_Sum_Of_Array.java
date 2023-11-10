package interfaces;

public class Max_Sum_Of_Array {

	public static void main(String[] args) {
		/*For a given array of integers (positive and negative) 
		 find the largest sum of a contiguous sequence
		{10,20,-3,5,0,1,-11,55,-77}---
		// 10+20+5+1+55-91
		 * -3-11-77--91
		 * 0
		 * 77
		 */
int[] arr = {4,6,8,-2,-10,50,-100,60};
		
		int botSize =arr.length;
		int maxSum = 0;
		int eachSubArrMax =0;
		
		for(int top=0;top<arr.length;top++) {
			botSize =arr.length;
			while(botSize != top) {
				System.out.println("");
				eachSubArrMax =0;
				for(int bot=top;bot<botSize;bot++) {
					eachSubArrMax = eachSubArrMax+arr[bot];
					System.out.print(arr[bot]+",");
				}// for
				if(eachSubArrMax > maxSum) {
					maxSum = eachSubArrMax;
				}// if
				System.out.print("Max value of Array = "+maxSum);
				botSize--;
			}// while
				
		}// for
		
		System.out.println(" Max Value Of Array = "+maxSum);
	}

}
