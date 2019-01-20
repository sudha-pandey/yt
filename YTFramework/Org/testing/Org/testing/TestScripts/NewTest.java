package Org.testing.Org.testing.TestScripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	ChromeDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']")).click();
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sudha.pandey88@gmail.com");
	  driver.findElement(By.xpath("//div[@id='identifierNext\']")).click();
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("siya2502");
	  driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
	  driver.findElement(By.xpath("//span[@class='title style-scope ytd-guide-entry-renderer']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prity\\Desktop\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
