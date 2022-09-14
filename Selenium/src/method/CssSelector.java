package method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.com/");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//img[@alt=\"Sanitaire - SC679K SC679 Tradition Upright Vacuum Gray\"]"));
      Thread.sleep(2000);
      driver.findElement(By.xpath("//span[text()=\"Top Sellers in Books for you\"]"));
     

      
      

	}

}
