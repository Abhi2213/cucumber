package pagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.waitHelper;

public class AdminPanelLoginPage {

	WebDriver driver;
	public waitHelper waithelper;

	// Using @FindBy to locate elements on the page
	@FindBy(id="login_username")
	WebElement txt_username;

	@FindBy(id="login_password")
	WebElement txt_password;

	@FindBy(id="kt_login_signin_submit_form")
	WebElement btn_button;


	// Constructor to initialize the driver and instantiate elements using PageFactory
	public AdminPanelLoginPage(WebDriver driver) { 
		this.driver = driver; 
		PageFactory.initElements(driver,this);
	}

	//Action methods
	public void enterUsername(String username) {	// Created object for waitHelper class
		waithelper=new waitHelper(driver);
		// wait for max 20 seconds till element is present
		waithelper.waitForElement(txt_username, 30);
		txt_username.sendKeys(username);		
	}

	public void enterPassword(String password) {		
		waithelper.waitForElement(txt_password, 30);
		txt_password.sendKeys(password);		
	}

	public void clickLogin() {	
		waithelper.waitForElement(btn_button, 30);
		btn_button.click();
	}


}
