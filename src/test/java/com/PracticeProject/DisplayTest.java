package com.PracticeProject;

import org.testng.annotations.Test;

import com.genericLibrary.BaseClass;

public class DisplayTest extends BaseClass{

	
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
	
	@Test(groups = "regression")
	public void display3Test()
	{
		System.out.println(" display test3 ");
	}
}
