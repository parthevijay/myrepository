package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//to get html page that save
        driver.get("file:///C:/Users/vijay/OneDrive/Desktop/dropdown.html");
       
        //finding the element by using id that is city.
        WebElement element = driver.findElement(By.id("city"));
        //select class is use for selecting the dropdown which is inbuild class in selenium
        Select select=new Select(element);  //passing the arugment inside the select class
        Thread.sleep(2000);
        System.out.println(select.isMultiple()); //printing that it is single select or multiselect element which will return value true or false.
        
        WebElement subject = driver.findElement(By.id("subject1"));
        Select s1=new Select(subject);
        Thread.sleep(2000);
        System.out.println(s1.isMultiple());  
        
        WebElement subject10 = driver.findElement(By.id("subject1"));
        Select s10=new Select(subject10);
        Thread.sleep(3000);
        
        s10.selectByIndex(0);  //selecting the element from multiselect dropdown by using the selectByIndex method where pass the index number.
        Thread.sleep(2000);
        
        s10.selectByValue("7");  //selecting the element from multiselect dropdown by using the selectByValue method where pass the value.
        Thread.sleep(2000);

        s10.selectByVisibleText("selenium");  ////selecting the element from multiselect dropdown by using the selectVisibleText method where pass the text.
        Thread.sleep(2000);

        s10.selectByIndex(3);
        Thread.sleep(2000);
        
        s10.selectByIndex(4);
        Thread.sleep(2000);
        
        
        //to check and print first selected option the dropdown
        WebElement subject15 = driver.findElement(By.id("subject1"));
        Select s15=new Select(subject15);
        Thread.sleep(2000);
       System.out.println(s15.getFirstSelectedOption().getText());
       
       //to check  and print all the selected option
       WebElement subject16 = driver.findElement(By.id("subject1"));
       Select s16=new Select(subject16);
       List<WebElement> allcheck=s16.getAllSelectedOptions();
       for(WebElement print1:allcheck)
    	   System.out.println(print1.getText());
   
        
        WebElement subject5 = driver.findElement(By.id("subject1"));
        Select s5=new Select(subject5);
        Thread.sleep(2000);
        s5.deselectByIndex(4);
        
        WebElement subject6 = driver.findElement(By.id("subject1"));
        Select s6=new Select(subject6);
        Thread.sleep(2000);
        s6.deselectByValue("7");
        
        WebElement subject8 = driver.findElement(By.id("subject1"));
        Select s8=new Select(subject8);
        Thread.sleep(2000);
        s8.deselectByVisibleText("selenium");
        
        WebElement subject9 = driver.findElement(By.id("subject1"));
        Select s9=new Select(subject9);
        Thread.sleep(2000);
        s9.deselectAll();
        
        //to print and all the option inside the dropdown.
        WebElement subject11 = driver.findElement(By.id("subject1"));
        Select s11=new Select(subject11);
        List<WebElement> allelement=s11.getOptions();
        for(WebElement print:allelement) {
        	System.out.println(print.getText()); 
       
        
        //to check whether the element is present or not
        WebElement subject20 = driver.findElement(By.id("subject1"));
        Select s12=new Select(subject20);
        int count=0;
        List<WebElement> allelement1=s12.getOptions();
        for(WebElement check:allelement1) {
        	if(check.getText().equals("Baseball")) {
        		count++;
        	}
        }
        	if (count>0) {
        		System.out.println("Baseball is present in dropdown");
        	}
        	else {
        		System.out.println("Baseball is not present in dropdown");
        	}
        }
       
        
       /* //to select the particular element
        WebElement subject11 = driver.findElement(By.id("subject1"));
        Select s12=new Select(subject11);
        int count=0;
        List<WebElement> allelement3=s12.getOptions();
        for(WebElement check:allelement3) {
        	if(check.getText().equals("selenium")){
        		count++;
        		check.click();
        	}
        }
        	if (count==0)
        		System.out.println("Baseball is not present in dropdown");
        	else
        		System.out.println("Baseball is present in dropdown");*/
        		
}       
}       
 
