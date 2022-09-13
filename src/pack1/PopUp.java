package pack1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");

		//vctcwebsite address
	    String mainPageAddress = driver.getWindowHandle();
//		System.out.println("main page address is- "+mainPageAddress);
		
		//-------------------------------
		
		
		//child browser pop-up
		//ele-start selepracctice--> click
		
		WebElement startSelePracticeLink= driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		startSelePracticeLink.click();
		
		//two webpages are opened
		//parent + child
		
		//Set concept does not follow the index concept
		//so we cant judge which address will of which webpage
		
//		Set<String>allPageAddresses= driver.getWindowHandles();
//		System.out.println(allPageAddresses);
		
		//List concept
		//index followed-->Yes
//		int x = 100;
//		double y = (double)x;
		
//	  List<String>allPageAddresses = new ArrayList<String>(driver.getWindowHandles());
//	System.out.println(allPageAddresses);
	
	//next page child page switch
		String address=driver.getWindowHandle();
	
	driver.switchTo().window(address);
		
	//selenium focus went on child page now
	WebElement textBox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	textBox.sendKeys("INDIA");
	
	

	

}
}
