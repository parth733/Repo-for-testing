import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot_test {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.ca");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new File("C:/Users/parth/Pictures/Saved Pictures/Screenshot.png") );
	}
}
