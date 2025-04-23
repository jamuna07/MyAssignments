package week4.day1;

public class JavaConnection extends MySqlConnection {
	
	public void connect() {
		System.out.println("Connect1");
		
	}

	public void disconnect() {
		System.out.println("Disconnect1");
		
	}

	public void executeUpdate() {
		System.out.println("executeUpdate1");
		
	}

	public static void main(String[] args) {
		JavaConnection executionJava=new JavaConnection();
		executionJava.connect();
		executionJava.disconnect();
		executionJava.executeUpdate();
		executionJava.executeQuery();

	}

	
}
