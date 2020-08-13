package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		// below is list of locators;
		// By.id  = fastest locator 
		//By.name
		// By.className
		//By.classlector - faster
		//By.xpath :  slow but you can travel from parent ot child and child to parent and sibilings.
		//By.linkTex
		//
		System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// syntax for locaotrs:

		//WebElement element name=driver.findElement(By.id("value of id"));
		WebElement username	= driver.findElement(By.id("email"));
		//WebElement element name=driver.findElement(By.name("value of name"));
		WebElement username = driver.findelement(By.name("email"));
		//WebElement element name=driver.findElement(By.className("className"));
		WebElement username= driver.findElement(By.className("inputtext login_form_input_box"));
		
		//WebElement element name=driver.findElement(By.classlector("classlector"));
		WebElement username= driver.findElement(By.cssSelector("input[name='email']"));
		//WebElement element name=driver.findElement(By.xpath("xpath"));
		
		WebElement username = driver.findElement(By.xpath(" //input[@id='email']"));
		
		// xpath syntax
		//input[@atribute='value ']
		// if there is no id and name we can use linkText
		
		// driver.findElement(By.linkText(" value ")
		
		
		
		// we have two 
		
		/*absoulte xpath:
		 * start with single back slash
		 * start from head of Html node and goes all the way to the end of element location.
		 * it is not recommended in automation at all. cus if developer change anything in future then it will effect the test script that we have wrote and that would not work.
		 */
		/* Relative xpath:
		 * start with double back slash
		 * start from tag of Html nod
		 * easy syntax
		 * fast
		 * recommend in automation.
		 */
		//WebElement element name=driver.findElement(By.linkTex("linkTex"));
	
		
		
		
	
	
	
	

	
	
	
	}

}
