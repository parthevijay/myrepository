package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_getAttribute_getTagName {

	public static void main(String[] args) {
		System.setProperty("webdribver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement element=driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_cs_customerservice\"]"));
		System.out.println(element.getText());
		System.out.println(element.getAttribute("data-csa-c-content-id"));
		System.out.println(element.getTagName());
		
	

}
}