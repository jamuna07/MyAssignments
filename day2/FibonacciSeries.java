package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int num1=0;
		int num2=1;
		int sum;
		for (int i = 0; i <range; i++) {
			
			System.out.println(num1);
			sum=num1+num2;
			num1=num2;
			num2=sum;
			
			
			
		}

	}

}
