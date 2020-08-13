package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	
	// how to handle authentication popup ?
	// sometime wen we open a side it ask for username and password to enter then clik it is called autentication
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		// passing username and password in url to bypass Authentication popup
		// syntax
			//url:http://the-internet.herokuapp.com/basic_auth
		// syntax
			// http://<username>:<password>@the-internet.herokuapp.com/basic_auth
		// how you handle ajake? interview queston by pasing the username and pawwroed on URL 
		// in URL we should pass after http://   username: password and @ rest of URL.
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	String popup=driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(popup);
	// anotherwasy we can deal with Authentication.	
		
//		String userName = "admin";
//		String password = "admin";
//		
//		String url = "http://\"+userName+\":\"+password+\"@\"+\"the-internet.herokuapp.com/basic_auth";
//		//String Url = "http://admin:admin@the-internet.herokuapp.com/basic_auth";
//		driver.get(url);
//		System.out.println(url);
//		
//		driver.get(url);
//		System.out.println(driver.getTitle());

	}

}
