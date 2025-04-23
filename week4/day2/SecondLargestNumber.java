package week4.day2;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargestNumber {

	public static void main(String[] args) {
		ArrayList<Integer> array1=new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		Collections.sort(array1);
		System.out.println("Second Largest Number is "+array1.get(array1.size()-2));

	}

}
