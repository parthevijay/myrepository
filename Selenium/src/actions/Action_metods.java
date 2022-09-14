package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_metods {

	public static void main(String[] args) throws InterruptedException  {
     System.setProperty("webdriver.chrome.driver","./chromedriver.exe");  //build the path for the driver and chrome browser.
     WebDriver driver=new ChromeDriver();                                 //it is use the la
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  //this is the synchronisation method use to give implict time wait to page load.it is time saving and only use for find element methods.
     //driver.get("https://www.facebook.com/");             //it is use to open the url.   
     driver.manage().window().maximize();              //this is use to maximze the screen window.
     Actions action=new Actions(driver);            //this is the actions class we want to use this if we have to perform any action and send the variable inside the constructor.
     /*action.click().perform();                     //this method will click on the particular element.
     Thread.sleep(2000);                           //gives some time to display action for us.
     
     WebElement password = driver.findElement(By.id("pass"));
     action.click(password).perform();
     Thread.sleep(2000);

     WebElement email = driver.findElement(By.id("email"));
     action.sendKeys(email,"vijay_parthe").perform();
     Thread.sleep(2000);
     action.contextClick(email).perform();            //it is use to right click on the particular element that we have identified
     */
     driver.navigate().to("https://jqueryui.com/droppable/");
     driver.switchTo().frame(0);                  //for this website there is ome fram for that first we have to go inside the frame and then perform the action on that particalur element.
     Thread.sleep(2000);                               

     WebElement drag = driver.findElement(By.id("draggable"));
     Thread.sleep(2000);

     WebElement drop = driver.findElement(By.id("droppable"));
     //action.dragAndDrop(drag, drop).perform();    //here we mention the that particular from whoom to where it drag or place.
     
     action.dragAndDropBy(drag, 422, 158).perform();  //This will drag to the given location we can get location from google chrome extension and giving x and y co-ordinante.
     Thread.sleep(2000);                               

     action.clickAndHold(drag).moveToElement(drop).release().perform();  //without using drag and drop by method we can move the perticular element to the particular location.
     driver.navigate().refresh();
  
     
     
     
     


  
     
     
     
     
	}

}
