package groupTEst;


import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGclass {
	 String message = ".com";
	 tobeTest m = new tobeTest(message);

	   @Test(groups = { "functest", "checkintest" })
	   
	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = ".com";
	      Assert.assertEquals(message, m.printMessage());
	   }

	   @Test(groups = { "checkintest" })
	   
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "7Eleven" + ".com";
	      Assert.assertEquals(message, m.salutationMessage());
	   }

	   @Test(groups = { "functest" })
	   
	   public void testingExitMessage() {
	      System.out.println("Inside testExitMessage()");
	      message = "www." + "7Eleven"+".com";
	      Assert.assertEquals(message, m.exitMessage());
	   }  
}
