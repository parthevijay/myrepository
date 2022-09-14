package Testng;
//to provide single data we use object as a datatype
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataProviderObject {
  @DataProvider
  public Object[] data() {
	  Object[] s= {1,2,3,'a','b','c',true,false,"hello","hiii"};
	  return s;
  }
  
  @Test(dataProvider="data")
  public void registerUser(Object d) {
	  Reporter.log(d+"registerUser",true);
  }
}
