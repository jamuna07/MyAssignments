package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops"; 
		String text2="potss";
		//to covert to lower case
		text1.toLowerCase();
		text2.toLowerCase();
		if(text1.length()!=text2.length()){
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		} 
		else 
		{
			//to covert string to character array
			char[] array1=text1.toCharArray();
			char[] array2=text2.toCharArray();
			//System.out.println(array2[1]);
			//sort the array
			Arrays.sort(array1);
			//System.out.println(array1);
			Arrays.sort(array2);
			//System.out.println(array2);
			
			//check condition if both string matches or not
			if(Arrays.equals(array1,array2)){
					System.out.println("The given strings are Anagram");
				}
			else {
					System.out.println("The given strings are not Anagram");
				}

			
		}

	}

}
