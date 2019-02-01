import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown_test {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.ca");
		
		WebElement Menu = driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> categary = Menu.findElements(By.tagName("option"));
		
		System.out.println(categary.size());
		
		for(int i=0; i<categary.size(); i++) {
			
			//System.out.println(categary.get(i).getText()+"========"+categary.get(i).isSelected());
			
			if (categary.get(i).isSelected()) {
				
			System.out.println(categary.get(i).getText()+"========"+categary.get(i).isSelected());
			}
		}
		
		Menu.sendKeys("Automotive");
		System.out.println("===================== After Selection ====================");
		
		for(int i=0; i<categary.size(); i++) {
			
			//System.out.println(categary.get(i).getText()+"========"+categary.get(i).isSelected()); 
			
			if (categary.get(i).isSelected()) {
				
			System.out.println(categary.get(i).getText()+"========"+categary.get(i).isSelected()); 
			
			}	
		}
	/*	
	 For direct selection purpose:
	 
		Select s = new Select(Menu);
		
		s.selectByIndex(10);
		Thread.sleep(2000);
		s.selectByValue("search-alias=hpc");
		Thread.sleep(2000);
		s.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		*/
	}
	
}



