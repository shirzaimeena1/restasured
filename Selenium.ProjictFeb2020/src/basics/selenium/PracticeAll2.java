package basics.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class PracticeAll2 {

	public static void main(String[] args) {
		

	}
public static void screenShot(WebDriver driver, String location, String address) {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
	FileUtils.copyFile(file, new File(location +fileName+ ".png"));
	
	cathc{
		
	}
	//FileUtils.copyFile(file, new File(location+ fileName+".png"));
}
}
