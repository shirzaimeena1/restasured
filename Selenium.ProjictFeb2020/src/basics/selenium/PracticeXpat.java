package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpat {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");	
		driver.getTitle();
		System.out.println(driver.getTitle());
   WebElement Search = driver.findElement(By.xpath("//input[@class =\'gh-tb ui-autocomplete-input\']"));
   Search.sendKeys("Java");
driver.findElement(By.xpath("//input[@id='gh-ac\']")).sendKeys("Java");
driver.findElement(By.id("gh-cat"));

//  how to handle dymanic id? we handle it by contains, start-with or end-with.
// sometime id get change everytime that we refresh id get change.

// id = test_123
// id = test_124

driver.findElement(By.xpath("// input[contains(@id,'tes_']"));
// id = 123_test_t
//id = 123_test
// id = 123_test_test

driver.findElement(By.xpath("//input[end-with(@id,'_test_t')]"));
driver.findElement(By.xpath("//inout[end-with(@id,'_test_tes']"));

//for link custome xpath
// all link tag is a.
driver.findElement(By.xpath("//a[contains(test(),'Search')]")).click();

		
		

	}

}
