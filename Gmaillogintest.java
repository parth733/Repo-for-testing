import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmaillogintest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.xpath(".//*[@id='identifierId'and @name='identifier']")).sendKeys("Peddy8656");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@name='password' and @type='password']")).sendKeys("hvgf12");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(3000);
		
		String expectedErrMsg = "Wrong password. Try again.";
		String actualErrMsg = driver.findElement(By.xpath(".//*[@id='password']/div[2]/div[2]")).getText();
		
		if(expectedErrMsg.equals(actualErrMsg)) {
			System.out.println("PASSED");
			driver.findElement(By.xpath(".//*[@name='password' and @type='password']")).sendKeys("H9-couvigence");
			driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
			
		}else {
			System.out.println("FAILED");
		}
			
		
	}

}
