package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FullScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
    System.setProperty("webdriver.chromedriver","./chromedriver.exe");
    Date date=new Date();
	String time=date.toString().replace(":","-");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    TakesScreenshot ts=(TakesScreenshot)driver;
    Thread.sleep(2000);
    File src=ts.getScreenshotAs(OutputType.FILE);
    File dest=new File("./screenshot/fullscreenshot"+time+".png");
    FileHandler.copy(src, dest);
    
    
    
	}

}
