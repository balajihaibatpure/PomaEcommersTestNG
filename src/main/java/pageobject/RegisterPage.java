package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	 public RegisterPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    
	 }
        @FindBy(xpath = "//span[@class='mat-button-wrapper']")
         private WebElement alertButton;

        @FindBy(xpath = "//span[text()=' Register']")
        private WebElement RegisertButton;

        @FindBy(xpath = "//input[@data-placeholder='Name']")
        private WebElement UserName;

        @FindBy(xpath = "//input[@data-placeholder='Mobile Number']")
        private WebElement UserMobileNO;

        @FindBy(xpath = "//input[@data-placeholder='Email']")
        private WebElement UserEmail;

         @FindBy(xpath = "//input[@data-placeholder='Password']")
        private WebElement Userpassword;

         @FindBy(xpath = "//input[@data-placeholder='Confirm Password']")
         private WebElement UserConfirmPassword;

         @FindBy(xpath = "//span[text()='Submit']")
         private WebElement Usersubmit;
         
//         Method
         public void clickAlertButton() {
        	 alertButton.click();
		}
         public void clickregisterButton () {
			RegisertButton.click();
		}
         public void ClickUsername() {
			UserName.sendKeys("raju");
		}
         public void clickmobile() {
			UserMobileNO.sendKeys("9730079011");
		}
         public void ClickOnmail() {
			UserEmail.sendKeys("balajihaibatpu@gmail.com");
		}
         public void clickonpassword() {
			Userpassword.sendKeys("BAla@123");
		}
         public void clickonconfrim() {
			UserConfirmPassword.sendKeys("BAla@123");
		}
         public void clickonsubmit() {
			Usersubmit.click();
			
		}
		public void generateNewEmailTimeStamp() {
			UserEmail.click();
			
		}
         
	   
}
