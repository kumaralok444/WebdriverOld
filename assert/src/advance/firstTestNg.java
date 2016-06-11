package advance;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class firstTestNg {
	 @BeforeClass
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
	 }
	 
	 @Test(groups={ "fast" })
	 public void FastTest() {
	   System.out.println("Fast test");
	 }
	 
	 @Test(groups = { "slow" })
	 public void SlowTest() {
	    System.out.println("Slow test");
	 }

}
