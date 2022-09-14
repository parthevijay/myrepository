package method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Web_Driver_Method {

	public static void main(String[] args ) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
    
    //for launch the browser create a object .
    WebDriver driver=new ChromeDriver();  
	
	//to open the web-page use get method.
	driver.get("https://www.flipkart.com/");  
	
	 //to maximize the web page window.
	driver.manage().window().maximize();    
	
	//this method will open full screen of current window.
	driver.manage().window().fullscreen();   
	
	//to minimize the current web page.
	driver.manage().window().minimize();   
	
	//get-title method will give title of the web-page
	System.out.println(driver.getTitle()); 
	
	//by get-current-url method also we will get current page Url
	System.out.println(driver.getCurrentUrl());   
	
	//by get-page source we will get source code of page.
	System.out.println(driver.getPageSource());
	
	//this method will open the next web page.
	driver.navigate().to("https://www.amazon.com/");  
	 //this method will stop the process for some time
     Thread.sleep(2000);  
     
     //this will come back to previous web page
	driver.navigate().back();                 
	   Thread.sleep(2000);  
	   
	 //this will go to next page web page
	driver.navigate().forward();            
	   Thread.sleep(2000);  
	   
	   //this will refresh the current web page
	   driver.navigate().refresh();         
	   Thread.sleep(2000);
	   
	   
	   
	// close method is use to close the current tab.
     driver.close();    
     
    // quit method is use to close the all the tabs.
      driver.quit();                                  
	} 

}
