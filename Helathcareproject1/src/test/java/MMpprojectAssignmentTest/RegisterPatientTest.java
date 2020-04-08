package MMpprojectAssignmentTest;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MMPprojectAssignment.PatientLogin;
import MMPprojectAssignment.P_RegisterPatientPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPatientTest {

	WebDriver driver;

	@Test
	public void registerPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Launch The URL
		String url = "http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php";
		driver.get(url);
		
		// Click the register
		WebElement rg = driver.findElement(By.xpath("//input[@value = 'Register']"));
		rg.click();

		// Call the login page
		P_RegisterPatientPage rp = new P_RegisterPatientPage(driver);
		rp.personalDeatils();
		HashMap<String, String> hMap = rp.accountDetails("sumben", "Test123@");
		Thread.sleep(5000);

		/*
		 * //patient Login PatientLogin pl = new PatientLogin(driver);
		 * pl.login("winben", "Test123@");
		 */

		/*
		 * //Verification of alert String expectedMsg =
		 * "Thank you for registering with MMP."; String actualMsg =
		 * hMap.get("message");
		 * Assert.assertEquals(actualMsg.trim(),expectedMsg.trim());
		 */
	}

}
