package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class april15 {
	WebDriver driver;
	Actions act;
  @Test
  public void rightclick() {
	WebElement abc =  driver.findElement(By.xpath("//span[normalize-space()='Hotels']"));
	act = new Actions(driver);
	act.contextClick(abc).build().perform();
  }
  @Test
  public void mhover() {
	  WebElement mh = driver.findElement(By.xpath("//a[contains(text(),'My Account')]"));
	  act = new Actions(driver);
	  act.moveToElement(mh).build().perform();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://www.yatra.com/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
