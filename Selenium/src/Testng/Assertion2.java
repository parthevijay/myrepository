package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion2 {
	//assertion is use to fail the test intentionally.
  @Test
  public void f() {
	  String s="abc";

	  Assert.assertEquals(s,"abc");
	  Reporter.log("hello",true);
	 Assert.assertEquals(s,"ab");

  }
}
