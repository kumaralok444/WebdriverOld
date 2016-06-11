package Firsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {



	public static void main(String args[]){
		WebDriver d = new FirefoxDriver();
		d.get("http://www.w3schools.com/");
		String u;
		u=d.getCurrentUrl();
		String expectedTitle="testing Page";
		String actualTitle;
		actualTitle=d.getTitle();
		if(expectedTitle.contentEquals(actualTitle))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");

		}
		System.out.println(u);
		u=d.getPageSource();
		System.out.println(u);
		d.close();
	}

}
