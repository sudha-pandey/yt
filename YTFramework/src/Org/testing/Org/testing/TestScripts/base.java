package Org.testing.Org.testing.TestScripts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
		public ChromeDriver driver;
		Properties pr;
		 @BeforeMethod
		  public void beforeMethod() throws IOException {
			 File f= new File("C:\\Users\\prity\\eclipse-workspace\\YTFramework\\src\\Org\\testing\\Org\\testing\\TestScripts\\OR.properties");
			 FileInputStream fi= new FileInputStream(f);
			  pr =new Properties();
			  pr.load(fi);
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\prity\\Desktop\\chromedriver\\chromedriver.exe");
				 driver = new ChromeDriver();
				driver.get("https://www.youtube.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  
		  
		/* @AfterMethod
		  public void afterMethod() {
			  driver.close();
			  
	}*/
		 

}}