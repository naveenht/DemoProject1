package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage
{
	private static WebElement element=null;
	
	public static WebElement textBox_Search(WebDriver d)
	{
		element = d.findElement(By.className("q"));
		return element;
	}


public static WebElement button_Search(WebDriver d)
{
	element=d.findElement(By.xpath("//input[@name='q']"));
	return element;
}

}
