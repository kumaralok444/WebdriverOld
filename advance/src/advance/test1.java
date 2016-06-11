package advance;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class test1 {
	 /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {    
            WebDriver driver = new FirefoxDriver();
      driver.navigate().to("http://jqueryui.com/slider/");
      Thread.sleep(10000L);
      driver.switchTo().frame(0);  
      Thread.sleep(5000L);
      WebElement slider=driver.findElement(By.xpath("//div[@id='slider']"));
      int width=slider.getSize().width;
      System.out.println(width);
      Actions act=new Actions(driver);  
      act.clickAndHold(slider);
      act.moveByOffset(120, 0).build().perform();
      driver.quit();
  
      }
}
