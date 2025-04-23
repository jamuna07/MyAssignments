package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ListInterface {

	public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.ajio.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
			driver.findElement(By.xpath("//button[@class='rilrtl-button']")).click();
			driver.findElement(By.xpath("//label[@for='Men']")).click();
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			//Get the total number of link
			//List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        //To count the number of links
			//int numberOfLinks = allLinks.size();
			//System.out.println("The number of links is :"+numberOfLinks);
			
			//Print the links
			//List<String> allStrings=new ArrayList<String>();
			
			//for (int i = 0; i < numberOfLinks ; i++) {
				//String text = allLinks.get(i).getText();
				//allStrings.add(text);
				//}
			//System.out.println("The links are: "+allStrings);
			
			

	}

}	
