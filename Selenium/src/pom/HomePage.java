package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
  
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginBTN() {
		return loginBTN;
	}


  }

