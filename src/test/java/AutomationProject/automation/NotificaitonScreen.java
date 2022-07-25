package AutomationProject.automation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NotificaitonScreen {
	public NotificaitonScreen(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		System.out.println("NotificaitonScreen is working fine");
		
	}
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[2]/android.widget.ImageView")
	private WebElement delete;


  public WebElement getDel() {
	  System.out.println("This is Delete");
      return delete;

}

	@AndroidFindBy(xpath="//android.widget.ImageView[@content-desc=\'More options\']")
	  private WebElement more;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\'Logout\']")
	  private WebElement logout;
	
	@AndroidFindBy(className="android.widget.Button")
	  private List<WebElement> confirm;
	
	@AndroidFindBy(className="android.widget.Button")
	  private List<WebElement> delConf;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView")
	  private WebElement detail;
	
	
	  public WebElement getOpt() {
		  System.out.println("This is More Options"+','+more);
	      return more;
	      
	  }
	  
	  public WebElement getLogout() {
		  System.out.println("This is More Options"+','+logout);
	      return logout;
	      
	  }
	  
	  public List<WebElement> getConfirm() {
		  System.out.println("This is More Options"+','+confirm);
	      return confirm;
	      
	  }
	  
	  public List<WebElement> getDelConf() {
		  System.out.println("This is More Options"+','+delConf);
	      return delConf;
	      
	  }
	  
	  public WebElement getDetail() {
		  System.out.println("This is More Options"+','+detail);
	      return detail;
	      
	  }

}