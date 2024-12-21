package TestNG;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTest {
	WebDriver driver=null;
	public static String browserName=null;
	
	@BeforeTest
	//@Parameters("browserName")
	public void setupBrowser() throws InterruptedException {
		
		PropertiesFile.getProperties();

		if (browserName.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.manage().window().maximize();

		}else if (browserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
			driver.manage().window().maximize();

		}
	}

	@Test(priority=1) 
	public void testLogin() throws InterruptedException, IOException {
		driver.navigate().to("https://google.com");
		driver.quit();
	}
	
	@Test(priority=2) 
	public void inputCredentials() throws InterruptedException, IOException {
		driver.get("https://manage.qa4.dotbricks.net/adminp/");
		driver.findElement(By.id("login_username")).sendKeys("abhishek.kumar@racknap.com");
		driver.findElement(By.id("login_password")).sendKeys("Abhi2213");
		Thread.sleep(3000);
		driver.findElement(By.id("kt_login_signin_submit_form")).click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void tearDownBrowser() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		PropertiesFile.setProperties();
	}
}
