import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklist_test {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.ca");
		
		WebElement footer = driver.findElement(By.xpath("//*[@id='pageFooter']/div[2]"));
		
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		
		System.out.println(allLinks.size());

		for(int i=0; i<allLinks.size(); i++) {
		
			System.out.println(allLinks.get(i).getText());
		}
	}

}
