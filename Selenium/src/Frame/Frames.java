package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");    //this statement is use to build the path for execute and match the version of selenium driver and chrome driver.
		WebDriver driver=new ChromeDriver();                                   //this statement is use to launch the browser.
		driver.manage().window().maximize();                                   // this statement is use to maximize the window of the browser.
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");    //by this we can go to the that current page by providing the url.
		Thread.sleep(1000);                                               //wait for the 1sec time
		WebElement f1 = driver.findElement(By.name("packageListFrame"));  //find frame name in page by inspecting and store inside the varibale.
		driver.switchTo().frame(f1);                                        //switch to that frame where we giving index(f1) f1=1st frame  but index starting from 0.in f1 we storing frame index which is 0 and using this in switch to statement.
		driver.findElement(By.xpath("//a[contains(text(),\"chromium\")]")).click();  //finding that particular element by xpath and using contains text and take only some text from inspect element.
		
		
		

	}

}
