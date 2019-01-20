package Org.testing.Org.testing.TestScripts;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import Pages.login;
import Pages.videoplay;

	public class TC4 extends base{
		ChromeDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  login l = new login(driver,pr);
			l.signin("sudha.pandey88@gmail.com","hjffuyfuy");
		  Thread.sleep(5000);
		  videoplay vp =new videoplay(driver,pr);
			vp.videop();
		 
			Thread.sleep(5000);
		  List<WebElement> subscribe = driver.findElements(By.xpath(pr.getProperty("sub")));

		subscribe.get(0).click();
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	  }
	  
	}

