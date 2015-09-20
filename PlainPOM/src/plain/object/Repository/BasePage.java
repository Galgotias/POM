package plain.object.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	
	
    @FindBy(className="logoutImg")
	private WebElement logout_Button;
    
    @FindBy(linkText="Settings")
    private WebElement settings_Link;
    
    
	public BasePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void logout(){
		logout_Button.click();
	}
	public void settings(){
		settings_Link.click();
	}
}

