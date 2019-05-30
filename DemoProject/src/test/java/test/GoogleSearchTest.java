package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;

public class GoogleSearchTest
{
	private static WebDriver d=null;
	
	public static void main(String[] args)
	{ 
		gSearch();
		
	}
		
		
		public static void gSearch() 
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			d=new ChromeDriver();
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d.get("http://google.com");
		
			
			GoogleSearchPage.textBox_Search(d).sendKeys("naveen kumar h t");
			GoogleSearchPage.button_Search(d).sendKeys(Keys.RETURN);
			
		
			System.out.println("Test Completed");
			d.close();
			
			
			
			
		}
		
	
}
