package scrollUpDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollMethod {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.actimind.com/");
  JavascriptExecutor js=(JavascriptExecutor)driver;
  
  js.executeScript("window.scrollBy(0,300)");
  js.executeScript("window.scrollBy(0,document.body.scrollHeight");
  js.executeScript("window.scrollBy(0,0)");
   for(int i=0;i<5;i++) {
	  js.executeScript("window.scrollTo(0,300)");
      Thread.sleep(500);
  }
   //js.executeScript("window.scrollBy(500,0)");  to move in the horizontal direction.
   //to scroll up use negative value it scroll up.

   
	}

}
