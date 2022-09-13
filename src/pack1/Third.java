package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(3000);
		 driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_2_bi\"]/div[3]/a"));
	}

}
