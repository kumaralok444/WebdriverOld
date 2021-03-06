package testing;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class test1 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*firefox", "file:///D:/ALOK/WEBTechnology/computershop/index.html");
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("file:///D:/ALOK/WEBTechnology/computershop/index.html");
		selenium.select("id=source", "label=Desktops");
		selenium.type("id=nm", "dell");
		selenium.click("id=btn");
		selenium.waitForPopUp("", "30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
