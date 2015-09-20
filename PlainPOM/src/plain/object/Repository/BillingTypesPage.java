package plain.object.Repository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BillingTypesPage extends BasePage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@value='Add New Billing Type']")
	private WebElement addNewBillingType_Button;
	@FindBy(xpath = "//a[text()='EMC Square']/../..//a[text()='delete this billing type']")
	private WebElement deleteBillingType_Link;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement success_Message;

	public BillingTypesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void addNewBillingType() {
		addNewBillingType_Button.click();
	}

	public void deleteThisBillingType() {
		deleteBillingType_Link.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	
	public void verifySuccessMessage(){
	String actual = success_Message.getText();
	String expected ="Billing type has been successfully deleted.";
	Assert.assertEquals(actual, expected);
	}

}
