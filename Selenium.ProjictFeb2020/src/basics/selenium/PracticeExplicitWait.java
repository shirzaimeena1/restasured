package basics.selenium;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeExplicitWait {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 driver.get("https://www.facebook.com/");
	 
	 WebDriverWait wait = new WebDriverWait(driver,20);
	 WebElement signin = driver.findElement(By.xpath("//button[@name='login']"));
	wait.until(ExpectedConditions.elementToBeSelected(signin));
	signin.click();
	}	

}
