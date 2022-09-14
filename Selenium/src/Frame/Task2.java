package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//input[@type=\"button\"])[5]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
	
		

		driver.findElement(By.xpath("(//input[@type=\"button\"])[6]")).click();
		driver.findElement(By.xpath("(//input[@type=\"button\"])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Shopping cart\"]")).click();
		

		
		
	}

}
