package method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    Dimension size=driver.manage().window().getSize();
    System.out.println(size);
    
    Point position=driver.manage().window().getPosition();
    System.out.println(position);
    
    Dimension d=new Dimension(1000,1000);
    driver.manage().window().setSize(d);
    Dimension size1=driver.manage().window().getSize();
    System.out.println(size1);
    
    Point p=new Point(500,500);
    driver.manage().window().getSize();
    Point position1=driver.manage().window().getPosition();
    System.out.println(position1);
    
    
    
    
	}

}
