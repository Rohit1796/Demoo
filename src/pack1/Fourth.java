package pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fourth 
{
	static  WebDriver driver;
	public static void screenshotMethod() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);	
		  File destFile = new File("C:\\Users\\Rohit\\Desktop\\JavaScreenshot\\ts.jpg");
		FileHandler.copy(sourceFile, destFile);
		System.out.println("loginpagescreeshot taken");	
	}

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("XYZ@123gmail.com");
//        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
//        driver.findElement(By.xpath("//button[@name='login']")).click();
        screenshotMethod();
		
	}

}
