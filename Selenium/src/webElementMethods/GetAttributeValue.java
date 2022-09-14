package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue	 {

	public static void main(String[] args) {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("vijayparthe");
	    driver.findElement(By.xpath("//div[text()='Login ']"));
	    
	  
		
		
	}

}
