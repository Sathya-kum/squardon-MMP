package MM_healthcare;


	

	import java.util.Calendar;
	import java.util.Date;
	import java.util.HashMap;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	
	public class Utility {

	 static Calendar cal = Calendar.getInstance();
	 Date date = new Date();


	static WebDriver driver;
	// WebElement  userName;

	public Utility(WebDriver driver) {

	this.driver = driver;
	}

	//login
	public static  boolean  login(String userName, String password) {

	driver.findElement(By.id("username")).sendKeys(userName);

	driver.findElement(By.id("password")).sendKeys(password);

	driver.findElement(By.name("submit")).click();

	return false;
	}

	//homepage after logging

	public WebElement  homePgeisDisplayed() {

	return driver.findElement(By.xpath("//h3[@class='page-header']"));

	}

	//Hash Map for Providers

	public static HashMap<String, String> getProvider() {

	HashMap <String,String> providerMAp = new HashMap<String,String>();

	providerMAp.put("Dr1", "Beth");
	providerMAp.put("Dr2", "Charlie");
	providerMAp.put("Dr3", "Smith");
	providerMAp.put("Dr4", "Alexander");
	providerMAp.put("Dr5", "Becky");
	providerMAp.put("Dr6", "Annabeth");
	providerMAp.put("Dr6", "molly");
	providerMAp.put("Dr6", "subramanya");

	return providerMAp;
	}
    
	//Hash Map for Dates
	public static HashMap<String, String > dateMap() {
		
		HashMap <String,String> dateMap = new HashMap<String,String>();

		String s = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		
		//providerMAp.put("day", cal.get(Calendar.DAY_OF_MONTH));

		dateMap.put("day", s);

		//dateMap.put("day", cal.get(Calendar.DAY_OF_MONTH));
		//dateMap.put("month", cal.get(Calendar.MONTH));
		//dateMap.put("year", cal.get(Calendar.YEAR));

	System.out.println("HashMap (Date) = "+  dateMap);

	return dateMap;


	}
	
	
	
	
/*public static HashMap<Integer, Integer > dateMap() {
		
		HashMap <Integer,Integer> dateMap = new HashMap<Integer,Integer>();

		//String s = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));

		
		//providerMAp.put("day", cal.get(Calendar.DAY_OF_MONTH));

		//dateMap.put("day", s);

		dateMap.put(1, cal.get(Calendar.DAY_OF_MONTH));
		//dateMap.put("month", cal.get(Calendar.MONTH));
		//dateMap.put("year", cal.get(Calendar.YEAR));

	System.out.println("HashMap (Date) = "+  dateMap);

	return dateMap;


	}*/
	
	//hashMap for Time
	public static  HashMap<Integer, String> timeMap()
	{
	// you can write in the above way bit in this project we r having only 3 values
	HashMap <Integer, String> timeMAp = new HashMap<Integer, String>();
	timeMAp.put(1, "10Am");
	timeMAp.put(2, "11Am");
	timeMAp.put(3, "12Pm");
	return timeMAp;



	}
	}




