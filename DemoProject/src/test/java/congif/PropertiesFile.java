// Read to proerty file

package congif;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args)
	{ 
		getProp();
	}
	
		public static void getProp()
		{
			
			try
			{
				
				Properties prop=new Properties();
				String pp=System.getProperty("user.dir");
				InputStream input =new FileInputStream(pp+"\\src\\test\\java\\congif\\congif.properties");
				prop.load(input);
				
				String bro = prop.getProperty("browser");
				System.out.println(bro);
				
				
			} 
			
			catch (Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				e.printStackTrace();
			}
			
		}

	

}
