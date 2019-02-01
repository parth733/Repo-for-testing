import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.ca");
		driver.navigate().forward();
		driver.navigate().back();
			//	driver.navigate().to("http://www.facebook.ca");  
			//	driver.get() and driver.navigate().to() both are same.
			//	driver.navigate() function is different than driver.get()

	}

}
