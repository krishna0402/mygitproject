package ScreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Entirepagescreenshot {
static WebDriver driver;
static String url="http://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/";
public static void main(String[] args) throws Throwable
{
System.setProperty("webdriver.gecko.driver","C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\resources\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get(url);
//File src=((EventFiringWebDriver)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src,new File("C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\snapshot\\entirepage.png"));
Screenshot sc= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(5000)).takeScreenshot(driver);
ImageIO.write(sc.getImage(),"JPEG",new File("\\C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\snapshot\\page.png"));



}

}
