package nextbridge.com_VisualValidation_MainCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class utility {
	WebDriver driver;
	public utility(WebDriver driver) {
		this.driver=driver;
	}
	public void pageTimeOut(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}
}
