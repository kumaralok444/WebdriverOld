package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstTest {
	public static void main(String args[])
	{
		 WebDriver d=new FirefoxDriver();
		 d.get("https://www.thomaswoodenrailway.com/");
		 d.quit();
	}

}
