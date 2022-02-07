package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Screenshots implements FrameworkConstants{
	
	public static void getPhoto(WebDriver driver) throws IOException {
		
		String photo=SCREENSHOT_PATH;			
		Date date= new Date();
		String ScreenShotDate=date.toString().replaceAll(":", "-");
		TakesScreenshot takeScreenShot=(TakesScreenshot)driver;
		File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
		File destination= new File(photo+ScreenShotDate+".jpeg");
		FileHandler.copy(source, destination);		
	}

}
