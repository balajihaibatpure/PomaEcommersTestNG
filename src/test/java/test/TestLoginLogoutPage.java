package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobject.LoginLogoutPage;
import utilites.ExtentReport;

public class TestLoginLogoutPage extends Base {
	
  	  WebDriver driver;
	    LoginLogoutPage loginLogoutPage;
	     ExtentReport extentReport;
		@BeforeMethod
	      public void setup() throws IOException {
	        driver = initializeBrowser();
	        extentReport = new ExtentReport();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
		@Test
		public void Loginwithvaliddata () throws InterruptedException {
			LoginLogoutPage loginLogoutPage= new LoginLogoutPage(driver);
			Thread.sleep(2000);
			loginLogoutPage.clickAlertButton();
			Thread.sleep(2000);
		    loginLogoutPage.clickonlogin();
			Thread.sleep(2000);
			loginLogoutPage.enterMobileNumber("9730079029");
			Thread.sleep(2000);
			loginLogoutPage.enterPassword("BAla@123");
			Thread.sleep(2000);
			loginLogoutPage.clickSubmitButton();
			driver.quit();
		}
		@Test
		public void loginwithinvaliddata() throws InterruptedException, IOException {
		    LoginLogoutPage loginLogoutPage = new LoginLogoutPage(driver);
		    loginLogoutPage.clickAlertButton();


		    loginLogoutPage.clickonlogin();
		    Thread.sleep(2000);
		   loginLogoutPage.enterEmailAddress(generateNewEmailTimeStamp()); 
		   takeScreenshot("login_with_invalid_data_before_entering_password", driver);
		     Thread.sleep(2000);
		    loginLogoutPage.enterPassword1("balaji");
		    Thread.sleep(2000);
		    loginLogoutPage.clickSubmitButton();
		    driver.quit();
		}
		@Test
		public void logout() throws InterruptedException {
			LoginLogoutPage loginLogoutPage = new LoginLogoutPage(driver);
			loginLogoutPage.clickAlertButton2();
			Thread.sleep(2000);
			loginLogoutPage.clickonlogin3();
			Thread.sleep(2000);
			loginLogoutPage.enterMobileNumber2("9730079029");
			Thread.sleep(2000);
			loginLogoutPage.enterPassword2("BAla@123");
			Thread.sleep(2000);
			loginLogoutPage.clickSubmitButton3();
			loginLogoutPage.Clickonprofile();
			Thread.sleep(2000);
			loginLogoutPage.Clickonlogout();
		}
}
