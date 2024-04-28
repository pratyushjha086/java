package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class FirstcryAC {
	WebDriver driver;
	Actions act;
@Test(priority=1)

  public void f() throws InterruptedException {
	  WebElement Account = driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		Account.click();
		Thread.sleep(1000);
		WebElement CA = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/div/span/a"));
		CA.click();
		WebElement FN = driver.findElement(By.xpath("//input[@name='firstname']"));
		FN.sendKeys("Pratyush");
		WebElement LN = driver.findElement(By.xpath("//input[@name='lastname']"));
		LN.sendKeys("Kumar");
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("pratyush16874@gmail.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("123456789");
		WebElement cpwd = driver.findElement(By.xpath("//input[@name='confirmpassword']"));
		cpwd.sendKeys("123456789");
		Thread.sleep(2000);
		WebElement Signin = driver.findElement(By.xpath("//button[@class='submit-btn']"));
        act.moveToElement(Signin).click().perform();
       Thread.sleep(2000);
  }
    @Test(priority=2)
   void SC() throws InterruptedException, IOException {
	  
  TakesScreenshot TS = (TakesScreenshot)driver;
  Thread.sleep(2000);
  File src = TS.getScreenshotAs(OutputType.FILE);
  File DS = new File ("D:\\Out8.png");  
  Thread.sleep(2000);
  FileUtils.copyFile(src, DS);
  System.out.println("Screenshot is Captured");
}


  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.get("https://firstcrystore.in/");
	  driver.manage().window().maximize();
	  act = new Actions(driver);
  }

  @AfterMethod
  public void afterMethod() {
         //driver.quit();
  }

}
