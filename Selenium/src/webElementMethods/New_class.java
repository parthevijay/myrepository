package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_class {
	public static void main(String []args) {
		System.setProperty("webdriver.chromedriver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("pass")).sendKeys("8668941008");
		driver.findElement(By.id("pass")).sendKeys();
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
