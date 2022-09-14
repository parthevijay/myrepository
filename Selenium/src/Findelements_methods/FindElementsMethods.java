package Findelements_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
		List<WebElement> printallLinks = driver.findElements(By.xpath("//a"));   
		System.out.println(printallLinks.size());
		for(int i=0;i<printallLinks.size();i++) {
			System.out.println(printallLinks.get(i).getText());
			
		}
	}

}
