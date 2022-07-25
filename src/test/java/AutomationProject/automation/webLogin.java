package AutomationProject.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webLogin {
	
	public webLogin(WebDriver web_driver) {
	       PageFactory.initElements(web_driver, this);
	}
		
	
	@FindBy(id="mat-input-0")
	private WebElement email;
	
	@FindBy(id="mat-input-1")
	private WebElement pass;
	
	public webLogin getEmail() {
		 email.sendKeys("ganesh@versionx.in");
		 return this;
	}
	
	public webLogin getPass() {
		pass.sendKeys("Team@123");
		 return this;
		
	}
	
}
