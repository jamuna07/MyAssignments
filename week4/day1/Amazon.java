package week4.day1;

public class Amazon extends CanaraBank {
	

	public void cashOnDelivery() {
		System.out.println("Delivered");
		
	}

	public void upipayments() {
		System.out.println("Payment sucessful");
		
	}

	public void cardPayments() {
		System.out.println("payment deposited");
		
	}

	public void internetBanking() {
		System.out.println("Amount paid via internetbaning");
		
	}

	public static void main(String[] args) {
		Amazon amount=new Amazon();
		amount.upipayments();
		amount.cardPayments();
		amount.cashOnDelivery();
		amount.internetBanking();
		amount.recordPaymentDetails();

	}
}
