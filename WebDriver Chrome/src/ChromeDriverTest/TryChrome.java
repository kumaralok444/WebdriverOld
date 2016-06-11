package ChromeDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class TryChrome {
	public static void main(String args[])
	{
	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/ALOK/SWT/sserver/chromedriver_win32/chromedriver.exe");   
		driver = new ChromeDriver();
	   driver.get("file:///D:/ALOK/testingWebpage.html");
	   
	}
}
