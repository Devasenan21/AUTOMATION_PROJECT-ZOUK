package Zoukpage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportTest {
	
	WebDriver driver;
	String baseurl ="https://zouk.co.in/";
	ExtentHtmlReporter reporter;  //FOR ADDING THEMES, REPORTNAME, TITLE,.. TO REPORT.
	ExtentTest test;  	//FOR UPDATE REPORT.
	ExtentReports extent;	//FOR ADDIND INFO TO REPORT.
	
	@BeforeTest
	public void beftest()
	{
		reporter = new ExtentHtmlReporter("./reports/reportdemo.html"); //CREATE REPORTS FOLDER IN THIS PROJECT
		reporter.config().setDocumentTitle("Automation Demo Report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host Name", "Local Host");
		extent.setSystemInfo("OS", "Windows 11");
		extent.setSystemInfo("Tester name", "Devan");
		extent.setSystemInfo("Browser name", "Chrome");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void setUp()
	{
		driver.get(baseurl);
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
	
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshotpath=ReportTest.screenshotMethod(driver,result.getName());
			test.addScreenCaptureFromPath(screenshotpath);
			
		}else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is"+result.getName());
		}
		 
	}

			public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
			{
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				String destination="./Screenshots/"+screenshotname +".png";
				//File finaldestination=new File(destination);
				//FileHandler.copy(src, finaldestination);
				FileHandler.copy(src, new File(destination));
		
				return destination;
			}


}

