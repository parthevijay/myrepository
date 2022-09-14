package PomClassPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {

	WebDriver driver;
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="loginButton")
	private WebElement login;
	
	
	@FindBy(name="pwd")
	private WebElement password;
	
	public PomClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getusername() {
		return username;
	}
	public WebElement getLogin() {
		return login;
	}
		public WebElement getPassword() {
			return password;
		}
}
