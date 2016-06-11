package Firsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Secondtest {
	public static void main(String args[])
	{
		WebDriver a = new FirefoxDriver();
		a.get("http://www.w3schools.com/");
		String b;
		b = a.getCurrentUrl();
		String expectedTitle;
		String actualTitle;
		expectedTitle = "W3schoold";
		actualTitle= a.getTitle();
		if (expectedTitle.contentEquals(actualTitle))
		{
			System.out.println("Test pass");
		}
		else
		{
	       System.out.println("Test Fail");
		}
		
	}

}
