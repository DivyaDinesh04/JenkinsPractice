package com.PracticeProject;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups = "smoke")
	public void sample1Test()
	{
		System.out.println(" sample test1 ");
	}
	
	@Test(groups = "smoke")
	public void sample2Test()
	{
		System.out.println(" sample test2 ");
	}
	
	@Test(groups = {"smoke","regression"})
	public void sample3Test()
	{
		System.out.println(" new sample test3 ");
		System.out.println(" new sample test4 ");
	}

}
