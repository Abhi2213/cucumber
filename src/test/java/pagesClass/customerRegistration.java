package pagesClass;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.waitHelper;

public class customerRegistration {
//
//	WebDriver driver;
//	public waitHelper waithelper=null;
//
//	// Using @FindBy to locate elements on the page
//	@FindBy(id="cont_email")
//	WebElement Email;
//
//	@FindBy(id="firstname")
//	WebElement firstname;
//
//	@FindBy(id="lastname")
//	WebElement lastname;
//
//	@FindBy(id="contact_no")
//	WebElement contact_no;
//
//	@FindBy(id="regi_email")
//	WebElement regi_email;
//
//	@FindBy(id="password")
//	WebElement password;
//
//	@FindBy(id="confirm_password")
//	WebElement confirm_password;
//
//	@FindBy(xpath="//input[@value='customer_form']/following-sibling::div[1]")
//	WebElement createAccount;
//
//
//	// Constructor to initialize the driver and instantiate elements using PageFactory
//	public customerRegistration(WebDriver driver) { 
//		this.driver = driver; 
//		PageFactory.initElements(driver,this);
//	}
//
//	//Action methods
//	public void clickEmail() throws InterruptedException {	
//		waithelper =new waitHelper(driver);
//		waithelper.waitForElement(Email, 30);
//		Email.click();
//		Thread.sleep(2000);
//	}
//	public void fname(String fname) {		
//		waithelper.waitForElement(firstname, 30);
//		firstname.sendKeys("Fname");		
//	}
//	public void lname(String lname) {		
//		waithelper.waitForElement(lastname, 30);
//		lastname.sendKeys("Lname");		
//	}
//	public void contact(String contact) {		
//		waithelper.waitForElement(contact_no, 30);
//		contact_no.sendKeys("8989898989");		
//	}
//	public void email(String email) {		
//		waithelper.waitForElement(regi_email, 30);
//		regi_email.sendKeys("sfsdf34534@gmail.com");		
//	}
//	public void pass(String pass) throws InterruptedException, AWTException {		
//		waithelper.waitForElement(password, 30);
//		password.sendKeys("Abhi@2213");	
//		Thread.sleep(2000);
////		Actions actions = new Actions(driver);
////
////		Robot robot = new Robot();
////
////		robot.mouseMove(50,50);
////
////		actions.click().build().perform();
////		Thread.sleep(5000);
//	}
//	public void cpass(String cpass) throws InterruptedException {		
//		waithelper.waitForElement(confirm_password, 30);
//		confirm_password.sendKeys("Abhi@2213");		
//		Thread.sleep(2000);
//		
//	}
//	public void clickCreateAccount() throws InterruptedException {	
//		waithelper.waitForElement(createAccount, 30);
//		createAccount.click();
//		Thread.sleep(5000);
//	}
}
