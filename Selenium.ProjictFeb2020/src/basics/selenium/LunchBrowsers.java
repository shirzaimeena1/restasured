package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchBrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		// setup seystem property  it ask for two think is key and value both type is String.  in the vlaue we get the pat of chrome driver.exe file 
		System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
		
		
		
		// we need to use webdriver interface to lunch the chrome browser. the second step  to write selenium scrip is to creat webdriver.  
		WebDriver driver = new ChromeDriver();
		
		// manage driver
		driver.manage().window().fullscreen();// it open the browser in full screen and then manimize it back.
		driver.manage().window().maximize(); // to keep the driver in full screen we use this methid
		// pageload time out: till the browese how long it should wait. page is loading but it is not fully open
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// this method say wait for 10 second before throw  timeout exception.
		// Implicit Time wait: what is implcit time wait?
		// we have three type of time wait. the first one is implcit wait
		// implicite wait applies for entire execution time before driver throws an error.
		//for example if we open a browser and we want to click on login buttton so for any reson if the logn in button did not fond for instance if we did not provide any correct xpat so it will wait for 5 second then throuw is exception 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// lunch Chrome browser to navigate to http://tek-school.com/retail/
		
		// how to lunch a website? interview question. 
		//.get method is used to lunch a website 
		driver.get("http://tek-school.com/retail/");
		// we can get the title page: this title page return string and we can verify if we are in correct page.
		// driver.getTitle // since the return type is string so we store it in sring 
		String siteTitle= driver.getTitle();
		System.out.println(siteTitle);
		
		
		// add hard break: we use this method to keep the browser open for 5 second waite.
		
		Thread.sleep(5000);  // 5000 mean hear 5 second.
		
		
		
		
		
		
		
		
		
		
		// how we can close a browser?
		// there is two way to close a browser  driver.clsoe and driver.quite
		// what is different between driver.close and driver .quite?
		// driver.close: will close only one window whcih opened by webdriver
		// driver.quite: will close all window open by webdriver
		
	// always go at the end of scrip the below two method. when we run this it automaticaly close our browswer
		// driver.close();
		 //driver.quit();
	
	}

}
