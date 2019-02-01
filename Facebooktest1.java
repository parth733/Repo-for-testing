import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooktest1 {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Parth");
		driver.findElement(By.name("lastname")).sendKeys("Parth");
		driver.findElement(By.name("reg_email__")).sendKeys("4379938030");
		driver.findElement(By.name("reg_passwd__")).sendKeys("dbdjhsdbd");
		driver.findElement(By.name("websubmit")).click();

	}

}
