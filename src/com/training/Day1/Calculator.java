package com.training.Day1;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Calculator {

	WebDriver driver;
	
	@BeforeMethod
	public void opensite(){
		System.setProperty("webdriver.gecko.driver", "D:\\VidyaRecent\\GridDemo\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.calculator.net/");
		
			
	}
	
	
	@Test
	public void mul() throws InterruptedException{
		//num1 == 7
		driver.findElement(By.xpath(".//span[@onclick='r(7)']")).click();
		Thread.sleep(5000);
		//add
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='sciop'][text()='+']")).click();
		Thread.sleep(5000);
		//num2 ==5
		driver.findElement(By.xpath(".//span[@onclick='r(5)']")).click();
		Thread.sleep(5000);
		//=
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='scieq'][text()='=']")).click();
		//get num from result box
		Thread.sleep(5000);
		String mul = driver.findElement(By.xpath(".//div[@id='sciOutPut']")).getText();
		
		//Assert.assertEquals("12" ,mul);
		Assert.assertEquals(mul, "12.");
	}
	
	
	
	
	
}
