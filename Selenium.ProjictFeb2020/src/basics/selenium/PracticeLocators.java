package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.ebay.com/");
	String siteTitle= driver.getTitle();
	System.out.println(siteTitle);
	driver.quit();
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("\\input[@type='text']")).sendKeys("shoes");
		driver.findElement(By.className("gh-tb ui-autocomplete-input")).sendKeys("Car");

	}

}
