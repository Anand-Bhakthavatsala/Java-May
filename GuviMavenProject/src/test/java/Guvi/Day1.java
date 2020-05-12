package Guvi;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeSuite
	public void bfsuit()
	{
		System.out.println("Before suite executed");
	}
	
	@AfterSuite
	public void afsuit()
	{
		System.out.println("After suite executed");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("Before test executed");
	}

	@AfterTest
	public void afterteset()
	{
		System.out.println("After test executed");
	}
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("Before class executed");
	}
	
	@AfterClass
	public void afclss()
	{
		System.out.println("After class executed");
	}
	
	@Test
	public void Hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello, welcome to TestNG");
	}
	
	@Test
	public void bye() {
		// TODO Auto-generated method stub
		System.out.println("Bye to TestNG");
	}

	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("After method executed");
	}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("Before method executed");
	}

}
