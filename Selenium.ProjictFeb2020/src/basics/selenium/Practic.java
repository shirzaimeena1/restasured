package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
 System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();

driver.get("https://www.cnn.com/");
  driver.manage().window().fullscreen();
  driver.manage().window().maximize();
  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  String siteTitle = driver.getTitle();
 
  
  if (siteTitle.equals("bcc"))
	  System.out.println(siteTitle + "\t tes is successful");
  else {
	  System.out.println("failed");
  }
 
 
    
    
    
    
    
    
    
    
    
   driver.close();
   driver.quit();//
        
		
	}

}
