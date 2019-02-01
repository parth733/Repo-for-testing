import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait_test {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		// If we have any special Element where we need to wait, use explicit Command. 
		WebDriverWait wait = new WebDriverWait(driver,100);
		// for using Explicit, we have to define a "Class".
		// in Explicit, time rage is in "Seconds" by default.
		
		WebDriverWait wait1 = new WebDriverWait(driver,200);
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		driver.findElement(By.xpath(".//*[@id='identifierId'and @name='identifier']")).sendKeys("Peddy8656");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.xpath(".//*[@name=\"password\" and @type=\"password\"]")).sendKeys("hvgf12");
		
		// If the condition is true it will perform, else it will throw error.
		// If there are 2 special characters, use 2 separate class for it. like wait(1st class) and wait1(2nd class).
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='passwordNext']/content/span")));
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

	}

}
