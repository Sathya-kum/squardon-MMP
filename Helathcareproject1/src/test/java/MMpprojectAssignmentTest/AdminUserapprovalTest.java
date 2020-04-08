package MMpprojectAssignmentTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import MMPprojectAssignment.AdminCreateFee;
import MMPprojectAssignment.AdminLoginPage;
import MMPprojectAssignment.AdminUserApprovalPage;
import MMPprojectAssignment.AdminUserApprovalPage1;
import MMPprojectAssignment.PatientFeesPage;
import MMPprojectAssignment.PatientLogin;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminUserapprovalTest {

	WebDriver driver;

	@Test
	public void userApproval() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");

		// instantiate the user approval page and calling the
		// intialStepsBeforeLogin method
		AdminUserApprovalPage1 ap1 = new AdminUserApprovalPage1(driver);
		ap1.intialStepLogin();
		// ap1.userApproval();
		Thread.sleep(3000);

		// instantiate the admin login page and Calling the admin login method
		AdminLoginPage ap = new AdminLoginPage(driver);
		ap.adminLogin("Thomas_444", "Edison_444");
		Thread.sleep(5000);

		// instantiate the admin createfee and searchpatient page and calling
		// the adminSearchPatient and createFee
		AdminCreateFee cf = new AdminCreateFee(driver);
		cf.adminSearchPatient();
		cf.createFee();

		// profile login
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		PatientLogin pL = new PatientLogin(driver);
		pL.login("summer", "Test123@");

		// instantiate the patientfee page and calling
		// the outstandingFee, payNow and cardDetails method
		PatientFeesPage pF = new PatientFeesPage(driver);
		pF.outstandigFee();
		pF.payNow();
		pF.cardDetails();
		//pF.logout();

	}

}
