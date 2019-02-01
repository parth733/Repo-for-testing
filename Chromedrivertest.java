import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedrivertest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_Jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.xpath(".//*[@aria-label='First name' and @ name='firstname']")).sendKeys("Parth");
		driver.findElement(By.xpath(".//*[@aria-label='Last name' and@name='lastname']")).sendKeys("Patel");
		driver.findElement(By.xpath(".//*[@name=\"reg_email__\" and @aria-label=\"Mobile number or email\"]")).sendKeys("4379938030");
		driver.findElement(By.xpath(".//*[@aria-label=\"New password\" and@name=\"reg_passwd__\"]")).sendKeys("dmcsdndv");
		driver.findElement(By.xpath(".//*[@class=\"mtm _5wa2 _5dbb\"]/span/span[2]/input")).click();
		driver.findElement(By.xpath(".//*[@type='submit' and @name='websubmit']")).click();
		
		Thread.sleep(3000);
		
		String expectedErrMsg = "What’s your name?";
		String actualMsg = driver.findElement(By.xpath(".//*[@data-testid=\"undefined\"]/div/div/div")).getText();
		
		if (expectedErrMsg.equals(actualMsg))
				{
			System.out.println("Passed");
			driver.findElement(By.xpath(".//*[@aria-label='First name' and @ name='firstname']")).sendKeys("Parth");
			driver.findElement(By.xpath(".//*[@type='submit']")).click();
			
		} 		
	}
}
