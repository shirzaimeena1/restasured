package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.cnn.com/");
	String siteTitle=driver.getTitle();
	
	
	
	 if (siteTitle.equals(siteTitle)) {
	 System.out.println(siteTitle +"\t  test is successful");
	 }else {
		 
		System.out.println("test is failed" );
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	 }


}
	
	
	
	
	}

	

