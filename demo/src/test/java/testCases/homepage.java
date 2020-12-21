package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.browserEngine;

public class homepage {
	
	
	public static WebDriver driver;
	
	
@BeforeTest
	public static void browserSetup()
	{
		driver=browserEngine.getBrowser();
	}
	
	
	@Test
	public static void homepageValidation()	
	{		
	driver.get("https://forum.digitalpoint.tech/");
	
	java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("The number of links is" + " " +  links.size());
	
	}
	@AfterTest 	
	public static void teardown()
	
	{
		driver.quit();
	}

}



