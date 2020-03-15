package MM_healthcare;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

import org.iitp.mmp.patient.pages.RegisterPatientPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	
	private static final String hasmap = null;
	private static final String keySetValues = null;
	static WebDriver driver;
	@Test
	public void registration() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Maximize the page
		driver.manage().window().maximize();

		// Enter the url
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		RegisterPatientPage regPage = new RegisterPatientPage(driver);
		Random rnd = new Random();
		String username = "testun" + (char)(65+rnd.nextInt(26))  +rnd.nextInt(100);
		String password = "testpd" + (char)(65+rnd.nextInt(26))  +rnd.nextInt(100);
		//Storing the user name and password
		HashMap<String, String> hMap  = regPage.register(username, password);
		Set <String> ketsetvalue = hMap.keySet();
		
		for(String key : ketsetvalue)
		{
			System.out.println("Key is ::"   + key);
			System.out.println("Value is ::" +hMap.get(key));
		}
		
		//Verification of alert
		String expectedMsg = "Thank you for registering with MMP.";
		String actualMsg = hMap.get("message");
		Assert.assertEquals(actualMsg.trim(),expectedMsg.trim());
		
		
		// clicking registration URL
		
		 driver.findElement(By.xpath("//input[@type='button']")).click();
		 
		 // Creating object
		 
		RegisterPatientPage rs = new RegisterPatientPage(driver);
		rs.register("sat2", "Mtest1234");

	}
}
