package basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeAll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://canvas.instructure.com/login/canvas");
		driver.findElement(By.xpath("//input[@id='pseudonym_session_unique_id']")).sendKeys("shirzaimeena1@gmail.com");
		driver.findElement(By.xpath("//input[@id='pseudonym_session_password']")).sendKeys("Akram@123");
		// explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement find = driver.findElement(By.name(""));
		wait.until(ExpectedConditions.elementToBeClickable(find)).click();
		
		// headlessBrowsers
		
		ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
	
		// how you go between the browsers
	// driver.get and navigate().to
		driver.get("first page");
		driver.navigate().to("second page");
		driver.navigate().back();
		driver.navigate().forward();
		// closeing browser
		driver.close();
		driver.quit();
		
		// get title
		driver.getTitle();
		// get text
		
		
	///// autontication: we pass username and paswored in URL to HANDLE autontication
		// how u deal with ajaks
		String username= "Admin";
		String pasword = "Admin";
		driver.get("http://the-internet.herokuapp.com/basic_auth");
//driver.get("http://username:pasword@rest of URL");// SYNTAX
	driver.get("http:// admin:admin@the-internet.herokuapp.com/basic_auth");			

                 // action class and method
// how we deal with static dropdown list?

	// we have creat objict of action class
	// we shoudl always use .build ().perform () with action class
Actions action = new Actions(driver);

action.click(find).build().perform();
action.moveToElement(find).build().perform();// in drop down lis we can chose someting to move it
action.doubleClick().build().perform();
action.contextClick().build().perform();

WebElement Drag = driver.findElement(By.xpath("//div[@id ='draggable']"));
WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));

action.dragAndDrop( Drag, Drop).build().perform();


// we have to creat objict of Select class
WebElement sortBy= driver.findElement(By.id(""));
Select select = new Select(sortBy);
select.selectByVisibleText("A-Z");

// acount registeration test case// radio button is selected

WebElement radioButon = driver.findElement(By.id(""));
System.out.println(radioButon.isSelected());
if (!radioButon.isSelected()) {
	radioButon.click();
}
WebElement Privacypolicy= driver.findElement (By.id(""));
System.out.println(Privacypolicy.isDisplayed());
WebElement continueButton= driver.findElement (By.id(""));
System.out.println(continueButton.isEnabled());

// different between FindElement and findElemetns?
WebElement singin= driver.findElement(By.id(""));
 List<WebElement>alllinks =driver.findElements(By.tagName("a"));
 System.out.println(alllinks.size());
for (int i = 0; i<alllinks.size(); i++) {
	String alltext= alllinks.get(i).getText();
	System.out.println(alltext);
	if(alltext.equals("desktop")){
		alllinks.get(i).click();
		break;
	}
			
		
}
	
	
	// scrennShot:

// we should creat statice method

public static void screenShot(WebDriver driver, String Location, String FileName) {
	// take the screenshot and store it in file format. take screenshot is interfce
	TakeScreenShot
		
		
		
		
		
		
		

	}

}
