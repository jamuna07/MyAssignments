package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewaccount {

	public static void main(String[] args) {
		//Instantiate the Browser driver
			ChromeDriver driver=new ChromeDriver();
			//Load the url https://www.facebook.com/
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();				
			//Click on the Create new account button.
			driver.findElement(By.linkText("Create new account")).click();
			//Enter the First name.
			driver.findElement(By.name("firstname")).sendKeys("Jam");
			//Enter the Surname.
			driver.findElement(By.name("lastname")).sendKeys("G");
			//Enter the Mobile number or email address.
			driver.findElement(By.name("reg_email__")).sendKeys("testleaf.2023@gmail.com");
			//Enter the New password.
			driver.findElement(By.name("reg_passwd__")).sendKeys("Tuna@321");
			//Handle all three dropdowns in Date of birth
			//date
			WebElement dayField= driver.findElement(By.id("day"));
			Select dropDay=new Select(dayField);
			dropDay.selectByIndex(2);
			//month
			WebElement monthField= driver.findElement(By.id("month"));
			Select dropMonth=new Select(monthField);
			dropMonth.selectByIndex(5);
			//year
			WebElement yearField= driver.findElement(By.id("year"));
			Select dropYear=new Select(yearField);
			dropYear.selectByIndex(10);
			//Select the radio button in Gender.
			driver.findElement(By.id("sex")).click();
	}

}
