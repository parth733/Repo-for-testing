import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refresh_page_test {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1511024311&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3dd9d52330-2a95-d4f1-936f-8d97f008e236&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		
		String actualMsg = driver.findElement(By.xpath(".//*[@class='has-focus placeholder']")).getText();
		System.out.println(actualMsg);
		
		System.out.println(driver.findElement(By.id("idSIButton9")).getAttribute("value"));
		
		driver.navigate().refresh();


	}

}
