import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunChrome 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String projectPath = System.getProperty("user.dir");
	
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.co.in");
		
		
		List<WebElement> count = d.findElements(By.xpath("//input"));
		int cc=count.size();
		
		System.out.println(cc);
		
		WebElement TB = d.findElement(By.xpath("//input[@name='q']"));
		TB.sendKeys("XCM Solutions LLC");
	
		Thread.sleep(2000);
	}
}
