package AutomationProject.automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppData {
	public static AndroidDriver<AndroidElement> Capabilities(String app) throws IOException  {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/AutomationProject/automation/global.properties");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		
		Properties prop = new Properties();
		prop.load(file);
		prop.get(app);
		File appDir = new File("src");
		File fs = new File(appDir,(String)prop.getProperty(app));
		String device1 = (String)prop.get("device");
		String auto = (String)prop.get("automationName");
		

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, device1);
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, auto);
		
		cap.setCapability("autoGrantPermissions", true);
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement>driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		
		}		


}
