package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {    //throws an exception 
System.setProperty("webdriver.chromedriver","./chromedriver.exe");   //to lauch the browser
Date date=new Date();                                        //creating object of date to store muuliple images while scipt executing
String time=date.toString().replace(":","-");              //to convert the  the date into time.
WebDriver driver=new ChromeDriver();                     //to launch the browser.
driver.get("https://www.amazon.com/");                //to get the url and open the link of the browser.
WebElement pic = driver.findElement(By.xpath("//img[@alt=\"Keyboards\"]"));   //finding the element keyboard in the amazon website and storing this in the pic variable.
File img=pic.getScreenshotAs(OutputType.FILE);       
System.out.println(img);                             //printing the img path where we can see this.
File imge=new File("./screenshot/"+time+".png");        //creating objet of file in that we storing took screenshot and time and with the ./foldername (converted date in the string) and extension .png which is compulsory
FileHandler.copy(img,imge);                     



	}

}
