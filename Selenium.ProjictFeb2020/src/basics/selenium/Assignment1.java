package basics.selenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Follow below steps to automate Login Test case in Test Environment
		 * 
		 * Test Data:
		 * 
		 * URL: http://tek-school.com/retail/ (Links to an external site.)
		 * 
		 * username: sdet@tekschool.com
		 * 
		 * password: Welcome1
		 * 
		 * Browser: Chrome
		 * 
		 * Maximize browser
		 * 
		 * set pageload timeout
		 * 
		 * set implicit wait
		 * 
		 * Steps to automate :
		 * 
		 * Open Test environment Click on My Account Click on Login Enter user name
		 * Enter Password click on Login button
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement Myaccount = driver.findElement(By.xpath("//span[@class='caret']"));
		Myaccount.click();
		Thread.sleep(5000);
		String ScreenShot="C:\\Users\\shirz\\eclipse-workspace\\Selenium.ProjictFeb2020\\ScreenShot\\";
		ScreenShotUtility.screenShot(driver, ScreenShot, "Myaccountpic");
		
		WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
		Login.click();
		ScreenShotUtility.screenShot(driver, ScreenShot, "loginPic");
		WebElement UserName = driver.findElement(By.xpath("//input[@id='input-email']"));
		UserName.sendKeys("shirzaimeena1@gmail.com");
		ScreenShotUtility.screenShot(driver, ScreenShot, "userName");
		WebElement Password = driver.findElement(By.xpath("//input[@id='input-password']"));
		Password.sendKeys("ABCD");
		ScreenShotUtility.screenShot(driver, ScreenShot, "Password");
		WebElement login = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		login.click();
		

		ScreenShotUtility.screenShot(driver, ScreenShot, "Myaccountpic");
	}

}
