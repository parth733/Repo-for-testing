import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class_test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ebay.ca");
		
		Actions builder = new Actions(driver);
		
		Thread.sleep(2000);
		
		WebElement Menulist = driver.findElement(By.linkText("Electronics"));
		
		Thread.sleep(2000);
		builder.moveToElement(Menulist).build().perform();
		
		WebElement folder = driver.findElement(By.xpath(".//*[@class='hl-infinite-carousel__container']/div/div[4]/div/div"));
		List<WebElement> allLinks = folder.findElements(By.tagName("a"));
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}

}
