package pack1;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Seventh 
{
	static WebDriver driver;
	public static void screenshotMetod() throws IOException
	{
		  TakesScreenshot sc=(TakesScreenshot)driver;
		    File Source = sc.getScreenshotAs(OutputType.FILE);
		    String jpg;
			File dest=new File("C:\\Users\\Rohit\\Desktop\\JavaScreenshot\\sc"+timestamp1()+".jpg");
		    FileHandler.copy(Source, dest);
			}

			private static String timestamp1() {
				// TODO Auto-generated method stub
				int yyyy;
				int mm;
				int dd;
				return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(new Date());
	}
	public static void main(String[] args) throws IOException, InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
    System.out.println("amazon opened");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().window().maximize();
//    TakesScreenshot sc=(TakesScreenshot)driver;
//    File Source = sc.getScreenshotAs(OutputType.FILE);
//    String jpg;
//	File dest=new File("C:\\Users\\Rohit\\Desktop\\JavaScreenshot\\sc"+timestamp()+".jpg");
//    FileHandler.copy(Source, dest);
//	}
//
//	private static String timestamp() {
//		// TODO Auto-generated method stub
//		int yyyy;
//		int mm;
//		int dd;
//		return new SimpleDateFormat("YYYY-MM-dd HH-mm-ss").format(new Date());
    screenshotMetod();
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
    Thread.sleep(3000);
    screenshotMetod();
    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    Thread.sleep(5000);
    screenshotMetod();
	}
}
