package lalit.testScripts;

import org.testng.annotations.Test;

import plain.object.Repository.BasePage;
import plain.object.Repository.BillingTypesPage;
import plain.object.Repository.LoginPage;

public class DeleteThisBillingTypeTest extends SuperTestNG{

	@Test(dependsOnGroups={"add"})
	public void testDeletebillingType(){
		BasePage bp = new BasePage(driver);
		LoginPage lp = new LoginPage(driver);
		BillingTypesPage btp = new BillingTypesPage(driver);
		
	     lp.doLogin("admin", "manager");
	     bp.settings();
	     btp.deleteThisBillingType();
	    
	     btp.verifySuccessMessage();
	     bp.logout();
	}
}
