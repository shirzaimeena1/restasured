package basics.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**  // this /** if we inter like this it show us all the argument that below method take.
	 * 
	 * @param driver
	 * @param location
	 * @param fileName
	 * @throws IOException 
	 */
	// we are creating this method to use it for screenshot
	
	public static void screenShot(WebDriver driver, String location, String fileName) {

		// Take Screenshot
		// Store Screenshot in a folder or location
// we should creat objict of file class to take screenshot and strore the screenshot.
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// Takescreenshot is a method 
 // FileUtiles class handle all file  and folder point of view 
		// once we take the screen shot we want to copy the screen shot and put it in a new location
		
	
			try {
				FileUtils.copyFile(file, new File(location+ fileName+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		

	}

}



