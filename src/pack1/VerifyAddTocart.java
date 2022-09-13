package pack1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerifyAddTocart extends TestBase
{
	@BeforeMethod
	 public void D() throws InterruptedException
	 {
		PomHomepage hp=new PomHomepage(Driver);
		hp.cart();
		Thread.sleep(2000);
	 }
	@Test
	public void E()
	{
		System.out.println("Hii this is E");
	}
	@Test
	public void F()
	{
		System.out.println("F");
	}
	

}
