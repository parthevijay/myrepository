package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlwaysRun {
	//always run we will use for to run for every time execution
	//for eg.url or login or logout which are common for all the test cases.
	//only for regression and smoke testing we go for automation testing.
 
	 @BeforeMethod(alwaysRun = true)
	  public void loginUser() {
		  Reporter.log("login user",true);
		  
		  
	  }
	 
	 @Test(groups="updateUser")
	  public void updateUser() {
		  Reporter.log("update user",true);
		  
		  
		  
	  }
	 
	 @AfterMethod(alwaysRun = true)
	  public void LogOutUser() {
		  Reporter.log("Logout user",true);
		  
		  
	  }
}
