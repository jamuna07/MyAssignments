package week4.day2;

import java.util.ArrayList;

public class FindIntersectionusingList {

	public static void main(String[] args) {
		ArrayList<Integer> array1=new ArrayList<Integer>();
		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		ArrayList<Integer> array2=new ArrayList<Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		for(int i=0;i<array1.size();i++) {
			if(array1.get(i)==array2.get(i)) {
				System.out.println("The value is equal "+array1.get(i));
			}
		}	

	}

}
