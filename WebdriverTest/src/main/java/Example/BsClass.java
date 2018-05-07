package Example;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;



public class BsClass implements Constant{
	public WebDriver driver;	
	public ExtentReports extent;
	 @BeforeSuite
	 public void beforesuite()
	 {
	 extent= new ExtentReports("./test-output/index.html");
	 extent.loadConfig(new File("C:\\Users\\WINDOWS\\Desktop\\MyLocalRepo\\WebdriverTest\\Res\\extentreports-java-2.41.2"));
				 }
	 @BeforeClass
		public void beforeTest() {	
		 if(Constant.Browser.equals("firefox"))	
		{ System.setProperty("webdriver.gecko.driver","C:\\Users\\WINDOWS\\eclipse-workspace\\WebdriverTest\\Res\\geckodriver.exe");
		    driver = new FirefoxDriver();  
		}		
	 else if (Constant.Browser.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS\\eclipse-workspace\\WebdriverTest\\Res\\chromedriver.exe");
		    driver = new ChromeDriver();
	 }
	 }
	 @BeforeMethod
		 public void configBeforeMethod()
			{
				Reporter.log("Login",true);
				driver.get(url);		
				driver.findElement(By.name("uid")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys((password));
				driver.findElement(By.name("btnLogin")).click();
				//driver.findElement(By.name("btnReset")).click();
			}
	 
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@AfterMethod
		public void configAfterMethod()
		{
			Reporter.log("logout",true);
			driver.close();
		}
		@AfterClass
		public void afterTest() {
			driver.quit();			
		}		
@AfterSuite
public void Aftersuite()
{
	extent.flush();
	extent.close();
}
		
}
