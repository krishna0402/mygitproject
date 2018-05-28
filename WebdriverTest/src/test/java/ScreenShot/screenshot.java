package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshot {
static WebDriver driver;
static String  url="http://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/";
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\resources\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
	WebElement wb= driver.findElement(By.className("title single-title entry-title"));
	EventFiringWebDriver edriver=new EventFiringWebDriver(driver);  //TakesScreenshot T=((TakesScreenshot)driver);
	File src=edriver.getScreenshotAs(OutputType.FILE);				//File src=T.getScreenshotAs(OutputType.File);
	File dest=new File("C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\snapshot\\test.png");
	FileUtils.copyFile(src, dest);

	
}
}
