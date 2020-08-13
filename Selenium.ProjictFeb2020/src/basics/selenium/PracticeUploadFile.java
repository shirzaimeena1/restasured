package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeUploadFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://xndev.com/display-image/");
		
		WebElement Uploadfile = driver.findElement(By.xpath("//input[@type='file']"));
// two things we should consider while uploading pic 
// 1. we should give the name of out file at the end of path as i put\\ marsopic name becase this pic name was marsopic
//	2. after name we have put the type of file. like in below i put .jpc it is type of file.	
		
	String PicPath= "C:\\Users\\shirz\\OneDrive\\Desktop\\marsopic.jpg";  // this is location of our file right click go to properties and chose the location.
	Uploadfile.sendKeys(PicPath);
	}

}
