package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
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
		//Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter a description as "Selenium Automation Tester
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
		//Select "ComputerSoftware" as the industry.
		WebElement industryField= driver.findElement(By.name("industryEnumId"));
		Select dropdown=new Select(industryField);
		dropdown.selectByIndex(2);
		
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownershipField= driver.findElement(By.name("ownershipEnumId"));
		Select dropElement=new Select(ownershipField);
		dropElement.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue
		WebElement sourceField= driver.findElement(By.id("dataSourceId"));
		Select dropSource=new Select(sourceField);
		dropSource.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex
		WebElement marketField= driver.findElement(By.id("marketingCampaignId"));
		Select dropMarketing=new Select(marketField);
		dropMarketing.selectByIndex(5);
		
		//Select "Texas" as the state/province using SelectByValue.
		WebElement stateField= driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropstate=new Select(stateField);
		dropstate.selectByValue("TX");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
		
		driver.close();
		
	}

}
