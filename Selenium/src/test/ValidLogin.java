package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import generic.WebGeneric;
import pom.HomePage;
import pom.TimeTrackPage;

public class ValidLogin extends BaseTest{
  @Test
  public void ValidLogin() throws EncryptedDocumentException, IOException, InterruptedException {
	  HomePage h=new HomePage(driver);
	  WebGeneric wg=new WebGeneric();
	  
	 /* ReadExcel e=new ReadExcel();
	  String username=e.getDataFromExcel("sheet3",0,0);
	  String password=e.getDataFromExcel("sheet3",1,0);*/

	  h.getUsername().sendKeys("admin");
	  Thread.sleep(2000);
	  h.getPassword().sendKeys("manager");
	  Thread.sleep(2000);

	  h.getLoginBTN().click();
	  Thread.sleep(10000);
	  
	  TimeTrackPage ttp=new TimeTrackPage(driver);
	  ttp.getLogout().click();
	  Thread.sleep(10000);
	  
	  

  }
}
