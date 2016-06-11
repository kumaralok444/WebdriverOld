package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {
	public static void main(String args[])
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		String ExpectedTitle = "Guru99 Bank Home Page";
        String Title = driver.getTitle();
		
		WebElement User,Pass,SignIn,Logout;
		User = driver.findElement(By.name("uid"));
		User.clear();
		User.sendKeys("mngr12669");
		Pass = driver.findElement(By.name("password"));
		Pass.clear();
		Pass.sendKeys("ytuqydU");
		SignIn = driver.findElement(By.name("btnLogin"));
		SignIn.click();
		/*
		Newcus = driver.findElement(By.xpath("html/body/div[2]/div/ul/li[2]/a"));
		Newcus.click();
		WebElement CusName,Rbn,DOB,Add,City,State,PIN,Mnum,Email,sub,Logout;
		CusName = driver.findElement(By.name("name"));
		CusName.clear();
		CusName.sendKeys("priya123");
		Rbn = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]"));
		Rbn.click();
		DOB = driver.findElement(By.name("dob"));
		DOB.clear();
		DOB.sendKeys("13081996");
		Add = driver.findElement(By.name("addr"));
		Add.clear();
		Add.sendKeys("8 silver maple court");
		City = driver.findElement(By.name("city"));
		City.clear();
		City.sendKeys("chennai");
		State = driver.findElement(By.name("state"));
		State.clear();
		State.sendKeys("TN");
		PIN = driver.findElement(By.name("pinno"));
		PIN.clear();
		PIN.sendKeys("600005");
		Mnum = driver.findElement(By.name("telephoneno"));
		Mnum.clear();
		Mnum.sendKeys("9840683360");
		Email = driver.findElement(By.name("emailid"));
		Email.clear();
		Email.sendKeys("abc@gmail.com");
		Pass = driver.findElement(By.name("password"));
		Pass.clear();
		Pass.sendKeys("ytuqydU");
		sub = driver.findElement(By.name("sub"));
		sub.click();
		Logout = driver.findElement(By.xpath("html/body/div[2]/div/ul/li[15]/a"));
		Logout.click();*/
		try
		{
			Alert alert = driver.switchTo().alert();
			String textonalert = alert.getText();
			alert.accept();
			System.out.println(textonalert);
		}
		catch(NoAlertPresentException e)
		{
			System.out.println(e);
		}
			
				
		
		
		
	}

}
