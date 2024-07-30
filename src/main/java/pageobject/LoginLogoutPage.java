package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPage {
	WebDriver driver;
    // Constructor
    public LoginLogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        
    }
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButton;
    
    @FindBy(xpath = "//span[text()=' login']")
    private WebElement loginbutton1;
    
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberField;
    
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordField;
  
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
     
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButton1;
    
    @FindBy(xpath = "//span[text()=' login']")
    private WebElement loginbutton2;
    
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberField1;
    
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordField1;
  
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton1;
    
    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    private WebElement alertButton2;
    
    @FindBy(xpath = "//span[text()=' login']")
    private WebElement loginbutton3;
    
    @FindBy(xpath = "//input[@id='mat-input-0']")
    private WebElement mobileNumberField2;
    
    @FindBy(xpath = "//input[@id='mat-input-1']")
    private WebElement passwordField2;
  
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton2;
    
    @FindBy(xpath = "//span[@class='ps-2 cart ng-star-inserted']")
    private WebElement profilebutton;
   
   @FindBy(xpath = "//a[normalize-space()='Logout']")
   private WebElement logoutbutton;
   
    
    
    public void clickAlertButton() {
    	alertButton.click();
    }
    public void clickonlogin() {
		loginbutton1.click();
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
//    public void enterMobileNumber1(String number) {
//        mobileNumberField.sendKeys(number);
//    }
    
    public void enterPassword1(String password) {
        passwordField.sendKeys(password); 
    }
    
    public void clickSubmitButton1() {
        submitButton.click();
    }
    public void clickAlertButton2() {
    	alertButton.click();
    }
    public void clickonlogin3() {
		loginbutton1.click();
	}
    public void enterMobileNumber2(String number) {
        mobileNumberField.sendKeys(number);
    }
    
    public void enterPassword3(String password) {
        passwordField.sendKeys(password); 
    }
    
    public void clickSubmitButton3() {
        submitButton.click(); 
    }
//    public void enterMobileNumber1(String number) {
//        mobileNumberField.sendKeys(number);
//    }
    
    public void enterPassword2(String password) {
        passwordField.sendKeys(password); 
    }
    
    public void clickSubmitButton2() {
        submitButton.click();
    }
	public void enterEmailAddress(String newEmailTimeStamp) {
		mobileNumberField.sendKeys(newEmailTimeStamp);
		// TODO Auto-generated method stub
		
	}
	 public void Clickonprofile() {
			profilebutton.click();
		}
	    public void Clickonlogout() {
			logoutbutton.click();
		}
}
