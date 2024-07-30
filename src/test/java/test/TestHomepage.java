package test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobject.HomePage;
import utilites.ExtentReport;

     public class TestHomepage extends Base {
    	 

     WebDriver driver;
     HomePage homePage;
     ExtentReport extentReport;
	@BeforeMethod
      public void setup() throws IOException {
        driver = initializeBrowser();
        extentReport = new ExtentReport();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

     @Test(priority = 1)
      public void clickonhompage() throws Exception {
     	HomePage homePage=new HomePage(driver);
   	    //Thread.sleep(2000);
    	//homePage.goToHomePage();
    	homePage.clickAlertButton();
    	homePage.clickOnPhoto();
        homePage.clickOnSearch();
        homePage.searchProduct("Fashion Colour Studio Finish HD Powder Palette");
        Actions actions = new Actions(driver);
		actions.perform();
		actions.sendKeys(Keys.ENTER).perform();
        homePage.clickOnSearch();
        Thread.sleep(4000);
    	homePage.clickOnPowderPlate();
    	homePage.clickOnAddToCart();
    	homePage.enterMobileNumber("9730079029");
    	homePage.enterPassword("BAla@123");
        homePage.clickSubmitButton();
    	//Reporter.log("Item Add In Cart Successfully");
    }
       @Test(priority = 2)
       public void sepectrumimg() throws Exception {
    	HomePage homePage=new HomePage(driver);
    
    	homePage.clickAlertButton();
        homePage.clickOnSpectrumImage(); 
        homePage.clickOnBuy();
        homePage.enterMobileNumber("9730079029");
    	homePage.enterPassword("BAla@123");
        homePage.clickSubmitButton();
        //homePage.setquantityinput();
        homePage.clickOnSpectrumImage();
        homePage.clickOnBuy();
        homePage.clionplace();
        homePage.enterCountry("india");
        homePage.enterState("maharastra");
        homePage.enterEmail("balajihaibatpure@gmail.com");
        homePage.enterName("balaji");
        homePage.enterMobile("9730079029");
        homePage.enterAddress("mundhwa");
        homePage.enterCity("pune");
        homePage.enterZipCode("411036");
        homePage.saveAddress();
        homePage.clickRadioButton();
        homePage.clickonselectbutton();
        WebElement selectwebelement = driver.findElement(By.xpath("//select[@class='form-select']"));
        Select sc =new Select(selectwebelement);
        sc.selectByVisibleText("Online");
		homePage.palceorder2();
    	}
    
  
}
