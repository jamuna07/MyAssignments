package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Enter a user name and password.
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on the "Phone" tab. 
		driver.findElement(By.linkText("Phone")).click();
		//Enter the phone number. 
		
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("234");
		driver.findElement(By.name("phoneNumber")).sendKeys("234");
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(1000);
		//Click the first resulting lead.
		//driver.findElement(By.xpath("//a[contains(text(),'10066')]")).click();
		String firstLead=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The first lead is "+firstLead);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click the "Delete" button.
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		//Click "Find leads" again.
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLead);
		
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
		
		String presence=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		
		System.out.println(presence);
		
		driver.close();
		
		
	}

}
