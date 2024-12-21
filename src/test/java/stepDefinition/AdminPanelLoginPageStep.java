package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import commonMethods.LogoutAdminPanel;
import config.PropertiesFile;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagesClass.AdminPanelLoginPage;

public class AdminPanelLoginPageStep  {

	WebDriver driver=null;
	public AdminPanelLoginPage login;
	public LogoutAdminPanel log_out;
	public static String browserName=null;

	//annotation always runs before the execution of each test case.
	@Before
	public void browserSetup() throws InterruptedException {
		PageFactory.initElements(driver, AdminPanelLoginPage.class);
		
		PropertiesFile.getProperties();
		if (browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.manage().window().maximize();

		}else if (browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
			driver.manage().window().maximize();
		}}

	@Given("user is on Admin login page")
	public void user_is_on_Admin_login_page()   {
		driver.navigate().to("https://manage.iconcube.com/adminp/");
	}

	@When("^users enter (.*) and (.*)$")
	public void users_enter_username_and_password (String username, String password) {	
		login=new AdminPanelLoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("clicks on login")
	public void clicks_on_login()   {
		login.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	}

	@Then("user logout")
	public void user_logout()   {
		log_out=new LogoutAdminPanel(driver);
		log_out.clickLogout();
	}

	//annotation always runs after the execution of each test case.
	@After
	public void tearDown() throws InterruptedException {
		//driver.close();
		driver.quit();
	}
}
