package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiveYoutube {

	public static void main(String[] args) {

  //System.setProperty("Webdriver.chrome.driver", "c:\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.id("Email ")).sendKeys("shirzaimeena@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("Akram@123");
		driver.findElement(By.id("sign")).click();
		

	}

}
