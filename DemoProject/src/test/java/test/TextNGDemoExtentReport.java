package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TextNGDemoExtentReport 
{

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	private static WebDriver d=null;
	
@BeforeSuite

public void setup()
{
	
	htmlReporter = new ExtentHtmlReporter("extentReports1.html");
	extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
}

@BeforeTest
public void setUpTest()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		d=new ChromeDriver();
	}
	
	
@Test
public void test1() throws IOException
{
	 ExtentTest test1 = extent.createTest("GoogleSearchTest","Test to Validate google Search");
	 
	 d.get("http://google.com");
	 test1.pass("Navigating to Google");
	 
	 // log(Status, details)
     test1.log(Status.INFO, "This step shows usage of log(status, details)");

     // info(details)
     test1.info("This step shows usage of info(details)");
     
     // log with snapshot
     test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
     
     // test with snapshot
     test1.addScreenCaptureFromPath("screenshot.png");
}

@Test
public void test2() throws IOException
{
	 ExtentTest test1 = extent.createTest("GoogleSearchTest","Test to Validate google Search");
	 
	 // log(Status, details)
     test1.log(Status.INFO, "This step shows usage of log(status, details)");

     // info(details)
     test1.info("This step shows usage of info(details)");
     
     // log with snapshot
     test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
     
     // test with snapshot
     test1.addScreenCaptureFromPath("screenshot.png");
}

@AfterTest	
public void tearDownTest()
	{
		System.out.println("Test Completed");
		d.close();
	}




@AfterSuite
public void tearDown()
{
	extent.flush();
}
	
}
