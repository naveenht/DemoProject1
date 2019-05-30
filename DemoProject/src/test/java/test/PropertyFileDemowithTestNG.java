package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import congif.PropertiesFile;

public class PropertyFileDemowithTestNG
{
		
	static WebDriver d=null;
	public static String browserName=null;
	
	@BeforeTest
	public void setUpTest()
		{
		String projectPath = System.getProperty("user.dir");
		
		PropertiesFile.getProp();
		
			if(browserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
				d=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
				d= new FirefoxDriver();
			}
			
		}
		
	@Test	
	public static void gSearch2() 
		{
		
			d.get("http://google.com");
			d.findElement(By.name("q")).sendKeys("naveen kumar h tl");
			d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		}
		
	@Test	
	public static void gSearch3() 
		{
		
			d.get("http://google.com");
			d.findElement(By.name("q")).sendKeys("Pooja");
			d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		}
	
	@AfterTest	
	public void tearDownTest()
		{
			System.out.println("Test Completed");
			d.close();
		}
}
