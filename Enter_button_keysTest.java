import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enter_button_keysTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		driver.findElement(By.id("identifierId")).sendKeys("parth733");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("snvndfb");
		driver.findElement(By.name("password")).sendKeys(Keys.ENTER); // to hit enter directly instead of using "NEXT" or "ENTER" button.

	
	}

}
