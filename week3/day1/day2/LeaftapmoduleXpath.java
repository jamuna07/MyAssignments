package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapmoduleXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username'])")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password'])")).sendKeys("crmsfa");

	}

}
