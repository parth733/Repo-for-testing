import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Back_and_forwardButton_test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.ca");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Store")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
