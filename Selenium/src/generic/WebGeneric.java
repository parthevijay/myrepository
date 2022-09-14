package generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WebGeneric extends BaseTest {
	public void verifyTitle(String expectedTitle) {
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			Reporter.log("homepage displayed",true);
		}
		else
			Reporter.log("homepage is not displayed",true);
  
  }
}
