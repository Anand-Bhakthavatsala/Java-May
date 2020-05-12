package Guvi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SeleniumDemo2 {

	WebDriver driver=null;
	String browser="chrome";

	@BeforeTest
	public void setUpTest()
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c:/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "c:/drivers/geckodriver.exe");
			driver = new FirefoxDriver(); //upcasting
		}	
	}

	@Test //Annotation in TestNG
	public void googleDemo() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("Automation");		
		input.submit();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	

		String actualtitle= driver.getTitle();
		try
		{
			Assert.assertEquals(actualtitle, "Google Search", "Test executed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test case execution complete");
	}

}
