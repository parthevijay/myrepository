package method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
String url=driver.getCurrentUrl();
System.out.println(url);
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.navigate().to("https://www.amazon.com/");
driver.navigate().back();
driver.findElement(By.id("email")).sendKeys("8668941008");
driver.findElement(By.name("pass")).sendKeys("vijay123");
	}

}
