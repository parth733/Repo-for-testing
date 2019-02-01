import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebookxpathtest1 {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		//driver.findElement(By.xpath(".//*[@aria-label='First name' and @ name='firstname']")).sendKeys("Parth");
		driver.findElement(By.xpath(".//*[@aria-label='Last name' and@name='lastname']")).sendKeys("Patel");
		driver.findElement(By.xpath(".//*[@name='reg_email__' and @aria-label='Mobile number or email']")).sendKeys("4379938030");
		driver.findElement(By.xpath(".//*[@aria-label='New password' and  @name='reg_passwd__']")).sendKeys("dmcsdndv");
		driver.findElement(By.xpath(".//*[@class='mtm _5wa2 _5dbb']/span/span[2]/input")).click();
		driver.findElement(By.xpath(".//*[@type='submit' and @name='websubmit']")).click();
		
		String expectedErrMsg = "What’s your name?";
		String actualMsg = driver.findElement(By.xpath(".//*[@data-testid='undefined']/div/div/div")).getText();
		
		if (expectedErrMsg.equals(actualMsg))
				{
			System.out.println("Passed");
			driver.findElement(By.xpath(".//*[@aria-label='First name' and @ name='firstname']")).sendKeys("Parth");
			driver.findElement(By.xpath(".//*[@type='submit' and @name='websubmit']")).click();
		}else {
			System.out.println("Failed");
		}
		driver.quit();

	}

}
