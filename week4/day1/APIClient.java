package week4.day1;

public class APIClient {
	public void sendRequest(String endpoint) {
		System.out.println("The endpoint is "+endpoint);

	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
		System.out.println("Request is successful");

	}
	public static void main(String[] args) {
		APIClient clientRequest=new APIClient();
		clientRequest.sendRequest("Selenium");
		clientRequest.sendRequest("Google","firefox",true);
	}
}
