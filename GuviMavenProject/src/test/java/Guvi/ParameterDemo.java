package Guvi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterDemo {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void invokeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}	
	
	@Test //main
	@Parameters({"URL"})
	public void enterURL(String url)
	{		
		System.out.println("Browser method");
		System.out.println(url);
		
		driver.get(url);
	}
	
	@Test
	@Parameters({"fburl"})
	public void fbURL(String url)
	{
		System.out.println("Browser method");
		System.out.println(url);
		
		driver.get(url);
	}
	
	@AfterTest()
	public void teardown()
	{
		driver.close();
	}

}
