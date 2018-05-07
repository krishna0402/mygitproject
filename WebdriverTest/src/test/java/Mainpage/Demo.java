package Mainpage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import Example.SmListner;

@Listeners(SmListner.class)
public class Demo {
	
	
		
			@Test
			public void configDemoTest()
			{
				System.out.println("test started ");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS\\Desktop\\MyLocalRepo\\WebdriverTest\\Res\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.manage().window().maximize();
				
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				ArrayList<String> a=new ArrayList<String>();
				a.add("https://www.google.com");
				a.add("https://www.yahoo.com");
				a.add("https://www.amazon.com");
				a.add("https://www.ebay.com");
			
				for(int i=0;i<a.size();i++)
				{
					String urlLink1=a.get(i);
		        try {
					 
					URL link = new URL(urlLink1);
				
					HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
					
					httpConn.setConnectTimeout(2000);
					
					httpConn.connect();
				
						if(httpConn.getResponseCode()== 200) {	
							System.out.println(urlLink1+" - "+httpConn.getResponseMessage());
						}
						if(httpConn.getResponseCode()== 404) {
							System.out.println(urlLink1+" - "+httpConn.getResponseMessage());
						}
					}
					
				catch (Exception e) {
					e.printStackTrace();
				}
				}
				
		    } 
			
}
