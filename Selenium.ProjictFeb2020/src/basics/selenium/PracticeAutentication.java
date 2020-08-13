package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			
			System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
driver.get("http://the-internet.herokuapp.com/basic_auth");

driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

String popup = driver.findElement (By.cssSelector("p")).getText();
String ScreenShot ="C:\\Users\\shirz\\eclipse-workspace\\Selenium.ProjictFeb2020\\ScreenShot\\";
	ScreenShotUtility.screenShot(driver, ScreenShot, "Autentication");
	}

}
