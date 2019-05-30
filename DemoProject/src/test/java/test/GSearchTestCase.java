package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GSearchPOM;

public class GSearchTestCase
{
	
	static WebDriver d=null;
	
	
	public static void main(String[] args)
	{
		GSearchText();
	}
	
	public static void GSearchText()
	{
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		d=new ChromeDriver();
		
		GSearchPOM searchPageObject =new GSearchPOM(d);
		
		d.get("https://google.com");
		
		searchPageObject.setTextInSearchBox("XCM Solutions LLC");
		
		searchPageObject.clickSearchbtn();
		
		d.close();
		
	}
	
}
