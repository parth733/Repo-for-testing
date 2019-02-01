import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class website_action_test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mississauga.ca/portal/home");
		
		Actions builder = new Actions(driver);
		
		
		WebElement Menulist = driver.findElement(By.xpath(".//*[@id='tnNavHall']"));
		
		Thread.sleep(2000);
		builder.moveToElement(Menulist).build().perform();
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath(".//*[@id='tnNavHallMenu']/a"));
		
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
			
			if (allLinks.get(i).getText().equals("City Clerk's Office")) {
				
				// allLinks.get(i).getText() = string 1 and "City Clerk's Office"(from o/p) = second string
				
				allLinks.get(i).click();
				break; // to break the the  for loop : prevent from getting error bcz of for loop.
			}
		}
		
		

	}

}	
