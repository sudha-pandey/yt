package Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	ChromeDriver driver;
	Properties pr;
	public login(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
		
	}
	public void signin(String username ,String password) throws InterruptedException
	{
		  driver.findElement(By.xpath(pr.getProperty("signin"))).click();
		  driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys(username);
		  driver.findElement(By.xpath(pr.getProperty("next"))).click();
		  driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(password);
		  driver.findElement(By.xpath(pr.getProperty("nextt"))).click();
		  Thread.sleep(1000);
	}

}
