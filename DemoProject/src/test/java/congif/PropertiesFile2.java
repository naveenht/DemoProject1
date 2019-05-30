// write to proerty file

package congif;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.PropertyFileDemowithTestNG;

public class PropertiesFile2 {

	static Properties prop=new Properties();
	static String pp=System.getProperty("user.dir");

	public static void main(String[] args)
	{ 
		getProp();
		setprop();
		getProp();
	}

	public static void getProp()
	{

		try
		{



			InputStream input =new FileInputStream(pp+"\\src\\test\\java\\congif\\congif.properties");
			prop.load(input);

			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			PropertyFileDemowithTestNG.browserName=browser;


		} 

		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}


	public static void setprop()
	{
		try
		{

			OutputStream output=new FileOutputStream(pp+"\\src\\test\\java\\congif\\congif.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}


}
