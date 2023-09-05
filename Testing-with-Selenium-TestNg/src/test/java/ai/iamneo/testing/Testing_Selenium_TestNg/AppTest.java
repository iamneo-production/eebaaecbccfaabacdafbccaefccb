package ai.iamneo.testing.Testing_Selenium_TestNg;

import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AppTest {

	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		
		driver = new RemoteWebDriver(new URL("https://localhost:4444"), chromeOptions);
		driver.get("https://www.flipkart.com");
		driver.switchTo().frame(0);
	}

	@Test
	public void testcase_1() throws InterruptedException 
   {
		String title = driver.getTitle();
		Assert.assertEquals(title, "title of the page");
	}

	@Test
	public void testcase_2() throws InterruptedException 
      {
	    
		   driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("vijji@gmail.com");
		   driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("1234");   
		   driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();   
		 String profilename = "get Yor profilename";
		 Assert.assertEquals(profilename, " ");
	}

		
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}