package Aligned;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment{

	public static void main(String[] args) {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
     WebElement username=driver.findElement(By.id("username"));
     WebElement password=driver.findElement(By.name("pwd"));
     if(username.getRect().x==password.getRect().x)
     {
    	 System.out.println("left aligned");
     }
     else
     {
    	   System.out.println("not left aligned");
	
	}
	}
}
