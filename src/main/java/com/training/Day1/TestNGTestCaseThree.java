package com.training.Day1;
import org.testng.annotations.Test;

public class TestNGTestCaseThree {
	//priority by (dependsonGroups)
		

		
	@Test
	public void OpenSite(){

	}

	@Test(dependsOnMethods={"OpenSite"})
	public void Login(){

	}

	@Test(dependsOnMethods={"Login"},groups="PaymentValidation")
	public void Payment_Name(){

	}

	@Test(dependsOnMethods={"Login"},groups="PaymentValidation")
	public void Payment_Email(){

	}

	@Test(dependsOnMethods={"Login"},groups="PaymentValidation")
	public void Payment_Mobile(){

	}

	//@Test(dependsOnMethods={"Login","Payment_Name","Payment_Email","Payment_Mobile"})
	@Test(dependsOnGroups={"PaymentValidation"})
	public void Payment(){

	}





}
