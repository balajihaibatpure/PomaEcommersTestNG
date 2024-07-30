package test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Base;
import pageobject.AllCategoriesPage;
import utilites.ExtentReport;
    public class TestAllcategoriespage extends Base {
	    	  WebDriver driver;
		     AllCategoriesPage allCategoriesPage;
		     ExtentReport extentReport;
			@BeforeMethod
		      public void setup() throws IOException {
		        driver = initializeBrowser();
		        extentReport = new ExtentReport();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    }
			@Test(priority = 1)
		      public void Allcategories() throws Exception {
		     	AllCategoriesPage allCategoriesPage =new AllCategoriesPage(driver);
		     	Thread.sleep(2000);
		     	allCategoriesPage.clickAlertButton();
		     	Thread.sleep(2000);
		     	allCategoriesPage.clickOnAllcategories();
		     	Thread.sleep(2000);
		     	allCategoriesPage.ClickonMakeup();
		     	Thread.sleep(2000);
//		     	allCategoriesPage.ClickonMakeupImage();
		     	Thread.sleep(2000);
		     	allCategoriesPage.ClickomLips();
		     	Thread.sleep(2000);
		     	allCategoriesPage.ClickonSUGARPOPMatte();
		     	Thread.sleep(2000);
		     	allCategoriesPage.clickOnBuy();
		     	Thread.sleep(2000);
	            allCategoriesPage.enterMobileNumber("9730079029");
		        Thread.sleep(2000);
		    	allCategoriesPage.enterPassword("BAla@123");
		    	Thread.sleep(2000);
		    	allCategoriesPage.clickSubmitButton();
		    	allCategoriesPage.clickOnAllcategories();
		     	Thread.sleep(2000);
		     	allCategoriesPage.ClickonMakeup();
		     	Thread.sleep(2000);
//		     	allCategoriesPage.ClickonMakeupImage();
		     	Thread.sleep(2000);
		     	allCategoriesPage.ClickomLips();
		     	Thread.sleep(2000);
		     	allCategoriesPage.ClickonSUGARPOPMatte();
		     	Thread.sleep(2000);
		     	allCategoriesPage.clickOnBuy();
		     	Thread.sleep(2000);
		    	allCategoriesPage.clionplace();
			    Thread.sleep(2000);
		        allCategoriesPage.enterCountry("india");
		        Thread.sleep(2000);
		        allCategoriesPage.enterState("maharastra");
		        allCategoriesPage.enterEmail("balajihaibatpure@gmail.com");
		        allCategoriesPage.enterName("balaji");
		        allCategoriesPage.enterMobile("9730079029");
		        allCategoriesPage.enterAddress("mundhwa");
		        allCategoriesPage.enterCity("pune");
		        Thread.sleep(2000);
		        allCategoriesPage.enterZipCode("411036");
		        Thread.sleep(2000);
		        allCategoriesPage.saveAddress();
		        Thread.sleep(2000);
		        allCategoriesPage.clickRadioButton();
		        Thread.sleep(2000);
		        allCategoriesPage.clickonselectbutton();
		        Thread.sleep(2000);
		        WebElement selectwebelement = driver.findElement(By.xpath("//select[@class='form-select']"));
		        Thread.sleep(2000);
		        Select sc =new Select(selectwebelement);
		        sc.selectByVisibleText("Online");
				allCategoriesPage.palceorder2();
				
		    }
	    	
			@Test(priority = 2)
			public void Allcategories2()  {
			AllCategoriesPage allCategoriesPage =new AllCategoriesPage(driver);
			        
			
	  }
			}
			
	  
	  
