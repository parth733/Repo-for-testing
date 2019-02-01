import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize_browser_test {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jqueryui.com/droppable/");
		
		driver.manage().window().maximize();      // This will maximize the window of browser while execution.
		
	}
	
}
