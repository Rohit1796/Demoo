package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sixth 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
//		WebElement dropDown=driver.findElement(By.xpath("));
//		Select s=new Select(dropDown);
//		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
		System.out.println("mobile selected");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8698317109");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
}
