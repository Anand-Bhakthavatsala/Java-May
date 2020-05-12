package Guvi;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test	
	public void bye()
	{
		System.out.println("bye");
	}
	
	@Test(groups="smoke")
	public void goodbye()
	{
		System.out.println("Goodbye");
	}
	
	@BeforeTest
	public void btest()
	{
		System.out.println("Before test annotation");
	}
	
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void amethod()
	{
		System.out.println("After method");
	}

}
