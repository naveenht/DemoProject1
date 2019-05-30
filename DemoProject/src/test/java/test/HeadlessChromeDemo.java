package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo
{
	
	public static void main(String[] args)
	{
		test();
	}
	
	
	public static void test()
	{
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("window-size-1280,800");
		
		WebDriver d=new ChromeDriver(opt);
		
		
		
		

		d.get("https://google.com");
		String title = d.getTitle();
		System.out.println(title);
		d.findElement(By.name("q")).sendKeys("Sai Ram Shirdi");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);


		d.close();
		d.quit();
	}

}
