package AutomationProject.automation;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class detailDialog extends AppData {
	
	@Test
	public void vedLogin() throws IOException, InterruptedException {
		AndroidDriver<AndroidElement>driver=Capabilities("App");
		System.out.println("This is Vedanta Details dialog box");
		
		NotificaitonScreen notify = new NotificaitonScreen(driver);
		notify.getDetail().click();
		
	}

}
