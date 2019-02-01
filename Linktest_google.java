import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktest_google {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.ca");
		//driver.findElement(By.linkText("Sign in")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.partialLinkText("Sign ")).click();
		Thread.sleep(5000);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sign in - Google Accounts";
		System.out.println(actualTitle);
		Thread.sleep(2000);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.ca%2F%3Fgws_rd%3Dssl&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.out.println(actualUrl);
		Thread.sleep(2000);
		
		if (actualTitle.equals(expectedTitle) && actualUrl.equals(expectedUrl)) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
	}

}
