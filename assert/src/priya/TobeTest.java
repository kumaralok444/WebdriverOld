package priya;



public class TobeTest 
{
	private String message;
	public TobeTest(String message)
	{
		this.message=message;
	}
	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
	public String SaluatationMessage()
	{
		message="7Eleven"+".com";
	System.out.println(message);
      return message;
	}
public String exitMessage()
{
	message="www"+message;
	System.out.println(message);
	return message;
}
}
