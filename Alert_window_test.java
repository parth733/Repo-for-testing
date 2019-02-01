import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_window_test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		
		Thread.sleep(4000);
		
		Alert a = driver.switchTo().alert();			
		System.out.println(a.getText());
		
		a.accept();		// to click on selected button automatically.
		//a.dismiss();	// to click on non-selected button automatically.
		
	}

}
