import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobutton_test {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		List<WebElement> categary = driver.findElements(By.xpath("//*[@name='group1']"));
		System.out.println(categary.size());
		
		
		for(int i=0; i<categary.size(); i++) {
			
			System.out.println(categary.get(i).getAttribute("value"));
			
		}
			categary.get(0).click();
			System.out.println("=======================");
			
		for(int i=0; i<categary.size(); i++) {
				
			if(categary.get(i).isSelected()) {
				System.out.println(categary.get(i).getAttribute("value"));
			}
					
		}
			
			
	}

}
