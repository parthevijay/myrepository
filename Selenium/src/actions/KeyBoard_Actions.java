package actions;

import java.time.Duration;

import org.openqa.selenium.By;import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");  //build the path for the driver and chrome browser.
	     WebDriver driver=new ChromeDriver();                                 //it is use the la
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
	     driver.manage().window().maximize();  
	     driver.get("https://text-compare.com/");
	     Actions action=new Actions(driver); 
         WebElement IP1 = driver.findElement(By.id("inputText1"));
         action.sendKeys(IP1,"VIJAY").perform();
         Thread.sleep(2000);
         action.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").perform();
         Thread.sleep(2000);
         action.keyDown(Keys.CONTROL).keyDown("c").keyUp("c").perform();
         action.release();
         action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
         
         action.keyDown(Keys.CONTROL).keyDown("").keyUp("v").perform();

         

         
         
        
	     
	}

}
