package Firsttest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test3 {
	public static void main (String args[]){
		WebDriver d = new FirefoxDriver();
		d.get("http://www.flipkart.com/");
		String a,b,c;
		a = d.getCurrentUrl();
	    b = d.getPageSource();
	    c = d.getTitle();
	    String expectedtitle = "Testing";
	    String actualtitle = d.getTitle();
	           if (expectedtitle .contentEquals(actualtitle))
	    {
	    	System.out.println("pass"); 	
	    }
	          else
	    {
	    	System.out.println("fail");
	    	
	    }
	           System.out.println( "The current url is "+ a);
	           System.out.println( "The page title is "+ c);
	      
	}
	}

