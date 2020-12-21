package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.browserEngine;

public class iFrameDemo {
	
	public static WebDriver driver;
	
	
@BeforeTest
	public static void browserSetup()
	{
		driver=browserEngine.getBrowser();
	}
	
	
	@Test
	public static void homepageValidation()	
	{		
	driver.get("https://training.digitalpoint.tech/");
	
	driver.findElement(By.xpath("//*[@id='mainNav']/li[7]")).click();
	//driver.findElement(By.xpath("//*[@id='mainNav']/li[7]/a")).click();
	driver.findElement(By.partialLinkText("DevOPs QA Automation")).click();
	
	driver.findElement(By.xpath("//*[@id='datatable-editable']/tbody/tr[1]/td[3]/a")).click();
	
	 driver.switchTo().frame(0);
	
	
	driver.findElement(By.name("email")).sendKeys("nizam@digitalpoint.tech");
	driver.findElement(By.name("password")).sendKeys("abcd1234");
    driver.findElement(By.name("password2")).sendKeys("abcd1234");
	}
	@AfterTest 	
	public static void teardown()
	
	{
		//driver.quit();
	}

}
