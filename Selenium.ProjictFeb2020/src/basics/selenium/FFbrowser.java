package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFbrowser {

	public static void main(String[] args) {
		
		// if 
		// Fairforx browser is default browser of selenium we don not need to set system.setProperty
	//	System.setProperty("WebDriver.geckodriver.driver", "c:\\geckodriver.exe");  for some computer that firfox does not work we use this.
	    
		WebDriver driver = new FirefoxDriver();
		// open Test Environment Website 
		driver.get("http://tek-school.com/retail/");
		// Store Website Title in a string and string name is title. method to get website title is .gettitle()
	     String title = driver.getTitle();
	     System.out.println("Website title is " +title);
	  // closed browser   
	    // driver.quit();
	     
		
	}

}
