package com.example.tests;
	import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.ie.*;
import org.testng.annotations.*;

import static org.testng.Assert.*;

	public class iddatadriven {

		WebDriver driver;
		Selenium selenium;

		@BeforeMethod
		public void startSelenium() {
			driver = new FirefoxDriver();
			selenium = new WebDriverBackedSelenium(driver, "http://www.demo.guru99.com/v4/");
		}

		@AfterMethod
		public void stopSelenium() {
			driver.close();
		}

		@Test
		public void testHandlingalertmsg() {
			selenium.open("http://www.demo.guru99.com/V4/");
			selenium.type("name=uid", "abcd");
			selenium.type("name=password", "acdf");
			selenium.click("name=btnLogin");
			selenium.waitForPageToLoad("30000");
			selenium.type("name=uid", "efgh");
			selenium.type("name=password", "rtyu");
			selenium.click("name=btnLogin");
			selenium.waitForPageToLoad("30000");
			selenium.type("name=uid", "tyui");
			selenium.type("name=password", "klpo");
			selenium.click("name=btnLogin");
			selenium.waitForPageToLoad("30000");
			selenium.type("name=uid", "mngr14771");
			selenium.type("name=password", "AbAtejY");
			selenium.click("name=btnLogin");
			selenium.waitForPageToLoad("30000");
			selenium.click("link=Log out");
		}

	}




