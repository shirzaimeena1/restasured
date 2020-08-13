package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeActionandSelect {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		// 3. Set implicit wait for 30 sec
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// 4. maximize browser
		driver.manage().window().maximize();

		driver.get("http://tek-school.com/retail/");
		
WebElement Laptops_Notebooks=driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));

Actions action = new Actions(driver);

action.moveToElement(Laptops_Notebooks).build().perform();

WebElement Showall = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
action.click(Showall).build().perform();

WebElement sortBy = driver.findElement(By.xpath("//select[@id='input-sort']"));

Select select;

select = new Select(sortBy);
select.selectByVisibleText("Name (A - Z");

WebElement show = driver.findElement(By.xpath("//select[@id='input-limit']"));
select = new Select (show);
select.selectByVisibleText("100");




	}

}
