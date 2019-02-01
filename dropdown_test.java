import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_test {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://ebay.ca");
		driver.manage().window().maximize();
		
		WebElement Menu = driver.findElement(By.id("gh-cat"));
		List<WebElement> categary = Menu.findElements(By.tagName("option"));
		
		System.out.println(categary.size());
		
		for(int i=0; i<categary.size(); i++) {
			
			if (categary.get(i).isSelected()) {
				
			System.out.println(categary.get(i).getText()+"========"+categary.get(i).isSelected()); //isSelected() is an in-built method 
		//System.out.println(categary.get(i).getText()+"========"+categary.get(i).getAttribute("selected")); ==== for dropdown selection
		//System.out.println(categary.get(i).getText()+"========"+categary.get(i).getAttribute("checked")); ==== for checkbox or radio button	
		//System.out.println(categary.get(i).getText()+"========"+categary.get(i).getAttribute("value")); ==== for input box	
			}
			
		}
		
		Menu.sendKeys("Automotive");
		System.out.println("===================== After Selection ====================");
		
		for(int i=0; i<categary.size(); i++) {
			
			if (categary.get(i).isSelected()) {
				
			System.out.println(categary.get(i).getText()+"========"+categary.get(i).isSelected()); 
			
			}	
		}
		
		/*Select s = new Select(Menu);
		
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByValue("625");
		Thread.sleep(2000);
		s.selectByVisibleText("Books");
		Thread.sleep(2000);*/
		driver.quit();
		
	}
	
}
