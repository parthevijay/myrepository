package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
	//only to execute particualar test we use groups and create xml file of that group and run in xml suit.
	//we use include and exclude to only execute particular test(include) or not execute to particular test.(exclude)
  @Test(groups="smoke")
  public void userRegister() {
	  Reporter.log("user register",true);
	  
  }
  
  @Test(groups="regression")
  public void userDelete() {
	  Reporter.log("user delete",true);
	  
  }
  
  @Test(groups="intergration")
  
  public void userUpdate() {
	  Reporter.log("user update",true);
	  
  }
  }

