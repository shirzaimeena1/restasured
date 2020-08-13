package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfNavigation {

	public static void main(String[] args) throws InterruptedException {

 WebDriver driver = new ChromeDriver();
 
 driver.manage().window().maximize();
 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.get("https://www.ebay.com/");
 Thread.sleep(5000);
 
 driver.getTitle();
 System.out.println(driver.getTitle());
 //driver.navigate().to("https://www.ebay.com/");
 //driver.findElement(By.xpath("//select[@id= 'gh-cat']")).click();
	
 
 driver.navigate().to("https://www.ebay.com/deals");
 Thread.sleep(5000);
 
 driver.navigate().back();
 Thread.sleep(5000);
 driver.navigate().forward();
 Thread.sleep(5000);
	}

	
	}
	
	
	
	


