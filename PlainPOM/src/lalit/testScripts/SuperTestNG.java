package lalit.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTestNG {
	WebDriver driver;

	@BeforeMethod
	public void preConditions() {
			driver = new FirefoxDriver();
		
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void postConditions() {
		driver.close();
	}
}
