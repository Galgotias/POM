package plain.object.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingTypesPage extends BasePage{
	@FindBy(xpath = "//input[@value='Add New Billing Type']")
	private WebElement addNewBillingType_Button;

	public BillingTypesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void addNewBillingType() {
		addNewBillingType_Button.click();
	}

}
