 package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import base.Base;
import pageobject.RegisterPage;

public class TestRegisterPage extends Base {

    WebDriver driver;
    RegisterPage registerpage;
    Utils Utilites;

    @BeforeMethod
    public void setup() throws IOException {
        driver = initializeBrowser();
        //ExtentReports = new ExtentReport();
        registerpage  = new RegisterPage(driver); // Initialize the RegisterPage object

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testRegisterPage() throws InterruptedException {
    	
        // Perform registration page actions
        registerpage.clickAlertButton();
        registerpage.clickregisterButton();
        registerpage.ClickUsername();
        registerpage.clickmobile();
       
        registerpage.ClickOnmail();
        Thread.sleep(2000);
        registerpage.clickonpassword();
        Thread.sleep(2000);
        registerpage.clickonconfrim();
        registerpage.clickonsubmit();
    }


    @Test(priority = 2)
    public void testRegist() throws InterruptedException {
    	

    }
	}

