package AutomationProject.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassTestCases {
    WebDriver driver;
	 
	 public ForgotPassTestCases(WebDriver web_driver) {
		 driver = web_driver;
	       PageFactory.initElements(web_driver, this);
	       
	     
	}
		
	
	@FindBy(linkText = "Forgot password?")
	public WebElement fp;
	
	@FindBy(xpath ="//input[@type='email']")
	public WebElement EntEm;
	
	@FindBy(xpath = "//html/body/app-root/app-forgot/div/div/mat-card/mat-card-content/form/div[2]/button")
	public WebElement submit;
	
	
	public WebElement forgotPass() {		
		 return fp;	
	}
	
    public WebElement EntEmail() {
    	//WebElement element = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(EntEm));
    	//EntEm.sendKeys("ranju");
		 return EntEm;	
	}
    
    public WebElement submitEmail() {
    	return submit;
    }
}
