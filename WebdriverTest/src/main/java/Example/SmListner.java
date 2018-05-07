package Example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class SmListner implements ITestListener{
public void onTestFailure(ITestResult r)
	
	{
		String failedtestname=r.getMethod().getMethodName();
		EventFiringWebDriver edriver= new EventFiringWebDriver(BsClass.driver);
	File src= edriver.getScreenshotAs(OutputType.FILE);
	File dstfile= new File ("./Screenshot/" +failedtestname+ ".png");
	try
	{
		FileUtils.copyFile(src, dstfile);
	}
	catch(IOException e)
	{
		
	}
	
	}

	


	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
