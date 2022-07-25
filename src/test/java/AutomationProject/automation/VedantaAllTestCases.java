package AutomationProject.automation;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class VedantaAllTestCases extends AppData {

	@Test
	public void vedLogin() throws IOException, InterruptedException {
	AndroidDriver<AndroidElement>driver=Capabilities("App");
	System.out.println("This is Vedanta login");
	
	
	VedantaApp vLogin = new VedantaApp(driver);
	vLogin.getCode();
	vLogin.getPass();
	vLogin.getLogin().click();
	
	NotificaitonScreen notify = new NotificaitonScreen(driver);
	Thread.sleep(3000);
	notify.getOpt().click();
	notify.getLogout().click();
	notify.getConfirm().get(1).click();
//	notify.getDel().click();
//	notify.getDelConf().get(1).click();
	}
}
