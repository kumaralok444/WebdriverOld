package parametrng;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ngclass {
	@Parameters({"first-name"})	
	@Test
	public void testSingleString(String firstName) {
	  System.out.println("Invoked testString " + firstName);
	  //Assert.assertEquals("Alok",firstName);
	  assert "Alok".equals(firstName);
	}

}
