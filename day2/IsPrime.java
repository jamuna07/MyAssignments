package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
		int i;
		int count=0;
		for (i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
		    {
				count++;
		        break;
		    }	
		}
		if(count == 0 && number != 1 )
		{
			System.out.println("The number is a Prime");
		}
		else
		{
		   System.out.println("The number is not a Prime");
		}
		

	}

}
