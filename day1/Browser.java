package week2.day1;

public class Browser {
	
	public String launchBrowser(String browserName) {
		return browserName;

	}
	public String loadURL(String urlName) {
		return urlName;
	}

	public static void main(String[] args) {
		
		Browser name=new Browser();
		Browser app=new Browser();
		System.out.println("Browser launched successfully"+" "+name.launchBrowser("Google"));
		System.out.println("Application url loaded successfully"+" "+app.loadURL("www.google.com"));
		
	

	}	

}
