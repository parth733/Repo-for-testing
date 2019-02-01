import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListofWebElements_test {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.ca");
		
		WebElement footer = driver.findElement(By.id("fsr"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
					
		// allLinks.get(0).getText(); Because of WebElements, we use allLinks.get(o).getText() first.
									//that means when we use multiple no. of webElements we first use get(0) to get first webelement from the weblist and then we use getText(). 
		// allLinks.get(1).getText();
		//
		//
		// allLinks.get(41).getText();
		
		for(int i=0; i<allLinks.size(); i++){
			System.out.println(allLinks.get(i).getText());
			
		}

	}

}
