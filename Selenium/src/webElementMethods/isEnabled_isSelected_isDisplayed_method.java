package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_isSelected_isDisplayed_method {
    	public static void main(String[] args) throws InterruptedException {
    		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
    		WebDriver driver=new ChromeDriver();
    		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
    		WebElement driver1=driver.findElement(By.id("email-otp-btn"));
    		//driver.findElement(By.name("password")).sendKeys("8668941008");
    		System.out.println(driver1.isEnabled());
 
    	     driver.navigate().to("https://demo.actitime.com/login.do");
    	   WebElement user2 = driver.findElement(By.id("keepLoggedInCheckBox"));
    	    user2.click();
    	    Thread.sleep(2000);
    	    System.out.println(user2.isSelected());
    	 
    	    
    	    driver.navigate().to("https://www.facebook.com/");
    	    driver.findElement(By.linkText("Create New Account")).click();
    	    WebElement user3 = driver.findElement(By.xpath("//input[@value='-1']"));
    	    user3.click();
    	    System.out.println(user3.isDisplayed());
    	   
}
}