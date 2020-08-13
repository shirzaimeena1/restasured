package basics.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToCanvis {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://canvas.instructure.com/login/canvas");
		// to find web elemet in UI page we  will use .findElement() method
//  to find element for login
	WebElement email=driver.findElement(By.id("pseudonym_session_unique_id"));
	// find element for password
	// By is a class and there is different locator is availble.
	// WebElement is interface
	WebElement password = driver.findElement(By.id("pseudonym_session_password"));
	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
	// to send a value we will use send keys method
	// to click on a button or element we will use click method
	email.sendKeys("Shirzaimeena1@gmail.com");
	password.sendKeys("Akram@123");
	loginButton.click();
	
	String screenshot ="C:\\Users\\shirz\\eclipse-workspace\\Selenium.ProjictFeb2020\\ScreenSho\\";
	ScreenShotPractice.screenShot(driver, screenshot, "LoginCanvaspic");
	
	}

}
