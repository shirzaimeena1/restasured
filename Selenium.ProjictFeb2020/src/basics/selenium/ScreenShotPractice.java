package basics.selenium;

 

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 

public class ScreenShotPractice {
	public static void main(String[] args) {
	}
	/**
	 * 
	 * @param driver
	 * @param location
	 * @param fileName
	 * @throws IOException 
	 */
public static void screenShot(WebDriver driver, String location, String fileName) throws IOException {
 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(file, new File(location +fileName+".png"));	
	
	
	//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 //FileUtils.copyFile(file, new File( location+fileName+".png"));
	
 
	
	
	
	
	
	
	
}


}

