package week4.day1;

public class Concrete implements DatabaseConnection {
	
	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}
	public static void main(String[] args) {
		
		Concrete execution=new Concrete();
		execution.connect();
		execution.disconnect();
		execution.executeUpdate();
	}

}
