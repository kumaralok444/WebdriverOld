package remotecon;

import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

public class rc {
	//@SuppressWarnings("deprecation")
	public Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "http://newtours.demoaut.com/", null);
		selenium.start();
	}

	@Test
	public void testUntitled() throws Exception {
		selenium.open("http://newtours.demoaut.com/");
		selenium.type("name=userName", "alok");
		selenium.type("name=password", "alok");
		selenium.click("name=login");
		selenium.waitForPageToLoad("30000");
		selenium.select("name=passCount", "label=3");
		selenium.select("name=fromPort", "label=New York");
		selenium.select("name=fromDay", "label=16");
		selenium.select("name=toPort", "label=New York");
		selenium.click("css=font > font > input[name=\"servClass\"]");
		selenium.select("name=airline", "label=Unified Airlines");
		selenium.click("name=findFlights");
		selenium.waitForPageToLoad("30000");
		selenium.click("name=reserveFlights");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
