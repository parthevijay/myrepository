package PomClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chromedriver","./chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      Thread.sleep(2000);
      PomClass p1=new PomClass(driver);
      p1.getusername().sendKeys("abcd");
      p1.getPassword().sendKeys("1234");
      p1.getLogin().click();
      Thread.sleep(3000);
      p1.getusername().sendKeys("admin");
      p1.getPassword().sendKeys("manager");
      p1.getLogin().click();
      

      
      
      
      
      
   
    



     
      
      

	}

}
