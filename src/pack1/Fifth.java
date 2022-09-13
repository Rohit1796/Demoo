package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
      String s=   driver.getCurrentUrl();
      System.out.println(s);
    	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("XYZ@123gmail.com");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath(" /html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[4]/div/a")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("XYZ@123gmail.com");
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("//button[@id='did_submit']")).click();
    	 Thread.sleep(2000);
    	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/form/div/div[3]/div/div[1]/a")).click();
    	 Thread.sleep(2000);
      }
     
}
