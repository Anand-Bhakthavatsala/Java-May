package com.test.demo.GuviMavenProject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeTest
	public void btest()
	{
		System.out.println("Before test is called");
	}
	
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before method is called");
	}

	@Test (priority=0, groups= {"smoke","Regression"}) //(priority=2)
	public void login()
	{
		System.out.println("Login to Spicejet");
	}
	
	@Test  (priority=1, groups="Regression") //(priority=1)
	public void zee()
	{
		System.out.println("Zee news");
	}
	
	@Test (priority=2)
	public void welcome()
	{
		System.out.println("Welcome to testng");
		int total = sum(10,20);
		System.out.println("Sum of a & b is "+ total);
		sum(12.0,13.5);
	}
	
	public int sum(int x, int y) 
	 { 
	     return (x + y); 
	 } 	
	
	public void sum(double x, double y) 
	 { 
	     System.out.println(x + y); 
	 } 
	
	

}
