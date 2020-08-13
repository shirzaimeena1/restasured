package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	WebElement FrameHeader	=driver.findElement(By.xpath("(//frame[@scrolling='no'])[3]"));
		driver.switchTo().frame(FrameHeader);
		WebElement header= driver.findElement(By.xpath("h2[text()='Title bar ']"));

		System.out.println(header.getText());
		driver.switchTo().defaultContent();
		
		WebElement bodyFrame = driver.findElement(By.xpath("//frame[@name='navbar']"));
	
		driver.switchTo().frame(bodyFrame);
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		driver.switchTo().defaultContent();
		
		WebElement footer = driver.findElement(By.xpath("//frame[@name='bot']"));
		driver.switchTo().frame(footer);
		
		WebElement footertext =driver.findElement(By.xpath("//h2[text()='Footer ']"));
		System.out.println(footertext.getText());

    driver.close();
	}
	
	
	
	
}
