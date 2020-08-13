package basics.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWindowHandling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println("this is berfore switchto" +driver.getTitle());
		
		WebElement searchBus = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchBus.click();
String alrettex	=	driver.switchTo().alert().getText();
System.out.println( alrettex);

driver.switchTo().alert().accept();
Thread.sleep(3000);
		WebElement CRM = driver.findElement(By.xpath("//p[text()='CRM']"));
		
		//
		CRM.click();
		Set <String> WindowHandle = driver.getWindowHandles();
		Iterator<String> it = WindowHandle.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("this is after switchto" +driver.getTitle());
		driver.switchTo().window(parentWindow);
		
		

	}

}
