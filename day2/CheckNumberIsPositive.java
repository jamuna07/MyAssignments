package week1.day2;

import java.awt.peer.SystemTrayPeer;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int version=10;
		if(version>0)
		{
			System.out.println("The number is positive");
		}
		else if(version<0){
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is 0");
		}

	}

}
