package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvoctionCount {
	//if we give invocation count in anocation  then it will execute that much times
	final int i =4;
  @Test(priority=1,invocationCount=i)   //if we set InvoctionCount then it will test for 4 times.if count give 0 then it will not show anything.
  public void f() {
	  Reporter.log("login user",true);
  }
  @Test(priority=0 ,invocationCount=2)   
  public void f1() {
	  Reporter.log("delete user",true);
  }
  @Test(invocationCount=0)   //if count give 0 then it will not show anything.
  public void f2() {
	  Reporter.log("delete user",true);
  }
}
