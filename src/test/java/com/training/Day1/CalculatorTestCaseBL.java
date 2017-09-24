package com.training.Day1;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTestCaseBL {
	
	WebDriver driver;
	
	CalculatorBL bl;
	
	
	
	@BeforeMethod
	public void opensite(){
		System.setProperty("webdriver.gecko.driver", "D:\\VidyaRecent\\GridDemo\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.calculator.net/");
		bl= new CalculatorBL(driver);
			
	}
	
	@Test
	public void AddTestCase() throws InterruptedException{
		bl.EnterNum_2();
		Thread.sleep(2000);
		bl.add();
		Thread.sleep(2000);
		bl.EnterNum_4();
		Thread.sleep(2000);
		bl.ClickEqual();
		
		//for two assert statements, result is given of only failed assert, make two methods 
		//Pass	
		Assert.assertEquals("6.", bl.GetResult());
			
		//Fail
		//Assert.assertEquals("12.", bl.GetResult());
	}
	
	@Test
	public void Add_1TestCase() throws InterruptedException{
		bl.EnterNum_2();
		Thread.sleep(2000);
		bl.add();
		Thread.sleep(2000);
		bl.EnterNum_4();
		Thread.sleep(2000);
		bl.ClickEqual();
		
		//for two assert statements, result is given of only failed assert
					
		//Fail
		Assert.assertEquals("12.", bl.GetResult());
	}
	
	
	

}
