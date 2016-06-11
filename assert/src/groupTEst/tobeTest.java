package groupTEst;



public class tobeTest {
	  private String m;

	   public tobeTest(String message) {
	      this.m = message;
	   }

	public String printMessage() {
	      System.out.println(m);
	      return m;
	   }

	   public String salutationMessage() {
	      m = "7Eleven" + m;
	      System.out.println(m);
	      return m;
	   }

	   public String exitMessage() {
	      m = "www." + m;
	      System.out.println(m);
	      return m;
	   }
}
