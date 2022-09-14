package all;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AllMethods {

	public static void main(String[] args) throws InterruptedException, IOException {
     System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
    
     //to launch the browser and access the methods from webdriver
     WebDriver driver=new ChromeDriver();
     
     //It is Synchronisation method to wait till the element is load and only use for findelement method.it saves time
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     //Manage method is from webdriver interface. and they have some submethods.
     driver.manage().window().maximize();
     Thread.sleep(2000);
     driver.manage().window().minimize();
     Thread.sleep(2000);
     driver.manage().window().fullscreen();
     Thread.sleep(2000);
     driver.manage().window().getPosition();
     Thread.sleep(2000);
     driver.manage().window().getSize();
     Thread.sleep(2000);
     
     //this is get method use to launch the the webpage by providing the url.
     driver.get("https://www.amazon.com/");
     Thread.sleep(2000);
     
     //get currenturl method print the url of current webpage in the console.
     System.out.println(driver.getCurrentUrl());
     Thread.sleep(2000);
     
     //getTitle method will print Title of the current webpage.
     System.out.println(driver.getTitle());
     Thread.sleep(2000);
     //System.out.println(driver.getPageSource());
     
     //This is navigate method from webdriver and they have some submethods.
     driver.navigate().to("https://www.flipkart.com/");
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().refresh();
     Thread.sleep(2000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().to("https://www.facebook.com/");
     Thread.sleep(2000);
     
     //all the locators used(id,name,xpath,tagname,linktext,partiallinktext)
     //driver.findElement(By.xpath("//input[@type=\"submit\"]")).getCssValue("color");
     //Thread.sleep(2000);
     
     
     WebElement username = driver.findElement(By.id("email"));
     Thread.sleep(2000);
     username.sendKeys("vijay");
     Thread.sleep(2000);
     username.clear();
     Thread.sleep(2000);
     username.sendKeys("8668941008");
     Thread.sleep(2000);
     driver.findElement(By.name("pass")).sendKeys("123456789");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     Thread.sleep(5000);
     driver.navigate().to("https://www.amazon.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("(//span[text()=\"All\"])[2]")).click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Electronics")).click();
     Thread.sleep(2000);
     driver.findElement(By.partialLinkText("Cell Phones & Accessories")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//span[text()=\"Sony ZX Series Wired On-Ear Headphones, Black MDR-ZX110\"]")).click();
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     
     //to get the size of x and Y axix for particular element and for to check the alignement
     WebElement width = driver.findElement(By.id("twotabsearchtextbox"));
     Thread.sleep(2000);
     int actual_width=width.getRect().x;
     Thread.sleep(2000);
     int actual_height=width.getRect().y;
     Thread.sleep(2000);
     System.out.println(actual_width);
     Thread.sleep(2000);
     System.out.println(actual_height);
     Thread.sleep(2000);
     
     //for the iframe(to navigate from 1 frame to another frame.
     driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
     Thread.sleep(2000);
     WebElement f1 = driver.findElement(By.name("packageListFrame"));      //finding the frame by name locator go inside and first frame and storing it in f1 varibale.
	 driver.switchTo().frame(f1);                                        //switch to that fram where we giving index(f1) f1=1st frame  but index starting from 0.in f1 we storing frame index which is 0 and using this in switch to statement.
	 driver.findElement(By.xpath("//a[contains(text(),\"chromium\")]")).click();  //finding that particular element by xpath and using contains text and take only some text from inspect element.
	 Thread.sleep(2000);
		driver.switchTo().defaultContent();     //defaultcontent use to go parent iframe .if we have to go another frame we should go to first parent frame so we use defaultcontent for switch.
		driver.switchTo().frame(1);                                        //switch to that fram where we giving index(f1) f1=1st frame  but index starting from 0.in f1 we storing frame index which is 0 and using this in switch to statement.
     driver.findElement(By.xpath("//span[text()=\"HasPermissions\"]")).click();// we are finding the text by using xpath and click on the haspermissions text.
	 
     
     
	 //for to scroll down the page and scroll up method.+ve scroll down and -ve for scroll up.
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,700)");
	  js.executeScript("window.scrollTo(0,-300)");
	  //js.executeScript("window.scrollBy(0,document.body.scrollHeight");
	  js.executeScript("window.scrollBy(0,0)");
	 //js.executeScript("window.scrollBy(500,0)");  to move in the horizontal direction.
      for(int i=0;i<5;i++) {
		  js.executeScript("window.scrollBy(0,200)");
	      Thread.sleep(500);
	  }
      
      //to take the screenshot of the full screen
      Date date=new Date();
  	  String time=date.toString().replace(":","-");
      driver.navigate().to("https://www.amazon.com/");
      driver.manage().window().maximize();
      Thread.sleep(2000);
      TakesScreenshot ts=(TakesScreenshot)driver;
      Thread.sleep(2000);
      File src=ts.getScreenshotAs(OutputType.FILE);
      File dest=new File("./screenshot/fullscreenshot"+time+".png");
      FileHandler.copy(src, dest);
      
      
      
     
	//to close the page and window
	  driver.close();
      driver.quit();
     
     
	}

}
