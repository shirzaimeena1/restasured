package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
// diferent between driver.get and driver.navigate.to?
	
	/* both do the same task but driver.navigate to we can use to go back and farword
	 * driver.naviagate is faster than driver.get because it does not wait for the page to completley load.
	 * 
	 * 
	 * .
	 */
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. Set system property for chrome browser 
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		
		//2. Create obj of Webdriver that instantiates ChromeBrowser 
		WebDriver driver = new ChromeDriver();
		// maximize browser 
		driver.manage().window().maximize();
		//set pageload time out 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//deletallcookies
		driver.manage().deleteAllCookies();// it delet all the cookeis of the brosers.
	// in automation testing to get a good a clear result we delet all cookies.	
		//driver.get  -- get us to website address
		// driver.navigate.to  get us to website address
		
		driver.get("http://tek-school.com/");
		// click on element // dirver .get open the browser and then wait until that element is visible 
		
		driver.navigate().to("http://tek-school.com/");
		// click on elemeent //driver.navigate dont wait to click on element.
		// wait for 5 sec and then navigate to test environment
		
		Thread.sleep(5000);
		driver.navigate().to("http://tek-school.com/retail/");
		// wait for 5 sec and then navigate to test environment
		Thread.sleep(5000);
		// how you navigat between browsers? interview quesiton 
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}

