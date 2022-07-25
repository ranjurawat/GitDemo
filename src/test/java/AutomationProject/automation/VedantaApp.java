package AutomationProject.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VedantaApp {
	
	public VedantaApp(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		System.out.println("Vedanta app is working fine");
		
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Code']")
	private WebElement code;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Password']")
	private WebElement password;
	
	@AndroidFindBy(className="android.widget.Button")
	private WebElement login;
	
	
	
	
	public VedantaApp getCode() {
		System.out.println("This is Code");
		code.sendKeys("8651002707");
	    return this;
	
 }
	public VedantaApp getPass() {
		password.sendKeys("8651002707");
	    return this;
	
 }
	public WebElement getLogin() {
	    return login;
	
 }

	
}
