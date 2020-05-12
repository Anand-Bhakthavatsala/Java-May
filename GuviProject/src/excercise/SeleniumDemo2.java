package excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo2 {

	static WebDriver driver;
	static String browser="chrome";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c:/drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "c:/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); //upcasting
		}		
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("Automation");		
		input.submit();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);	
		String title = "Google Search";
		if (title.equals(driver.getTitle()))
		{
			System.out.println("Title matching");
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("Title not matching");
			System.out.println("Test case failed");
		}
		driver.close();
		
	}

}
