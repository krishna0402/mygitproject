package ToolTip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooTip 
{

	public static WebDriver driver;
	
		public static void main(String[] args) throws Throwable
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\WINDOWS\\Desktop\\MyLocalRepo\\WebdriverTest\\Res\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://omayo.blogspot.in/");
				WebElement TootipText=driver.findElement(By.xpath("//p[@text=www.selenium-by-arun.blogspot.com]"));
		TootipText.getAttribute("title");
		System.out.println(TootipText);
	}
}
