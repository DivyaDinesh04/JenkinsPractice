package com.PracticeProject;

import org.testng.annotations.Test;


public class DisplayTest {

	
	@Test(groups = "smoke")
	public void display1Test()
	{
		String browser = System.getProperty("browser");	
		String env = System.getProperty("env");
		System.out.println(browser);
		System.out.println(env);
		System.out.println(" display test1 ");
	}
	
	
	@Test(groups = "regression")
	public void display2Test()
	{
		System.out.println(" display test2 ");
	}
	
	@Test(groups = "regression")
	public void display3Test()
	{
		System.out.println(" display test3 ");
	}
}
