package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Enter a username and password.
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jamuna");
		//Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter a Title 
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium tester");
		//Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();
		//close the browser
		driver.close();
		

	}

}
