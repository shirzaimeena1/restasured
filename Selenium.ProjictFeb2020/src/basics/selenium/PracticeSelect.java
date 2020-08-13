package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// 3. Set implicit wait for 30 sec
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 4. maximize browser
		driver.manage().window().maximize();

		driver.get("http://tek-school.com/retail/");
		
WebElement Desktops	=driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a"));
Desktops.click();
Actions action = new Actions(driver);
action.moveToElement( Desktops).build().perform();

WebElement Showall =driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
	
	action.click(Showall).build().perform();
WebElement SortBy= driver.findElement(By.xpath("//select [@id='input-sort']"));
	
Select select;
select= new Select(SortBy);
select.selectByVisibleText("Name (Z - A)");

	}
	

}
