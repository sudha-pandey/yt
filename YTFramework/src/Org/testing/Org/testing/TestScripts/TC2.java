package Org.testing.Org.testing.TestScripts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pages.login;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

	public class TC2 extends base{
		
	  @Test
	  public void f() throws InterruptedException {
		  login l = new login(driver,pr);
			l.signin("sudha.pandey88@gmail.com","hjffuyfuy");
		  driver.findElement(By.xpath(pr.getProperty("subscribtion"))).click();
	  }
	  

	  //@AfterMethod
	  //public void afterMethod() {
		  //driver.close();
	  //}

	}


