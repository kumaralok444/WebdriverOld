package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver driver;
	 By user99 = By.name("uid");
	 By password99 = By.name("password");
	 By titleText =By.className("barone");
	 By lin = By.name("btnLogin");
	 public login(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 public void userName(String uname)
	 {
		 ((WebElement) driver.findElement(user99)).sendKeys(uname);
		 
	 }
	 public void setpassword(String passwd)
	 {
		 ((WebElement) driver.findElement(password99)).sendKeys(passwd);
	 }
     public void login()
     {
    	 driver.findElement(lin).click();
     }
     public String loginTitle()
     {
    	 return driver.findElement(titleText).getText();
     }
     public void loginPage(String unm,String pwd)
     {
    	 this.userName(unm);
    	 this.setpassword(pwd);
    	 this.login();
     }
}
