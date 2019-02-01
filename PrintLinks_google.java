import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintLinks_google {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "S:/Work/SeleniumJars/chromedriver.exe");	
		//ChromeDriver driver = new ChromeDriver();	
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://google.ca");
		driver.findElement(By.className("gsfi")).sendKeys("Canada");
		Thread.sleep(3000);	
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='sbse0']/div[2]")).getText());
		
		 //String first = ".//*[@id='sbse";
		 //String last = "']/div[2]";
		
		for(int i = 0; i<12; i++) {
			System.out.println(driver.findElement(By.xpath(".//*[@id='sbse'+i+']/div[2]")).getText());

			
			
		//System.out.println(driver.findElement(By.xpath(first+i+last)).getText());
			
			
		}
		
				
   	}
}
