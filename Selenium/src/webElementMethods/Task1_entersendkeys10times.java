package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_entersendkeys10times {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./chromedriver.exe.");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.actitime.com/login.do");
        for(int i=0;i<11;i++) {
        	WebElement user=driver.findElement(By.xpath("//input[@name=\"username\"]"));
        	user.sendKeys("admin");
        	Thread.sleep(2000);
        	user.clear();
	        WebElement user1=driver.findElement(By.xpath("//input[@name=\"pwd\"]"));
	        user1.sendKeys("manager");
              Thread.sleep(2000);
	        user1.clear();
        }
        	driver.close();
	 

}

		
	}

	
	
