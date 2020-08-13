package basics.selenium;

		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

		public class SelectClassPractice {

			public static void main(String[] args) throws InterruptedException {

				// TODO Auto-generated method stub

				// 1. set system property for chrome browser
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				// 3. Set implicit wait for 30 sec
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				// 4. maximize browser
				driver.manage().window().maximize();

				driver.get("http://tek-school.com/retail/");

				// Webelment of laptop and Notebook and Notebook by xpath
				WebElement laptop_notebookXpath = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));

				// Action Class
				//action class: we use this to mover our mouse, drag and drop.ancd click on the element.
				//we have to creat objict of Action class to mover our carser
				// action class
				//.build ().perform() is mandetory to use in action class.
				Actions action = new Actions(driver);

				// move to element
				
				
				action.moveToElement(laptop_notebookXpath).build().perform();

				// Webelment of Show All Laptops and Notebook by xpath
				WebElement showAllL_N = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));

				// we have two options
				// 1. use .click method
				// 2.action class method to click on WebElement
				action.click(showAllL_N).build().perform();

				Thread.sleep(3000);

				WebElement sortBy = driver.findElement(By.xpath("//select[@id='input-sort']"));

				Select select;

				select = new Select(sortBy);

				select.selectByVisibleText("Name (A - Z)");
Thread.sleep(5000);
				WebElement show = driver.findElement(By.xpath("//select[@id='input-limit']"));

				select = new Select(show);
				select.selectByVisibleText("100");
				Thread.sleep(5000);

				ScreenShotUtility.screenShot(driver, "C:\\Users\\shirz\\eclipse-workspace\\Selenium.ProjictFeb2020\\ScreenShot",
						"dropdown");

			//	driver.close();
				
				
			
				// move to element
				
				// how you handle static drop down?  interview q
				// we use select class to handle drop down 
				// when tag is select we use select class to chose it from drop down


			}

		}

	


