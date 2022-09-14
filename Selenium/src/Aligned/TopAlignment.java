package Aligned;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment{

	public static void main(String[] args) {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     WebElement username=driver.findElement(By.id("username"));
     WebElement password=driver.findElement(By.name("pwd"));
     int username_x=username.getRect().y;
     int password_x=password.getRect().y;
     int username_height=username.getRect().height;
     int password_heigth=username.getRect().height;
     System.out.println("height of user name box from top ="+username_x);
     System.out.println("height of password  box from top="+password_x);
     System.out.println("height of user name box "+username_height);
     System.out.println("height of password  box "+password_heigth);
     System.out.println("total height of password box "+password_x+password_heigth);
     System.out.println("total height of username box"+username_x+username_height);


       if((password_x+password_heigth)>(username_x+username_height))
     {
    	 System.out.println("top aligned");
     }
     else
     {
    	   System.out.println("not top aligned");
	
	}
	}
}
