import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_SelectorTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
// For CSS : path formation: 
	//driver.findElementByCssSelector("TagName[attributeName='attributeValue'][attributeName='attributeValue']")
		
		
		// TagName[id='email'] or TagName[class='---']
		// If #email : means its "id" and ".attributeName" means its Class.
		// *[id='email'] : for any TagName
		// TagName[id='email'][class='---'] : to add more attributes. do not use "and".
		// TagName[id*='email'] : "*" means Contains.
		// TagName[id$='email']	: "$" means "Ends with"; means anything that ends with given content.
		// TagName[id^='email']	; "^" means "Starts with"; means anything that starts with given content.
		// TagName[id='email']>tagname>tagname : means to give path from parent tagname to child(destination) tagname.
											// instead of using "/" like in Xpath, use ">" for CSS.
		// TagName[id='email']>tagname[name='email']>tagname 	if there are more "div" inside "div tagname" use that "div's" attribute as well.

		driver.get("http://facebook.com");		

		driver.findElementByCssSelector("input[name='lastname'][aria-label='Last name']").sendKeys("Patel");
		driver.findElementByCssSelector("input[name='reg_email__'][aria-label='Mobile number or email']").sendKeys("4379938030");
		driver.findElementByCssSelector("input[name='reg_passwd__'][aria-label='New password']").sendKeys("dmcsdndv");		
		driver.findElement(By.xpath(".//*[@class='mtm _5wa2 _5dbb']/span/span[2]/input")).click();		
		driver.findElement(By.xpath(".//*[@type='submit' and @name='websubmit']")).click();
		
		String expectedErrMsg = "What’s your name?";
		String actualMsg = driver.findElement(By.xpath(".//*[@data-testid='undefined']/div/div/div")).getText();
		
		if (expectedErrMsg.equals(actualMsg))
		{
			System.out.println("Passed");
			driver.findElementByCssSelector("input[aria-label='First name'][name='firstname']").sendKeys("Parth");
			driver.findElement(By.xpath(".//*[@type='submit' and @name='websubmit']")).click();
		}else {
			System.out.println("Failed");
		}
driver.quit();

	}

}
