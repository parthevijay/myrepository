package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.name("packageListFrame"));      //finding the frame by name locator go inside and first frame and storing it in f1 varibale.
		
		driver.switchTo().frame(f1);                                        //switch to that fram where we giving index(f1) f1=1st frame  but index starting from 0.in f1 we storing frame index which is 0 and using this in switch to statement.
		driver.findElement(By.xpath("//a[contains(text(),\"chromium\")]")).click();  //finding that particular element by xpath and using contains text and take only some text from inspect element.
		Thread.sleep(2000);
		driver.switchTo().defaultContent();     //defaultcontent use to go parent iframe .if we have to go another frame we should go to first parent frame so we use defaultcontent for switch.
		driver.switchTo().frame(1);                                        //switch to that fram where we giving index(f1) f1=1st frame  but index starting from 0.in f1 we storing frame index which is 0 and using this in switch to statement.
        driver.findElement(By.xpath("//span[text()=\"HasPermissions\"]")).click();// we are finding the text by using xpath and click on the haspermissions text.
	}

}
