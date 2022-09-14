package Testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderString {
	//to store string data we use string datatype by using data provider in anocation.
  @DataProvider
  public String[] data() {
	  String[] s= {"vijay","suraj","dhanesh"};
	  return s;
  }
  
  @Test(dataProvider="data")
  public void registerUser(String d) {
	  Reporter.log(d+"registerUser",true);
  }
}
