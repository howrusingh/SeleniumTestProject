package com.training.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorBL {

	WebDriver driver;

	public CalculatorBL(WebDriver driver9){
		driver = driver9;
	}
	
	public void EnterNum_1(){
		driver.findElement(By.xpath(".//span[@onclick='r(1)']")).click();
	}

	public void EnterNum_2(){
		driver.findElement(By.xpath(".//span[@onclick='r(2)']")).click();
	}
	
	public void EnterNum_3(){
		driver.findElement(By.xpath(".//span[@onclick='r(3)']")).click();
	}
	
	public void EnterNum_4(){
		driver.findElement(By.xpath(".//span[@onclick='r(4)']")).click();
	}
	
	public void EnterNum_5(){
		driver.findElement(By.xpath(".//span[@onclick='r(5)']")).click();
	}
	
	public void EnterNum_6(){
		driver.findElement(By.xpath(".//span[@onclick='r(6)']")).click();
	}
	
	public void EnterNum_7(){
		driver.findElement(By.xpath(".//span[@onclick='r(7)']")).click();
	}
	
	public void EnterNum_8(){
		driver.findElement(By.xpath(".//span[@onclick='r(8)']")).click();
	}
	
	public void EnterNum_9(){
		driver.findElement(By.xpath(".//span[@onclick='r(9)']")).click();
	}
	
	public void EnterNum_0(){
		driver.findElement(By.xpath(".//span[@onclick='r(0)']")).click();
	}
	
	public void add(){
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='sciop'][text()='+']")).click();
	}
	
	public void sub(){
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='sciop'][text()='–']")).click();
	}
	
	public void mul(){
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='sciop'][text()='×']")).click();
	}
	
	public void div(){
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='sciop'][text()='/']")).click();
	}
	
	public void ClickEqual(){
		driver.findElement(By.xpath(".//*[@id='sciout']//*[@class='scieq'][text()='=']")).click();
	}
	
	public String GetResult(){
		String result = driver.findElement(By.xpath(".//div[@id='sciOutPut']")).getText();
		return result;

	}


}
