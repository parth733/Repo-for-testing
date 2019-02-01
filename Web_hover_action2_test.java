import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Web_hover_action2_test {


		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait1 = new WebDriverWait(driver,100);
			
			driver.get("http://www.lowes.ca");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			Actions builder = new Actions(driver);
			Thread.sleep(3000);
			
			List<WebElement> popup = driver.findElements(By.id("popUpBox"));
			Thread.sleep(2000);
			if (popup.size()>0) {
				
				driver.findElement(By.className("popBoxCloseNew")).click();
				
				WebElement MainMenu = driver.findElement(By.id("mainTab"));
				Thread.sleep(3000);
				builder.moveToElement(MainMenu).build().perform();
				
				WebElement box = driver.findElement(By.linkText("Furniture"));
				Thread.sleep(2000);
				builder.moveToElement(box).build().perform();
				
				WebElement subLinks = driver.findElement(By.xpath(".//*[@id='Furniture']/div[1]"));
				List<WebElement> types = subLinks.findElements(By.tagName("a"));

				for(int i=0; i<types.size(); i++) {
					
					System.out.println(types.get(i).getText());
					}
				
			}else {
				
				System.out.println("No pop-up Found");
				
				}	
		}
}
