package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaPOM {
		WebDriver d;
		WebElement un,btn;
		 public JavaPOM(WebDriver driver)
		 {
			 d=driver;
		 }
		 public void userName()
		 {
			un=d.findElement(By.id("Email"));
			un.sendKeys("kumaralok444");
			btn=d.findElement(By.id("next"));
			 btn.click();
		 }
		 
}

