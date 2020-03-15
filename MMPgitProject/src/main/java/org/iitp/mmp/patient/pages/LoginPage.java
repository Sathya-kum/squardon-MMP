package org.iitp.mmp.patient.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import MM_healthcare.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver driver;
	 
	public LoginPage(WebDriver driver)
	{
		
			  this.driver = driver;
			
	}
   
   
 //login 
 	public boolean  login(String userName, String password) {

 	driver.findElement(By.id("username")).sendKeys(userName);

 	driver.findElement(By.id("password")).sendKeys(password);

 	driver.findElement(By.name("submit")).click();

 	return false;
 	}

 	
 		
 		
 		
}


