package basics.selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFindElementandElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://tek-school.com/retail/");
		
	WebElement Desktops	=driver.findElement(By.xpath("//a[text()='Desktops']"));
			 Desktops.click();
List <WebElement>alleliments=driver.findElements(By.tagName("li"));

for (int i = 0; i<alleliments.size();i++) {
	
	//data.get(i).getText();
	//data.getText() fo throw tex of element 
	String TextofElimients = alleliments.get(i).getText();
	System.out.println(TextofElimients);
	
	if (TextofElimients.equals("DestTop")) {
		alleliments.get(i).click();
		break;
	
	}
}
			 
	}		 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 


	
	
			 
			 
			 
			 
			 
			 
			 
			 
			 
		
			 
			 
	}


