package week1.day2;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=121;
		int output=0;
		int rem=0;
		for(int i=input;i>0;i=i/10)
		{
			 rem=i%10;
			 output=(output*10)+rem;
			 
			 
			
		}
		 if (output==input) {
				System.out.println("Then number is a palindrome");
				
			} else {
				System.out.println("Then number is not a palindrome");
				
			}

	
		
	}

}
