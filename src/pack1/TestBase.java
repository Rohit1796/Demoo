package pack1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase  
{
	WebDriver Driver;
	@BeforeTest
	public void A()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.get("https://www.saucedemo.com.");
		POMLoginpage a=new POMLoginpage(Driver);
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	 @BeforeClass
		public void B()
		{
		POMLoginpage lp=new POMLoginpage(Driver);
		lp.sendusername();
		lp.sendpassword();
		lp.clicklogin();
	}
	@AfterMethod
	public void C() throws InterruptedException
	{
		PomHomepage z=new PomHomepage(Driver);
		z.threeline();	
		Thread.sleep(2000);
	 z.logout();
	
	}
	
	 
	

}
