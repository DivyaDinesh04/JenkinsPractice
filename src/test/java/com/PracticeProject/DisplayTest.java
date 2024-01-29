package com.PracticeProject;

import org.testng.annotations.Test;

public class DisplayTest {

	
	@Test(groups = "smoke")
	public void display1Test()
	{
		System.out.println(" display test1 ");
	}
	
	
	@Test(groups = "regression")
	public void display2Test()
	{
		System.out.println(" display test2 ");
	}
}
