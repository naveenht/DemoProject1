package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annoation
{
		
	static WebDriver d=null;
	
	@BeforeTest
	public void setUpTest()
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			d=new ChromeDriver();
		}
		
	@Test	
	public static void gSearch() 
		{
		
			d.get("http://google.com");
			d.findElement(By.name("q")).sendKeys("Jai Sai Ram");
			d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		}
		
	@AfterTest	
	public void tearDownTest()
		{
			System.out.println("Test Completed");
			d.close();
		}
}
