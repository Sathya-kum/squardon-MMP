package MMPprojectAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminLoginPage {

	WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void adminLogin(String username, String password) {

		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys(username);
		WebElement passw = driver.findElement(By.id("password"));
		passw.sendKeys(password);
		WebElement sign = driver.findElement(By.xpath("//input[@name='admin']"));
		sign.click();

	}

}
