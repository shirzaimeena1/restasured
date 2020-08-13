package basics.selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeALLMetthods {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("WebDriver.chrome.driver", "c:// ChromeDriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");    /// headles broswer
//		
//		WebDriver driver = new ChromeDriver(options);		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		driver.findElement(By.xpath("//a[text()='Desktops']")).click();
		WebElement Mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
	Actions action = new Actions(driver);

    Thread.sleep(3000);
    action.moveToElement(Mac).build().perform();
	action.click(Mac).build().perform();
	action.contextClick().build().perform();
	
	WebElement sortby = driver.findElement(By.xpath("//select[@id='input-sort']"));
	Select select;
	select= new Select(sortby);
select.selectByVisibleText("Price (Low > High)");
WebElement show = driver.findElement(By.xpath("//select[@id='input-limit']"));
 select = new Select(show);
 select.selectByVisibleText("75");
 
  List <WebElement>alllinks  =driver.findElements(By.tagName("a"));
  System.out.println(alllinks.size());
  
  for (int i = 0; i<alllinks.size(); i++) {
	String TextOfElement= alllinks.get(i).getText();
	  System.out.println(TextOfElement);
	if (TextOfElement.equals("Desktops")) {
		alllinks.get(i).click();
		break;
		
		
	}
  }
driver.navigate().to("https://learn.canvas.net/login/canvas");
driver.navigate().back();
driver.navigate().forward();
//		
String Location = "C:\\Users\\shirz\\eclipse-workspace\\Selenium.ProjictFeb2020\\ScreenShot\\";	
ScreenShotUtility.screenShot(driver, Location, "Practiceall.png");
	driver.quit();
	
	}

}
