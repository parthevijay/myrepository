package DataDrivenTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeProgram {

	public static void main(String[] args) throws IOException {
String url=propertyFile.getDataPropertiesFile("url");
System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);

	
	
	
	}

}
