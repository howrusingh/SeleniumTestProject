package com.training.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class googleSearch {

	WebDriver driver;
	
	@Test
	public void FirstLinkTest() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		
		WebElement search = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
		search.sendKeys("test");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='rso']//h3[@class='r']/a")).click();
		Thread.sleep(5000);
		//sysout to  check if first link is clicked n read title of link opened
		System.out.println(driver.getTitle());
		
		
		}
		
		
	
}
