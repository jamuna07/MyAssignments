package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionAutomation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Enter a user name and password.
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the "Login" button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the "CRM/SFA" link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		Set<String> allWindows1=driver.getWindowHandles();
		
		List<String> allTabs=new ArrayList<String>(allWindows1);
		driver.switchTo().window(allTabs.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		driver.switchTo().window(allTabs.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Set<String> allWindows2=driver.getWindowHandles();
		
		List<String> allTabs1=new ArrayList<String>(allWindows2);
		
		driver.switchTo().window(allTabs1.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		
		driver.switchTo().window(allTabs1.get(0));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		Alert mergeAlert=driver.switchTo().alert();
		mergeAlert.accept();
		
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		
		
		
		
		
		
		
		
		
		

	}

}
