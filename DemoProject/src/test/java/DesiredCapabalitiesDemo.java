import org.apache.http.impl.cookie.IgnoreSpec;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabalitiesDemo {

	public static void main(String[] args)
	{
		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("IgnoreSpec","True");
		
		System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver(caps);
		d.get("https://www.google.co.in");
		
		d.findElement(By.className("q")).sendKeys("XCM Solutions LLC");
		d.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.RETURN);
		
		d.close();
		d.quit();

	}

}
