package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	//if we not set priority it will in alphabetical order.
	//if we set priority it will execute in that order.(for eg.=0 to n number)
	//if we set priority same again it will print in alphabetical order.
	//if we set minus priority it will execute in that order.(for eg.-5 to 0)
	 @Test
	  public void f0() {
		  

	  }
  @Test
  public void registerUser() {
	  Reporter.log("registerUser",true);  // it will print in alphabetical order.
  }
  
  @Test
  public void deleteUser() {
	  Reporter.log("deleteUser",true);
  }
  
  @Test
  public void UpdateUser() {
	  Reporter.log("UpdateUser",true);
  }
  
  
}
