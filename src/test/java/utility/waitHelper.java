package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitHelper {
	
	public WebDriver driver;
	
	public waitHelper(WebDriver driver) { 

		this.driver = driver; 
		//PageFactory.initElements(driver,this);
	}

	public void waitForElement(WebElement element,long timeOutInSeconds)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
