import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_present_test {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.jqueryui.com/droppable/");
		
		List<WebElement> selectedMenu =driver.findElements(By.linkText("Selectable"));
		
		if(selectedMenu.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element Not present");
		
		}
		
		List<WebElement> Link =driver.findElements(By.id("draggable"));
		
		if(Link.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element Not present");
		
		}
		
		driver.switchTo().frame(0); 	// Index -Uses integer. like for frame 0, frame 1 , frame 2......
		//driver.switchTo().frame("");	// string - uses Id only. 
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); 	// WebElement - like uses By.xpath or By.id or By.classname......
		System.out.println("============After Switching to Frames============");
		
		selectedMenu =driver.findElements(By.linkText("Selectable"));
		
		if(selectedMenu.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element Not present");
		
		}
		
		Link =driver.findElements(By.id("draggable"));
		
		if(Link.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element Not present");
		
		}
		
		driver.switchTo().defaultContent();
		System.out.println("==========Default content / Main Page===============");

		selectedMenu =driver.findElements(By.linkText("Selectable"));
		
		if(selectedMenu.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element Not present");
		
		}
		
		Link =driver.findElements(By.id("draggable"));
		
		if(Link.size()>0) {
			System.out.println("Element is Present");
		}else {
			System.out.println("Element Not present");
		
		}
		

	}

}
