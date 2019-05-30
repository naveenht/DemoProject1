package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test1
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
