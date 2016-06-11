package priya;


import org.apache.xpath.operations.String;
import org.testng.Assert;
import org.testng.annotations.Test;



public class grouptest
{
	String message=".com";
	TobeTest m=new TobeTest( message);
	
	@Test (groups={"funtest","checkintest"})
	public void testprintmessage()
	{
		System.out.println("Inside test print message()");
		 message=".com";
		Assert.assertEquals(message, m.printMessage());
	}
	
		@Test(groups={"checkintest"})
		public void testsaluatationmessage()
		{
			System.out.println("Inside Saluatation message()");
			message="7Eleven"+".com";
			Assert.assertEquals(message,m.SaluatationMessage());
		}
		
		@Test(groups={"funtest"})
		public void testingExitMessage()
		{
			System.out.println("Inside testingExit Message()");
			message="www"+"7Eleven"+".com";
			Assert.assertEquals(message, m.exitMessage());
			
		}
			
		}
