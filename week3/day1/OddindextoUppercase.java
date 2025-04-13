package week3.day1;

public class OddindextoUppercase {

	public static void main(String[] args) {
		//initialise string value
		String text1="changeme";
		//convert to lowercase
		text1.toLowerCase();
		//converting string to character array
		char[] strArray=text1.toCharArray();
		
		//iterating to change odd index character to capital letter
		for(int i=1;i<strArray.length;i=i+2) {
			strArray[i]=Character.toUpperCase(strArray[i]);
		}
		System.out.println(strArray);

	}

}
