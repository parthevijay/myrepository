
package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		Date date=new Date();
		String time=date.toString().replace(":","-");
		
        WebDriver driver=new ChromeDriver();   
 	   driver.get("https://demo.actitime.com/login.do");
         WebElement sc1=driver.findElement(By.className("atLogoImg"));
         //System.out.println(sc1.getScreenshotAs(OutputType.FILE));   //to get screen shoot for a particular element.
         //Thread.sleep(20000);
          
         /*File sc2=sc1.getScreenshotAs(OutputType.FILE);
         System.out.println(sc2.getAbsolutePath());
         Thread.sleep(10000);*/
         
         //to store permanent screenshot
         
         //for creating a file in permanent image
         File sc3=new File("./screenshot/ss1"+date+".png");
         
         //taking a screenshot and storing it.
         File src=sc1.getScreenshotAs(OutputType.FILE);
         
         //copy pasting screenshot in the file.
         org.openqa.selenium.io.FileHandler.copy(sc3, src);
         
         
         
         
         
         
         
	}

}
