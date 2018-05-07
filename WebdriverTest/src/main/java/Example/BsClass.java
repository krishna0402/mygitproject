package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BsClass implements Constant{
	public WebDriver driver;	
	 
	 @BeforeTest
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
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		

		
}
