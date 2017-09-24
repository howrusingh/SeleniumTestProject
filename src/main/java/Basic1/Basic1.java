package Basic1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Basic1 {

	@BeforeSuite
	public void B1_BeforeSuite(){
		System.out.println("B1_BeforeSuite");
	}
	
	@BeforeClass
	public void B1_BeforeClass(){
		System.out.println("B1_BeforeClass");
	}
	
	@BeforeTest
	public void B1_BeforeTest(){
		System.out.println("B1_BeforeTest");
	}
	
	
	@BeforeMethod
	public void B1_BeforeMethod(){
		System.out.println("B1_BeforeMethod");
	}
	
	@BeforeGroups("B1_Group")
	public void B1_BeforeGroup(){
		System.out.println("B1_BeforeGroup");
	}
	
	
	@Test(dependsOnGroups={"B1_Group"})
	public void B1_Method1_Test(){
		System.out.println("B1_Method1_Test_Group");
	}
	
	@Test(groups ={"B1_Group"})
	//@Test
	public void B1_Method2_Test(){
		System.out.println("B1_Method2_Test_Group");
	}
	
	@Test
	public void B1_Method3_Test(){
		System.out.println("B1_Method2_Test_No Group");
	}
	
	@AfterGroups("B1_Group")
	public void B1_AfterGroup(){
		System.out.println("B1_AfterGroup");
	}
	
	@AfterMethod
	public void B1_AfterMethod(){
		System.out.println("B1_AfterMethod");
	}
	
	@AfterTest
	public void B1_AfterTest(){
		System.out.println("B1_AfterTest");
	}
	
	@AfterSuite
	public void B1_AfterSuite(){
		System.out.println("B1_AfterSuite");
	}
	
	@AfterClass
	public void B1_AfterClass(){
		System.out.println("B1_AfterClass");
	}
	

}
