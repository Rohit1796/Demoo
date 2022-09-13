package pack1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pombrowser 
{
	@Test
	 public void Browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com.");
		POMLoginpage a=new POMLoginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		a.sendusername();
		System.out.println("username entereded");
		a.sendpassword();
		System.out.println("password entereded");
		a.clicklogin();
		System.out.println("login clicked");
		PomHomepage b=new PomHomepage(driver);
		b.cart();
		System.out.println("product is in cart");
		Thread.sleep(5000);
		b.threeline();
		System.out.println("threeline clicked");
		Thread.sleep(5000);
		b.logout();
		System.out.println("logout successfully");
		System.out.println("test passed");
		}

}
