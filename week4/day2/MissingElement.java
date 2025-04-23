package week4.day2;

import java.util.ArrayList;
import java.util.Collections;

public class MissingElement {

	public static void main(String[] args) {
		ArrayList<Integer> array3=new ArrayList<Integer>();
		array3.add(1);
		array3.add(2);
		array3.add(3);
		array3.add(4);
		array3.add(10);
		array3.add(6);
		array3.add(8);
		Collections.sort(array3);	
		for(int i=0;i<array3.size()-1;i++) {
			if(array3.get(i)+1!=array3.get(i+1)) {
				System.out.println("The missing element is "+(array3.get(i)+1));
				
			}
		}

	}

}
