package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login1 {
	WebDriver d;
	WebElement un,pass,btn;
	 public login1(WebDriver driver)
	 {
		 this.d=driver;
	 }
	 public void userName(String uname)
	 {
		un=d.findElement(By.id("username"));
		un.sendKeys(uname);
		 
	 }
	 public void setpassword(String passwd)
	 {
		pass=d.findElement(By.id("password"));
		pass.sendKeys(passwd);
	 }
    public void login()
    {
   	  btn=d.findElement(By.name("login"));
   	  btn.click();
    }
    public void loginPage(String unm,String pwd)
    {
   	 this.userName(unm);
   	 this.setpassword(pwd);
   	 this.login();
    }
}
