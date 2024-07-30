package utilites;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    public static ExtentReports getExtentReport() throws IOException {
        // WebDriver initialization
        WebDriver driver = new ChromeDriver();

        // File path for Extent report
        String extentReportPath = "C:\\Users\\shree\\eclipse-workspace\\E-commerce\\target\\extent-report.html";

        // Extent report setup
        ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
        reporter.config().setReportName("Poma E-commerce Automation Results");
        reporter.config().setDocumentTitle("Automation Test Results");

        ExtentReports extentReport = new ExtentReports();
        extentReport.attachReporter(reporter);
        extentReport.setSystemInfo("Operating System", "Windows 10");
        extentReport.setSystemInfo("Executed By", "Balaji Haibatpure");

        

        // Quit WebDriver instance
        driver.quit();

        return extentReport;
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

		public void screenshot(WebDriver driver) {
			// TODO Auto-generated method stub
			
		}

	
		
		
	}

