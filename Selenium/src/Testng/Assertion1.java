package Testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion1 {
  @Test
  public void f() {
	  Reporter.log("hiii",true); 
	  Assert.fail();
  }
}
