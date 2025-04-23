package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		List<String> strArray=new ArrayList<String>();
		strArray.add("HCL");
		strArray.add("Wipro");
		strArray.add("Aspire Systems");
		strArray.add("CTS");
		Collections.sort(strArray);
		Collections.reverse(strArray);
		System.out.println(strArray);

	}

}
