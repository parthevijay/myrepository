package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_getLocation_getReact {

	public static void main(String[] args) {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        WebElement element2=driver.findElement(By.className("atLogoImg"));
		System.out.println(element2.getSize());
	    System.out.println(element2.getLocation());
	    System.out.println(element2.getRect().height);
	    System.out.println(element2.getRect().getHeight());
	    System.out.println(element2.getRect().width);
	    System.out.println(element2.getRect().getHeight());
	    System.out.println(element2.getRect().x);
	    System.out.println(element2.getRect().getX());
	    System.out.println(element2.getRect().y);
	    System.out.println(element2.getRect().getX());




	}

}
