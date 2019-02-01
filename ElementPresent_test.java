import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresent_test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.ca");
		
		/*
		if(driver.findElement(By.linkText("Sign  in")).isDisplayed()) {
			
			// If we use isDisplayed() , it will fail the code if the element is not present and will show error.
			// Instead if we use List<WebElement>, it will not fail the code and continue the if loop and will print else Statement.
			
			System.out.println("Element is Present");
		}else {
			System.out.println("Element is Not Present");
		}
		*/
				

		List<WebElement> element = driver.findElements(By.linkText("Sign in"));	
					
	// If we use isDisplayed() , it will fail the code if the element is not present and will show error.
	// Instead if we use List<WebElement>, it will not fail the code and continue the if loop and will print else Statement.
	
		if (element.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element is not Present");
		}
	}
}
