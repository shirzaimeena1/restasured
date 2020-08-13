package basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeDynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.click();
		from.clear();
		from.sendKeys("wash");

		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (WebElement city : departure) {
			try {
				if (city.getText().trim().contains("wash"))
					JSUtility.clickElementWithJS(city, driver);
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}

		}

		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		to.click();
		to.clear();
		to.sendKeys("SDQ");
		List<WebElement>arrival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
 for (WebElement arrivalcity:arrival ) {
	 try {
			if (arrivalcity.getText().trim().contains("SDQ"))  // we have to write in in java script becase list ope in java script
				JSUtility.clickElementWithJS(arrivalcity, driver);
			}catch(StaleElementReferenceException e) {
				e.printStackTrace();
			}
			
		}
		WebElement NumP = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(NumP);
		
		
		select.selectByVisibleText("7");
		WebElement departureDate = driver.findElement(By.xpath("//input[@name='departDate']"));
		WebElement arrivalDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		searchButton.click();
		String DepartDate = "06/17/2020";
		String ReturnDate = "06/23/2020";
		JSUtility.selectCalendarDateWithJS(driver, DepartDate, departureDate);
		JSUtility.selectCalendarDateWithJS(driver, ReturnDate, arrivalDate);

	}

}
