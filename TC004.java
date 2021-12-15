package co.uk.advinia.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_AboutUs {
	
	WebDriver driver;   	//instance variable
	
	// shortcut to import jars - CTRL+SHIFT+O
	
	@Parameters("browsername")
	@BeforeMethod
	public void browsercode(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}else
		{
			System.out.println(browsername + " is invalid");
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.advinia.co.uk");
	
	}
	
	
	@Test
	public void tc001()
	{
		System.out.println("TC001");
		
		System.out.println("Title of the page is : "+driver.getTitle());
		System.out.println("URL of the page is : "+driver.getCurrentUrl());
	}

}
