package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo
{
	
	private static WebDriver d=null;
	
	 public static void main(String[] args) throws IOException 
	 {
		
		
		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		 
		 	ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
		 
	        ExtentTest test1 = extent.createTest("GoogleSearchTest","Test to Validate google Search");
	        
	        String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			d=new ChromeDriver();
			
			 // log(Status, details)
	        test1.log(Status.INFO, "Starting Testcase");

	      	d.get("http://google.com");
	      	
	      	test1.pass("Navigating to Google");
			d.findElement(By.name("q")).sendKeys("naveen kumar h tl");
			
			test1.pass("Enter Text in Search box");
			
			d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
			
			test1.pass("Press the Enter Key");
			
			System.out.println("Test Completed");
			d.close();
			test1.pass("Close the Browser");
			
			extent.flush();
	        
	 }
	
}
