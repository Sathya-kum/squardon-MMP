package MMPprojectAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminUserApprovalPage1 {

	WebDriver driver;
	// WebDriver driver = new ChromeDriver();

	public AdminUserApprovalPage1(WebDriver driver) {
		this.driver = driver;

	}

	public void intialStepLogin() throws Exception {
		// officelogin.click();
		WebElement officelogin = driver.findElement(By.xpath("//a[contains(text(),'Office Login')]"));
		officelogin.click();
		Thread.sleep(3000);

		// Click the login Button
		WebElement login = driver.findElement(By.xpath("//div[@id='welcome']//a[text()='Login']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", login);
		Thread.sleep(3000);
	}

	public void userApproval() throws Exception {
		String name = "summer";

		// Click the user Tab from the Menu
		WebElement us = driver.findElement(By.xpath("//span[contains(text(),' Users')]"));
		us.click();

		// Select the status from the drop down list
		Select pending = new Select(driver.findElement(By.id("search")));
		pending.selectByVisibleText("Pending");
		Thread.sleep(2000);

		// Click-Name in the table
		WebElement wName = driver.findElement(By.linkText(name));
		wName.click();

		// Select the status from the drop down
		Select approve = new Select(driver.findElement(By.id("sapproval")));
		approve.selectByVisibleText("Accepted");
		Thread.sleep(2000);

		// Click Submit button
		WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();

		// Click -Popup button
		driver.switchTo().alert().accept();

		// Admin Logout
		 WebElement logout =
		 driver.findElement(By.xpath("//span[contains(text(),'Logout')]"));
		 logout.click();

	}

	
}
