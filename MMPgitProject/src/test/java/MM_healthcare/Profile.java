package MM_healthcare;
import org.iitp.mmp.patient.pages.LoginPage;
import org.iitp.mmp.patient.pages.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Profile {
	
	WebDriver driver;
	
	
	@Test
	public void profile() throws Exception{

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
    // Launch The URL 
	driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");

	// Call the login page
	LoginPage lp =new LoginPage(driver);
	lp.login("ria1","Ria12345");
	Thread.sleep(5000);

    // Call the profile page
	ProfilePage pp = new ProfilePage(driver);
	pp.profile();

}
}
