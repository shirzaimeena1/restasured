package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodPratice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://tek-school.com/retail/");
WebElement Cameras= driver.findElement(By.xpath("//a[text()='Cameras']"));

Actions action = new Actions(driver);

action.moveToElement(Cameras).build().perform();
action.doubleClick(Cameras).build().perform();
Thread.sleep(4000);
WebElement DeliverINFO = driver.findElement(By.xpath("//a[text()='Delivery Information']"));		
action.click(DeliverINFO).build().perform();
Thread.sleep(4000);
driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");

WebElement Drag = driver.findElement(By.xpath("//div[@id ='draggable']"));
WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));

action.dragAndDrop( Drag, Drop).build().perform();




	}
}
