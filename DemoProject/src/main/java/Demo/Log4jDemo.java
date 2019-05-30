package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger loggger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args)
	{
		System.out.println("\n   Hello World....!  \n");
		
		
		loggger.trace("This is Trace Message");
		loggger.info("This is Information Message");
		loggger.error("This is Error Message");
		loggger.warn("This is Warning Message");
		loggger.error("This is fatal Message");
		
		System.out.println("Completed");

	}

}
