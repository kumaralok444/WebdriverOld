package groupTEst;

import org.apache.xpath.operations.String;

public class tobeTest {
	  private String message;

	   public tobeTest(String message) {
	      this.message = message;
	   }

	public String printMessage() {
	      System.out.println(message);
	      return message;
	   }

	   public String salutationMessage() {
	      message = "7Eleven" + message;
	      System.out.println(message);
	      return message;
	   }

	   public String exitMessage() {
	      message = "www." + message;
	      System.out.println(message);
	      return message;
	   }
}
