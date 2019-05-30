package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GSearchPOM 
{
	
	WebDriver d=null;
	
	By textBox_search=By.name("q");
	By btn_search=By.xpath("//input[@name='q']");
	
	public GSearchPOM(WebDriver d)
	{ 
		this.d=d;
	}
	
	
	public void setTextInSearchBox(String s)
	{
		d.findElement(textBox_search).sendKeys(s);
	}
	
	public void clickSearchbtn()
	{
		d.findElement(btn_search).sendKeys(Keys.RETURN);
	}
	
}
