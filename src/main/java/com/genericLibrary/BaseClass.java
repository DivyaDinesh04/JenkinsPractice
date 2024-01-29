package com.genericLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	WebDriver driver;
	WebDriverUtils wLib = new WebDriverUtils();
	FileUtils fLib = new FileUtils();
	
	@BeforeClass(alwaysRun = true)
	public void config_BC() throws IOException
	{
		String BROWSER = fLib.readDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("-- invalid browser --");
		}
		
		
		wLib.windowMax(driver);
		Reporter.log("-- launched browser --",true);
	}
	
	
	
	
	@AfterClass(alwaysRun = true)
	public void config_AC()
	{
		driver.quit();
		Reporter.log("-- browser closed --",true);
	}

}
