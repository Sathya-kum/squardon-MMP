package MM_healthcare;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

//mport org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class sappointment {

	private static final String String = null;
	WebDriver driver;

	public sappointment(WebDriver driver) {

		this.driver = driver;
	}

	public void validateScheduleAppointmentPage() throws Exception {

		// Clicking the schedule appt linkl
		driver.findElement(By.xpath("//span[contains(text(),'Schedule Appointment')]")).click();
		System.out.println("Hello1");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//h3[@class='page-header']")).isDisplayed();
		// System.out.println("Hello2");'

		// Clicking the create New appointment
		driver.findElement(By.xpath("//input[@type ='submit']")).click();
		Thread.sleep(1000);

		// clicking both doctors and book appointment
		driver.findElement(By.xpath("//h4[contains(text(),'Dr.Beth')]//ancestor::ul/following-sibling::button"))
				.click();

		// driver.findElement(By.id("myframe"));
		Thread.sleep(3000);

		// Switching the frame
		driver.switchTo().frame(driver.findElement(By.id("myframe")));

		// Clicking the date text box
		driver.findElement(By.id("datepicker")).click();

		/*
		 * List<WebElement> allDates=driver.findElements(By.xpath(
		 * "//table[@class='ui-datepicker-calendar']//td"));
		 * 
		 * for(WebElement ele:allDates) {
		 * 
		 * String date=ele.getText();
		 * 
		 * if(date.equalsIgnoreCase("28")) { ele.click(); break; }
		 * 
		 * }
		 */

		// Clicking the next in the calendar
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		// Clicking date in the calendar
		driver.findElement(By.linkText("2")).click();

		// Clicking the time
		// driver.findElement(By.id("time")).click();

		// selecting the time
		Select sel = new Select(driver.findElement(By.id("time")));

		// sel.selectByVisibleText(Utility.dateMap().get("day"));
		sel.selectByIndex(1);
		Thread.sleep(2000);

		// check The OK status
		// driver.findElement(By.id("status"));
		// clicking the continue button
		driver.findElement(By.id("ChangeHeatName")).click();

		// switching from frame to default frame
		driver.switchTo().defaultContent();

		// sending the symptoms in the text box
		driver.findElement(By.id("sym")).sendKeys("cough");
		Thread.sleep(3000);

		// Clicking the submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement s = driver.findElement(By.xpath("//table/tbody/tr[1]"));
		System.out.println("Display the  1 row text " + s.getText());

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments["day"].click()");

		// List <WebElement> li = sel.getOptions();
		// li.

	}
}
