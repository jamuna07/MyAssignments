package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		//initialize the array
		int[] array={1, 4,3,2,8, 6, 7};
		//sorting in ascending order
		Arrays.sort(array);
		//iterating to find the missing value
		for(int i=1;i<array.length;i++) {
			if(i!=array[i-1])
			{
				System.out.println("The missing element is " +i);
				break;
				
				}
			}

	}

}
