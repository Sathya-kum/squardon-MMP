package com.iit.MMP.Helathcareproject1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
