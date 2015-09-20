package plain.object.Repository;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddNewBillingTypePage extends BasePage{
	
	@FindBy(name = "name0")
	private WebElement billingTypeName_Field;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement createBillingType_Button;
	@FindBy(className="successmsg")
	private WebElement success_Message;
	
	public AddNewBillingTypePage(WebDriver driver) {
		super(driver);
	PageFactory.initElements(driver, this);
	}
	

	public void billingTypeName(String billingName) {
		billingTypeName_Field.sendKeys(billingName);
		
	}
	public void createBillingType(){
		createBillingType_Button.click();
	}
	public void verifySuccessMessage(){
		String actual = success_Message.getText();
		String expected = "1 billing type has been successfully added.";
		
		Assert.assertEquals(actual, expected);
	}

}
