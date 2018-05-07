package Mainpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Example.Appache;

public class Yahoopage 
{
//public static WebDriver driver;
//public String url="https://in.yahoo.com";
Appache a= new Appache();

public void loginpage() throws Throwable
{
	 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WINDOWS\\Desktop\\MyLocalRepo\\WebdriverTest\\Res\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.yahoo.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("uh-signin")).click();
	driver.findElement(By.id("createacc")).click();
	String exp="First name";
	String act =driver.findElement(By.id("usernamereg-firstName")).getAttribute("aria-label");
	if (exp.equals(act))
	{
		System.out.println("right place to write the name");
	}
	String fname=a.getExceldata("sheet1",1,0);
	driver.findElement(By.id("usernamereg-firstName")).sendKeys(fname);
	String lname=a.getExceldata("sheet 1", 1, 1);
	driver.findElement(By.id("usernamereg-lastName")).sendKeys(lname);
	String email=a.getExceldata("sheet 1",1,2);
	driver.findElement(By.id("usernamereg-yid")).sendKeys(email);
	String pass=a.getExceldata("sheet 1",1,3);
	driver.findElement(By.id("usernamereg-password")).sendKeys(pass);
	WebElement msel=driver.findElement(By.name("shortCountryCode"));
	Select sel= new Select(msel);
	sel.selectByValue("India ‪(+91)");
	String mnumber=a.getExceldata("sheet 1",1,4);
	driver.findElement(By.id("usernamereg-phone")).sendKeys(mnumber);
	WebElement msel1=driver.findElement(By.id("usernamereg-month"));
	Select sel1= new Select(msel1);//can't we write one select method and can use many more times
	sel1.selectByIndex(2);
	driver.findElement(By.id("usernamereg-day")).sendKeys("04");
	driver.findElement(By.id("usernamereg-year")).sendKeys("1988");
	driver.findElement(By.id("reg-submit-button")).click();
}

}

