package Guvi;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prioritizing {

	WebDriver driver;
	//public static void main(String[] args) throws InterruptedException {

	@BeforeTest
	public void browserInvoke()
	{
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}

	@Test (priority=0)
	public void MMT() throws InterruptedException
	{
		// TODO Auto-generated method stub

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	WebDriverWait wait = new WebDriverWait(driver,10);
		//	wait.until(arg0)
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys("Bengaluru");
		Thread.sleep(3000);
		source.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		//source.sendKeys((Keys.ARROW_DOWN,Keys.ENTER);	
		//	driver.close();

	}

	@Test (priority=1)
	public void search() { 

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement inputbox = driver.findElement(By.xpath("//input[@name='q']"));

		Assert.assertTrue(inputbox.isDisplayed());
		inputbox.sendKeys("Selenium"); 

	}

	@AfterTest
	public void close()
	{
		driver.quit();;
	}

	@Test (priority=1)
	public void sum()
	{
		System.out.print("Sum of two 5's =10");
	}

	@Test (priority=0)
	public void subtraction()
	{
		System.out.print("Sum of two 5's =10");
	}

}
