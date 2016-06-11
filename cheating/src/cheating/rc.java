package cheating;

import com.thoughtworks.selenium.*;
import java.util.regex.Pattern;

public class rc extends SeleneseTestCase {
	public void setUp() throws Exception {
		setUp("file:///D:/ALOK/WEBTechnology/computershop/index.html", "*chrome");
	}
	public void rc() throws Exception {
		selenium.open("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		selenium.select("id=source", "label=Laptops");
		selenium.click("id=btn");
		selenium.waitForPopUp("", "30000");
		selenium.click("link=Apple");
	}
}
