package lalit.testScripts;

import org.testng.annotations.Test;

import plain.object.Repository.AddNewBillingTypePage;
import plain.object.Repository.BasePage;
import plain.object.Repository.BillingTypesPage;
import plain.object.Repository.LoginPage;

public class AddnewBillingTypeTest extends SuperTestNG {

	@Test
	public void verifySuccessfullyAddingBillingType(){
		BasePage bp = new BasePage(driver);
		LoginPage lp = new LoginPage(driver);
		BillingTypesPage btp = new BillingTypesPage(driver);
		AddNewBillingTypePage anbt = new AddNewBillingTypePage(driver);
		
		lp.doLogin("admin", "manager");
		bp.settings();
		btp.addNewBillingType();
		anbt.billingTypeName("EMC Square");
		anbt.createBillingType();
		anbt.verifySuccessMessage();
		bp.logout();
	}
}
