package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebooklogin {

	public static void main(String[] args) {
		//Instantiate the Browser driver
		ChromeDriver driver=new ChromeDriver();
		//Load the url https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Enter the email id as testleaf.2023@gmail.com 
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter the password as Tuna@321
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Click on the Login button.
		driver.findElement(By.name("login")).click();
		//Click on the �Find your account and log in.� link
		driver.findElement(By.linkText("Find your account and log in.")).click();

	}

}
