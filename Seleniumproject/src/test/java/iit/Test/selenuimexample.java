package iit.Test;

import java.util.List;

import java.util.concurrent.TimeUnit;

//import java.util.List;

// modified1
//modified2
//modified3

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
//import org.testng.collections.Lists;

import io.github.bonigarcia.wdm.WebDriverManager;

// modified

public class selenuimexample {

	/*private static final String pass = null;
	private static final String fail = null;
	private static final String j = null;*/

	@Test
	public void validateSearchresults() throws Exception {

		// Creating a variable
		String expectedresult = "selenium interview questions";
		
		// Instantiate the browser  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// maximize the browser window
        driver.manage().window().maximize();
        
        
        //open the Yahoo URL
		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);*/
		Thread.sleep(1000);
		
		//Enter the "selenuim" word in the search Box
		WebElement textbox = driver.findElement(By.id("header-search-input"));
		textbox.sendKeys("Selenium");
		Thread.sleep(1000);
		
		
		//Waiting for the visiblity of all the elements
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']/li/span"))); 
		
		//Stroing all the auto suggestion list in the variable
		List<WebElement> searchli = driver.findElements(By.xpath("//ul[@role='listbox']//li/span"));
		
		//get the size of the elements
		int size =  searchli.size();
		System.out.println("number of elements in the list :" + size);
		wait.until(ExpectedConditions.visibilityOfAllElements(searchli));
		
		// Displaying each elements in the drop down list
		for (WebElement s1 : searchli) {
			System.out.println(s1.getText());
		
		// if the list contains the expected result the click and get the result
			if (s1.getText().contains(expectedresult)) {
				//wait.until(ExpectedConditions.visibilityOf(s1));
				s1.click();
				break;
			}
		}
		
		
		// All the search results displayed should be gathered
		List<WebElement> searchResults = driver.findElements(By.xpath("//li//h3[@class= 'title']"));
			
        // Finding the number of search list
		/*int searchsize= searchResults.size();
		System.out.println(searchsize);*/
		
		// Display the each element list
		for (WebElement s2 : searchResults) {
			System.out.println(s2.isDisplayed());

		}
		 
		/*JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		*/
		  boolean result =true; 
		List<WebElement> hLinkList=   driver.findElements(By.xpath("//div[@id='web']/ol/li//a"));
		 // List<WebElement> hLinkList=   driver.findElements(By.xpath("//div//h3[@class='title']"));
        for(int i=1;i<=5;i++)
        {
            System.out.println("****************Validating the Links in the Page ::: " + i+"****************************" );
            for(int j=0;j<hLinkList.size()-1;j++)//HyperLinks Text
            {
                    System.out.println(hLinkList.get(j).getText().contains(expectedresult));
                    if(!(hLinkList.get(j).getText().contains(expectedresult)))
                    {
                        result = true;
                        System.out.println("The Link Text:::" + hLinkList.get(j).getText() +"   result:::" + result);    
                    }
                    else
                    {
                    	
                    	result= false;
                    }
              }
            driver.findElement(By.linkText("Next")).click();
            Thread.sleep(1000);
            hLinkList = driver.findElements(By.xpath("//div[@id='web']/ol/li//a"));
        
    }
		
		
		
		

		// to perform Scroll on application using Selenium
		/*JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
*/
		// finally loop over the list and verify each results contains interview
		// questions details
		
		    /*for(int j=0;j<=5;j++){
			  int pass = 0;
			  int fail=0;
			  for(int i=0; i<=searchResults.size() -1; i++)
			  {
				  if(searchResults.get(i).getText().contains("Selenuim Interview Questions")){
					  System.out.println("Expected Results obtain" + i  + " "+searchResults.get(i).getText());
					  pass++;
				  }
				  
				  else
				  {
					  fail = fail+1;
				  }
			  }
		  }
		System.out.println("pages shown  " + j +  "pass" +  pass  + "fail" + fail );
		
            WebElement s3 = driver.findElement(By.xpath("//a[@class='next']"));
            s3.click();
            searchResults = driver.findElements(By.xpath("//li//h3[@class= 'title']"));
            */
        	//for (int i = 0; i <5; i++) {
			 /*driver.findElement(By.linkText("Next")).click();
			 List<WebElement> searchResults1 = driver.findElements(By.xpath("//li//h3[@class= 'title/a']"));
			 searchResults1.contains(searchResults);*/
			 /*System.out.println(searchResults1);
			 int searchsize1= searchResults1.size();
				System.out.println(searchsize1);
				
				// Display the each element list
				for (WebElement s3 : searchResults) {
					System.out.println(s3.getText());*/

				//}
				
			//System.out.println(i);
			//Thread.sleep(1000);
			
			
		//}
			
			
		


	}
	
	}

