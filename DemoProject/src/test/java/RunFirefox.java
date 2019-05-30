import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunFirefox
{
	public static void main(String[] args)
	{
		
		String projectPath = System.getProperty("user.dir");
		
		System.out.println("projectPath:"+projectPath);
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\NThimmaiah\\eclipse-workspace may25\\DemoProject\\drivers\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver d= new FirefoxDriver();
		
		d.get("https://www.seleniumhq.org/");
		
	}
}
