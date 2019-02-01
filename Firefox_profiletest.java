import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Firefox_profiletest {

	public static void main(String[] args) {
		
		// firefox.exe -profilemanager
		// firefox.exe -p
		
		//
	
	ProfilesIni p1 = new ProfilesIni();
	FirefoxProfile profile = p1.getProfile("parth");
	
	WebDriver driver = new FirefoxDriver(profile);
	driver.get("http://Facebook.com");
	
	}

}
