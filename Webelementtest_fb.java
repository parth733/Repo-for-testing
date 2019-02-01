import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelementtest_fb {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		// or WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement Email = driver.findElement(By.name("reg_email__"));
		WebElement Password = driver.findElement(By.name("reg_passwd__"));
		WebElement Confirm = driver.findElement(By.name("websubmit"));
		
		firstname.sendKeys("Parth");
		lastname.sendKeys("Parth");
		Email.sendKeys("4379938030");
		Password.sendKeys("dbdjhsdbd");
		Confirm.click();

	}

}
