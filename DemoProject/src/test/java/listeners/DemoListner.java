package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListners.class)

public class DemoListner 
{
	
	@Test
	public void test1()
	{
		System.out.println("for Testcase-1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("for Testcase-1");
	}
	
	@Test
	public void test3()
	{
		System.out.println("for Testcase-1");
	}
	
	
}
