package AutomationProject.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;


public class AngularWebLogin {
      WebDriver driver;
      
      @Parameters({"url"})
      @BeforeTest
  	public void deleteCookieNamedExample(String url) {
  		driver= new ChromeDriver();
  		//String URL="https://vedanta-esl-dev.web.app";
  		driver.navigate().to(url);
  		driver.manage().deleteAllCookies();
  		}
      
//    @Parameters({"url"})
//    @BeforeTest 
//	public void webUrl(String url) throws InterruptedException {
//    	System.setProperty("webdriver.chrome.driver","/Users/versionx/eclipse-workspace/automation/chromedriver");
//    	WebDriver driver = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.get(url);
//		NgWebDriver ngDriver = new NgWebDriver(js);
//		ngDriver.waitForAngularRequestsToFinish();
//	} 
	
	
//	@Test
//	public void login() {
//		 webLogin wb = new webLogin(driver);
//	        wb.getEmail();
//	        wb.getPass();
//			
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath
//			("//button[@class='mat-focus-indicator btn-block btn-lg m-t-20 m-b-20 mat-raised-button mat-button-base mat-primary']"))).click();
//			
//	  }
	
  	@Test(priority=0)
	public void forgotPass() {		
		ForgotPassTestCases forgPass = new ForgotPassTestCases(driver);
		WebElement el= forgPass.forgotPass();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(el)).click();
			
	  }
	
	@Test(priority=1)
	public void enterEmail() {
		ForgotPassTestCases entEm = new ForgotPassTestCases(driver);
	    WebElement element = entEm.EntEmail();
	    WebElement  el = new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(element));
	    el.sendKeys("ranju@versionx.in");
	    
	    WebElement sub = entEm.submitEmail();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(sub)).click();
		
		
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(el)).sendKeys("ranju@versionx.in");
			
	  }
	
	
	
	
	
	
	
	
	
	
	

}
