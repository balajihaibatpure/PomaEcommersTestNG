package base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

public class Base {
	WebDriver driver;
	
//	HomePage homePage;
//	TestHomepage testHomepage;
	Utils utilities;
	public WebDriver initializeBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shree\\eclipse-workspace\\Cucumber\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("http://pumobeauty.com/master/home");
		
		
		return driver;
		}
public String generateNewEmailTimeStamp() {
			
			Date date = new Date();
			return date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
			
		}
		
		public String takeScreenshot(String testName,WebDriver driver) throws IOException {
			
			File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screenshotFilePath = System.getProperty("user.dir")+"\\Screenshots\\"+testName+".png";
			FileUtils.copyFile(srcScreenshot, new File(screenshotFilePath));
			return screenshotFilePath;
		
		
}
	}
	



