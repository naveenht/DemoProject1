package Demo;

public class ExceptionDemo1 
{

	public static void main(String[] args) throws Exception 
	{
		demo();
	}
	
	public static void demo() throws Exception
	{
//		try
//		{
			System.out.println("Exception Handling in Selenium Framework");
			int i=1/0;
			System.out.println("Completed");
//		}
//		catch(Exception e)
//		{
//			System.out.println("Am inside Catch");
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			e.printStackTrace();
//			
//		}
//		
//		finally 
//		{
//			System.out.println("Am in finally block");
//		}
		
	}

}