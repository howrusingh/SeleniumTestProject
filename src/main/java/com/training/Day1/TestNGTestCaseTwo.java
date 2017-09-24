package com.training.Day1;
import org.testng.annotations.Test;

public class TestNGTestCaseTwo {
	//priority by (dependsonMethods)
	//to be used in vertical flow
	//combination of both priority n dependsOnMethod but its not working properly as its beta version	

	@Test(dependsOnMethods={"Login"})
	public void Payment(){

	}
	
	@Test
	public void OpenSite(){

	}

	@Test(dependsOnMethods={"OpenSite"},priority = 2)
	public void Login(){

	}

	@Test(dependsOnMethods={"OpenSite"},priority = 7)
	public void FB_Login(){

	}





}
