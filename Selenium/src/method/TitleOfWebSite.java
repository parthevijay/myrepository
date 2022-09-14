package method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfWebSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");  //to open the web-page use get method
		 String title=driver.getTitle();
		 System.out.println(title);
		Thread.sleep(2000);
		driver.close();

	}

}
