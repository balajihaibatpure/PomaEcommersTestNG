 package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCategoriesPage {
	 WebDriver driver;
	    // Constructor
	    public AllCategoriesPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
	    private WebElement homePageLink;
	    
	    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
        private WebElement alertButton;

       @FindBy(xpath = "(//a[@id='dropdownMenuButton1'])[1]")
       private WebElement Allcategories;
       
       @FindBy(xpath = "(//a[@class='nav-link text-small pb-0 catskin'])[1]")
       private WebElement Makeup;
       
//       @FindBy(xpath = "//img[@src='https://res.cloudinary.com/diutessme/image/upload/v1711705257/file_sb966b.jpg']")
//       private WebElement MakeupImage;
       
       @FindBy(xpath = "//img[@src='https://res.cloudinary.com/diutessme/image/upload/v1711705257/file_sb966b.jpg']")
       private WebElement Lips;
       
       @FindBy(xpath = "//img[@src='https://res.cloudinary.com/diutessme/image/upload/v1711712839/file_wtarkl.jpg']")
       private WebElement SUGARPOPMatte;
       
       @FindBy(xpath = "(//button[@class='buy'])[1]")
       private WebElement buybutton;
       
       @FindBy(xpath = "//input[@id='mat-input-0']")
       private WebElement mobileNumberField;
       
       @FindBy(xpath = "//input[@id='mat-input-1']")
       private WebElement passwordField;
     
       @FindBy(xpath = "//button[@type='submit']")
       private WebElement submitButton;
       
       @FindBy(xpath = "//button[@class='ajax-btn primary-btn w-100']")
       private WebElement Placeorderbutton;
       
       @FindBy(xpath = "//input[@data-placeholder='country']")
       private WebElement countryField;

       @FindBy(xpath = "//input[@data-placeholder='state']")
       private WebElement stateField;
       
       @FindBy(xpath = "//input[@data-placeholder='email']")
       private WebElement emailField;
       
       @FindBy(xpath = "//input[@data-placeholder='name']")
       private WebElement nameField;

       @FindBy(xpath = "//input[@data-placeholder='mobile number']")
       private WebElement mobileField;

       @FindBy(xpath = "//input[@data-placeholder='address 1']")
       private WebElement addressField;
       
       @FindBy(xpath = "//input[@data-placeholder='city']")
       private WebElement cityField;
       
       @FindBy(xpath = "//input[@data-placeholder='zip code']")
       private WebElement zipCodeField;
       
       @FindBy(xpath ="//button[@class='this ng-star-inserted']")
       private WebElement saveAddressButton;
       
       @FindBy(name ="//input[@id='flexRadioDefault1']")
       private WebElement radioButton;
       
       @FindBy(xpath = "//select[@class='form-select']")
       private WebElement selectbutton;
      
       @FindBy(xpath = "(//button[@type='button'])[3]")
       private WebElement selectpaclorder;
       
       public void goToHomePage() {
           homePageLink.click();
       }
       
       public void clickAlertButton() {
       	alertButton.click();
       }
       
       public void clickOnAllcategories() {
           Allcategories.click();
       }
       
       public void ClickonMakeup() {
           Makeup.click();
           
       }
//       public void ClickonMakeupImage() {
//    	   MakeupImage.click();
//       }
//       
       public void ClickomLips() {
       	Lips.click();
       }
       
       public void ClickonSUGARPOPMatte() {
    	   SUGARPOPMatte.click();
       }
       
       public void clickOnBuy() {
        	buybutton.click();
        	
    	}
       public void enterMobileNumber(String number) {
           mobileNumberField.sendKeys(number);
       }
       
       public void enterPassword(String password) {
           passwordField.sendKeys(password); 
       }
       
       public void clickSubmitButton() {
           submitButton.click(); 
       }
       public void clionplace() {
    	   Placeorderbutton.click();
       }
       
       public void enterCountry(String country) {
        	countryField.sendKeys(country);
       }
       
       public void enterState(String state) {
    		stateField.sendKeys(state);
    	}
       
       public void enterEmail(String email) {
    		emailField.sendKeys(email);
    	}
       
       public void enterName(String name) {
    		nameField.sendKeys(name);
    	}
       
       public void enterMobile(String mobile) {
    		mobileField.sendKeys(mobile);
    	}
       
       public void enterAddress(String address) {
    		addressField.sendKeys(address);
    	}
       
       public void enterZipCode(String zip) {
    		zipCodeField.sendKeys(zip);
    	}
       
       public void enterCity(String city) {
        	cityField.sendKeys(city);	
    	}
       
       public void saveAddress() {
    		saveAddressButton.click();
    	}
       
       public void clickRadioButton() {
   		radioButton.click();
   	    }
       public void clickonselectbutton() {
   		selectbutton.click();
   	   }
       public void palceorder2() {
   		selectpaclorder.click();
   	   }
       
}