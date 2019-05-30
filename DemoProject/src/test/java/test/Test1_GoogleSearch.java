package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch
{
	public static void main(String[] args)
	{ 
		gSearch();
		
	}
		
		
		public static void gSearch() 
		{
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			
			d.get("http://google.com");
			d.findElement(By.name("q")).sendKeys("naveen kumar h t");
			//d.findElement(By.name("btnK")).click(); 
			
			d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
			System.out.println("Test Completed");
			
			d.close();
			
			
			
			
		}
		
	
}
