package week4.day2;

import java.util.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//String parentString=driver.getWindowHandle();
		//System.out.println(" "+parentString);
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		List<String> allTabs=new ArrayList<String>(allWindows);
		driver.switchTo().window(allTabs.get(1));
		
		String titleofFlight = driver.getTitle();
		System.out.println("The title of the window is "+titleofFlight);
		
		driver.switchTo().window(allTabs.get(0));
		
		driver.close();
		

	}

}
