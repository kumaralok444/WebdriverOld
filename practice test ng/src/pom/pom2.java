package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom2 {
	WebDriver priya;
	WebElement un,pwd,btn;
	public pom2(WebDriver d)
	{
		priya=d;
	}
	public void webpage(String username,String password)
	{
		un=priya.findElement(By.id("username"));
		un.clear();
		un.sendKeys(username);
		pwd=priya.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("password","hiii",Keys.ARROW_DOWN);
		btn=priya.findElement(By.name("login"));
		btn.click();
	}

}
