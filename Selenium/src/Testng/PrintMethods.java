package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrintMethods {
	//to console in print we use System.out.println("hello") method.
	// to print in the report we use Reporter.log("hello") method.
	//too print console as well as report Reporter.log("hello",true) by using this method.



  @Test
  public void f() {
	  //to print message in console
	  System.out.println("hello");
	  
	  //to print message in reoprt.
		 Reporter.log("hello");
		 
//to print message in the console as well as reoprt.
	 Reporter.log("hello",true);
  }
}
