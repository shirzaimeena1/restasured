package basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Static dropdown will have Select tag and we can use select class to handle
		// static dropdowns
		// how we gonna handle dynamic dropdown which does not have fixed vlaues?

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		// click on this element
		from.click();
		// clear the value
		from.clear();
		from.sendKeys("wash");
		Thread.sleep(3000);
		from.sendKeys("wash");
		// list of dynamic dropdows opens
		// we need o get list of those elsemenet we need to store list of all child in a list
		// in order to travel from parrent to child after taking the parte xpat we shoudl put farword slas then tag of child and value
		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));

		for (WebElement city : departure) {
			try {
				if (city.getText().trim().contains("WAS"))
					JSUtility.clickElementWithJS(city, driver);
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
		}
		Thread.sleep(3000);
		
		
		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		to.click();
		to.clear();
		to.sendKeys("las");
		
		List <WebElement> arrival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		
		for(WebElement cityArrival: arrival) {
			
			try {
			if (cityArrival.getText().trim().contains("LAS"))  // we have to write in in java script becase list ope in java script
				JSUtility.clickElementWithJS(cityArrival, driver);
			}catch(StaleElementReferenceException e) {
				e.printStackTrace();
			}
			
		}
		
		Thread.sleep(3000);
		
		// select passanger from static dropdown
		
		WebElement numPass = driver.findElement(By.xpath("//*[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(numPass);
		
		// select 9 passanger 
		select.selectByVisibleText("9");
		
		Thread.sleep(3000);
		
		WebElement departureDate = driver.findElement(By.xpath("//input[@name='departDate']"));
		WebElement arrivalDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		
		// departure 06/20/2020 
		String depDate = "05/20/2020";
		// arrival 07/31/2020
		String retDate = "07/31/2020";
		
		// Select calendar date with JSExecutor for Departure date
		JSUtility.selectCalendarDateWithJS(driver, depDate, departureDate);  // the first deptDare  is  from String depDate and the second one is from WebElement
		JSUtility.selectCalendarDateWithJS(driver, retDate, arrivalDate);
		
		Thread.sleep(3000);
		
		searchButton.click();
		
		

		// since you people are bored why you dont automate the arrival to las Vegas and
		// select 9 people so we can party
		// 15 min
		// xpath for arrival and xpath for list of cities
		// - xpath for arrival:
		// //input[@id='reservationFlightSearchForm.destinationAirport']
		// xpath for list of arrival city //ul[@id='ui-id-2']/li
		// unmber of paasangers xpath
		// //*[@id='flightSearchForm.adultOrSeniorPassengerCount']

	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		// how you handle dynamic drop down?
		// how you handle calander?
	// process to automite dynamic drop down?
 // 1. we get locator of element either by (xpath, name, etc)
		
// 2.  we use find element 
// 3 . click on that element
// 4. clear the value	// it mean when we open there is already something in drop down it automatically sometime take our location so we want to clear that first.	
// 5. type value using sendKeys
// 6. once dropdown is open // we have to right clik inside the list  and inspect that and we should take the xpath of parent then travel to child and take it is value.
		
		
		
// 7. store all values of dropdown in a list
// 8. write a loop or itrator
// 9. inside the loop you write an if condition 
// 10 you write logical operator to click on value
// for click you can use JSEexecutor or .click()method
		
		



