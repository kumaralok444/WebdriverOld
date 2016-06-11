package TestCase;

import org.testng.annotations.Test;

public class SampleTest 
{
	
	@Test
	public void testCaseRegister()
	{
		System.out.println("Inside Register");
	}
	
	@Test(dependsOnMethods={"testCaseRegister"})
	public void testCaseLogin()
	{
		System.out.println("Inside Login");
	}
	
	@Test(dependsOnMethods={"testCaseRegister","testCaseLogin"})
	public void testCasePassword()
	{
		System.out.println("Inside Password");
	}

}
