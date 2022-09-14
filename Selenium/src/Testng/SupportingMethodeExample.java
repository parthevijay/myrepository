package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SupportingMethodeExample {
	//
 
	  @BeforeSuite
	  public void registerUser() {
		  Reporter.log("register User",true);
		  
		  
	  }
	  
	  @Test()
	  public void updateTest() {
		  Reporter.log("update Test",true);
		  
		  
	  }
	  
	  @Test()
	  public void deleteUser() {
		  Reporter.log("delete User",true);
		  
		  
	  }
	  
	  @AfterSuite
	  public void logoutUser() {
		  Reporter.log("logout User",true);
		  
		  
	  }
  }

