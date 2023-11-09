package interfaces;

public class Display_Once_Repeated_Num {

	public static void main(String[] args) {
		//Given an array where every element occurs three times, except one element which occurs only once.
				//Find the element that occurs once.
				//Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3} Output: 2

				int arr[]= {12,1,12,3,12,1,1,2,3,3};
				int eachInt;
				int count=0;
				int res=0;

				for (int i = 0; i < arr.length; i++) {
						count=0;
					for (int j = 0; j < arr.length; j++) {
						eachInt=arr[j];
						
						if (arr[i]==arr[j]){
							count++;
						}
					}
					if (count==3)continue;
					else if (count==1) {
						res=arr[i];
					}
				}
				System.out.println("Once Repeated Number is "+res);
			}
		
	}

