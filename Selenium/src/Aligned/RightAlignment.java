package Aligned;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment{

	public static void main(String[] args) {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.get("https://demo.actitime.com/login.do");
     WebElement username=driver.findElement(By.id("username"));
     WebElement password=driver.findElement(By.name("pwd"));
     int username_x=username.getRect().x;   //110
     int password_x=password.getRect().x;   //110
     int username_width=username.getRect().width; 
     int password_width=password.getRect().width;

     
     if((username_x + username_width)==(password_x+password_width))
     {
    	 System.out.println("right aligned");
     }
     else
     {
    	   System.out.println("right aligned");
	
	}
	}
}
