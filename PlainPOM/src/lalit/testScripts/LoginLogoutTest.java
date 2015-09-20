package lalit.testScripts;

import org.testng.annotations.Test;

import plain.object.Repository.BasePage;
import plain.object.Repository.LoginPage;



public class LoginLogoutTest extends SuperTestNG{

	@Test
	public void testLoginLogout(){
		LoginPage lp = new LoginPage(driver);
		BasePage bp = new BasePage(driver);
		
		
		lp.doLogin("admin", "manager");
		lp.logout();
		
	}
}
