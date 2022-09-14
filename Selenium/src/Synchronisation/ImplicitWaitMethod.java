package Synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chromedriver","./chromedriver.exe");
	    WebDriver driver=new ChromeDriver();                     //to launch the browser.
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   //it will wait until the element find.de
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
     
	}

}

