import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class Frame_test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement flink =driver.findElement(By.id("draggable"));
		WebElement sLink = driver.findElement(By.id("droppable"));
			
		Actions builder = new Actions(driver);
		builder.dragAndDrop(flink, sLink).build().perform();
		
		driver.quit();

	}

}
