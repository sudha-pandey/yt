package Org.testing.Org.testing.TestScripts;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import Pages.login;

	public class TC1 extends base{
		
			//ChromeDriver driver;
		  @Test
		  public void f() throws InterruptedException {
			  
		login l = new login(driver,pr);
		l.signin("sudha.pandey88@gmail.com","hjffuyfuy");
		
			  driver.findElement(By.xpath(pr.getProperty("trending"))).click();
		  }
		}




