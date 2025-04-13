package week3.day1;

public class Intersection {

	public static void main(String[] args) {
		//initialize two arrays
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		//iterating to find the matching value in both the arrat
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Matching numbers "+a[i]);
				}
				else {
					continue;
				}
			}
		}
	}

}
