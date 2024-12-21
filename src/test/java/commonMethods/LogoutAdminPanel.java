package commonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.waitHelper;

public class LogoutAdminPanel {

	WebDriver driver;
	public waitHelper waithelper;

	// Using @FindBy to locate elements on the page
	@FindBy(xpath="//img[@alt='Pic']")
	WebElement icon_logout;	
	
	@FindBy(xpath="//button[text()='Logout']")
	WebElement btn_logout;

	// Constructor to initialize the driver and instantiate elements using PageFactory
	public LogoutAdminPanel(WebDriver driver) { 
		this.driver = driver; 
		PageFactory.initElements(driver,this);
	}

	//Action methods
	public void clickLogout() {	
		waithelper=new waitHelper(driver);
		waithelper.waitForElement(icon_logout, 30);
		icon_logout.click();
		waithelper.waitForElement(btn_logout, 30);
		btn_logout.click();
	}

}
