package Synchronisation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chromedriver","./chromedriver.exe");
	    WebDriver driver=new ChromeDriver();                     //to launch the browser.
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(2000);      //to slow down the speed of the tool is knows as synchronisation.
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
     

     
	}

}
