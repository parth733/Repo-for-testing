import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_window_test {

	public static void main(String[] args) throws InterruptedException {
		

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1511024311&rver=6.7.6640.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26RpsCsrfState%3dd9d52330-2a95-d4f1-936f-8d97f008e236&id=292841&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=90015");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Privacy & cookies")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		Iterator<String> iter = allwindows.iterator();
		String mainwindow = iter.next();
		String Childwindow = iter.next();
		
		driver.switchTo().window(Childwindow);
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
