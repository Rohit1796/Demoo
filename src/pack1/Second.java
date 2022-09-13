package pack1;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Second 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rohit\\Desktop\\Velocity\\Automation tool\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
//		driver.manage().window().minimize();
//		Thread.sleep(1000);
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		driver.getCurrentUrl();
//		driver.getTitle();
//		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		driver.getCurrentUrl();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String expectedurl="https://www.google.com/";
		if(url.equals(expectedurl))
		{
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
		}
		
	}

		 
		 	} 

