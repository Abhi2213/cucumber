package stepDefinition;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagesClass.customerRegistration;

public class customerRegistrationStep {
//	WebDriver driver=null;
//	public customerRegistration cr;
//
//	//annotation always runs before the execution of each test case.
//	@Before
//	public void browserSetup() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();	
//		driver.manage().window().maximize();
//	}
//
//	//annotation always runs after the execution of each test case.
//	@After
//	public void tearDown() throws InterruptedException {
//		driver.quit();
//	}
//
//	@Given("user is on marketplace")
//	public void user_is_on_marketplace() throws InterruptedException {
//		driver.navigate().to("https://manage.iconcube.com/order/cart.php");
//	}
//
//	@When("user click on email")
//	public void user_click_on_email () throws InterruptedException {	
//		cr=new customerRegistration(driver);
//		cr.clickEmail();
//	}
//
//	@And("user enter firstname")
//	public void user_enter_firstname() throws InterruptedException {
//		cr.fname(null);
//	}
//
//	@And("user enter lastname")
//	public void user_enter_lastname( ) throws InterruptedException {
//		cr.lname(null);
//	}
//	@And("user enter number")
//	public void user_enter_number( ) throws InterruptedException {
//		cr.contact(null);
//	}
//	@And("user enter emailid")
//	public void user_enter_emailid( ) throws InterruptedException {
//		cr.email(null);
//	}
//	@And("user enter password")
//	public void user_enter_password( ) throws InterruptedException, AWTException {
//		cr.pass(null);
//	
//	}
//	@And("user enter confirmpassword")
//	public void user_enter_confirmpasswordString( ) throws InterruptedException {
//		cr.cpass(null);
//	}
//
//	@And("user click create Account")
//	public void user_click_create_Account() throws InterruptedException {
//		cr.clickCreateAccount();
//	}
}
