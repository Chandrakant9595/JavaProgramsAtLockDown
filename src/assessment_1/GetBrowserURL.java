package assessment_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetBrowserURL {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1, description="validate the URL")
	public void validateURL() {
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "https://www.facebook.com/");
		System.out.println(currentURL);
	}
	
	@Test(priority=2, dependsOnMethods= {"validateURL"}, description="Check the login functionality")
	public void loginTest() {
		//Enter User name
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shindevicky90@fmail.com");
		
		//Enter password
		driver.findElement(By.xpath("//input[@name='pass']")).clear();
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("c9595c");
		
		//click on login button
		driver.findElement(By.xpath("Log In")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
