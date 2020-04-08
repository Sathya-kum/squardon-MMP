package MMPprojectAssignment;

import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P_RegisterPatientPage {
	WebDriver driver;

	public P_RegisterPatientPage(WebDriver driver) {
		this.driver = driver;

	}

	public HashMap<String, String> personalDeatils() throws InterruptedException {
		Random rnd = new Random();
		HashMap<String, String> hMap = new HashMap<String, String>();

		// fname
		WebElement fn = driver.findElement(By.id("firstname"));
		fn.sendKeys("Winter");
		hMap.put("Fname", fn.getAttribute("value"));

		// lname
		WebElement ln = driver.findElement(By.id("lastname"));
		ln.sendKeys("Ben");
		hMap.put("Lname", ln.getAttribute("Value"));

		// DOB
		WebElement db = driver.findElement(By.id("datepicker"));
		db.sendKeys("10/20/2000");
		hMap.put("DOB", ln.getAttribute("Value"));

		// licence
		WebElement license = driver.findElement(By.id("license"));
		long li = rnd.nextInt(99999999);
		license.sendKeys("" + li);
		// license.sendKeys("79580295");
		hMap.put("License", license.getAttribute("Value"));

		// ssn
		WebElement sSN = driver.findElement(By.id("ssn"));
		sSN.sendKeys("789124865");
		hMap.put("SSN", sSN.getAttribute("Value"));

		// Address
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("1078,Main Street");
		hMap.put("Address", address.getAttribute("Value"));

		// Age
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("30");
		hMap.put("Age", age.getAttribute("Value"));

		// City
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Tampa");
		hMap.put("City", city.getAttribute("Value"));

		// State
		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys("Florida");
		hMap.put("State", state.getAttribute("Value"));
		Thread.sleep(3000);

		// Zipcode
		WebElement zipcode = driver.findElement(By.id("zipcode"));
		zipcode.sendKeys("55133");
		hMap.put("ZipCode", zipcode.getAttribute("Value"));

		// weight
		WebElement weight = driver.findElement(By.id("weight"));
		weight.sendKeys("50");
		hMap.put("Weight", weight.getAttribute("Value"));

		// height
		WebElement height = driver.findElement(By.id("height"));
		height.sendKeys("160");
		hMap.put("Height", height.getAttribute("Value"));

		return hMap;

	}

	public HashMap<String, String> accountDetails(String username, String password) throws InterruptedException {
		HashMap<String, String> hMap = new HashMap<String, String>();

		// Enter the Email
		WebElement emailTxtField = driver.findElement(By.id("email"));
		emailTxtField.sendKeys("sumben@gmail.com");
		hMap.put("email", emailTxtField.getAttribute(("value")));

		// UserNAme
		WebElement usernameTxtField = driver.findElement(By.id("username"));
		usernameTxtField.sendKeys(username);
		hMap.put("username", usernameTxtField.getAttribute(("value")));

		// Password
		WebElement passwordTxtField = driver.findElement(By.id("password"));
		passwordTxtField.sendKeys(password);
		hMap.put("password", passwordTxtField.getAttribute(("value")));

		// Confirm Psw
		WebElement confirmpasswordTxtField = driver.findElement(By.id("confirmpassword"));
		confirmpasswordTxtField.sendKeys(password);
		hMap.put("confirmpassword", confirmpasswordTxtField.getAttribute(("value")));

		// security
		new Select(driver.findElement(By.id("security"))).selectByVisibleText("what is your best friend name");

		// AnswerField
		WebElement answerTxtField = driver.findElement(By.id("answer"));
		answerTxtField.sendKeys("Maya");
		hMap.put("answer", answerTxtField.getAttribute(("value")));

		WebElement save = driver.findElement(By.xpath("//input[@name='register']"));
		save.click();

		// Accept Ok In pop up
		Alert alt = driver.switchTo().alert();
		String successMsg = alt.getText();
		alt.accept();
		hMap.put("message", successMsg);

		return hMap;

	}

}
