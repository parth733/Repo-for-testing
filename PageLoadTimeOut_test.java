import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeOut_test {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// This function is same as Thread.sleep() 
// But it allows execution if the element can be found before given time range and will wait to find element until the maximum time range reached.
		
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);	
// this command will let u wait for 30 secs to load the page, and then it will throw an error.
		
		driver.findElement(By.xpath(".//*[@id=\"identifierId\"and @name=\"identifier\"]")).sendKeys("Peddy8656");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
		driver.findElement(By.xpath(".//*[@name=\"password\" and @type=\"password\"]")).sendKeys("hvgf12");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

	}

}
