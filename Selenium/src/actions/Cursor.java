package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cursor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");  //build the path for the driver and chrome browser.
	     WebDriver driver=new ChromeDriver();                                 //it is use the la
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	     driver.manage().window().maximize();              //this is use to maximze the screen window.
	     Actions action=new Actions(driver); 
		 driver.navigate().to("https://www.flipkart.com/");
		   Thread.sleep(2000);                               

		   WebElement move = driver.findElement(By.partialLinkText("Fashion"));
		   Thread.sleep(2000);                               

		   driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		   Thread.sleep(2000);                               

		     action.moveToElement(move).perform();

	}

}
