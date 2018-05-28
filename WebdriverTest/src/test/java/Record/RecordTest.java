package Record;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class RecordTest {
	public static WebDriver driver;
	@Test
	public void TestVideoRecording() throws ATUTestRecorderException
	{
	//	DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		//  Date date = new Date();
ATUTestRecorder recoder= new ATUTestRecorder("C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\Screen","video",false);
		//ATUTestRecorder record = new ATUTestRecorder("/Maven/Video","TestVideo-"+dateFormat.format(date),false);
recoder.start();
System.setProperty("webdriver.gecko.driver","C:\\Users\\WINDOWS\\eclipse-workspace\\LiveProject\\resources\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	recoder.stop();
	}
}
