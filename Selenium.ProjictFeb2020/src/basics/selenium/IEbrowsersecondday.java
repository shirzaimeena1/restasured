package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.session.InternetExplorerFilter;

public class IEbrowsersecondday {

	public static void main(String[] args)  {
		
		
		// setup systempropery for IE
		// interveiw q what is the challange with IE in Selemium.
		 
		// Ie dont communicate well with webbrowese becase zone are not in same level in secutiry level. sometime we cant open the browser and browse dont close .
		
		System.setProperty("WebDriver.IE.driver", "c:\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://tek-school.com/retail/");
		
		// wait for 5 second
//		try {
//		Thread.sleep(5000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}

		//driver.quit();
	}

}
