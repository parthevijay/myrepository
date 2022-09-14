package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement value=driver.findElement(By.name("login"));
	String value1 = value.getCssValue("background-color");
	System.out.println(value1);
	    
	}

}
