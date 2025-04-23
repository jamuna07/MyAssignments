package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		//Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter a CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		//Enter a FirstName
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jamuna");
		//Enter a LastName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Devi");
		//Enter a firstlocalName.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("JD");
		//Enter a department
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("tester");
		//enter a description.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium tester");
		//enter a email
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("xyz@gmail.com");
		//to select state/province
		WebElement stateField= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropElement=new Select(stateField);
		dropElement.selectByVisibleText("New York");
		//click on submit button
		driver.findElement(By.name("submitButton")).click();
		//click on edit
		driver.findElement(By.linkText("Edit")).click();
		//clear description
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		//update important note
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("testing");
		//click on update button
		driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		//get title of the page
		String title = driver.getTitle();
		System.out.println(title);
	}

}
