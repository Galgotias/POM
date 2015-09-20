package plain.object.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	@FindBy(name = "username")
	private WebElement UserName_Field;
	@FindBy(name = "pwd")
	private WebElement Password_Field;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement LoginNow_Button;
	@FindBy(xpath=".//*[@id='ErrorsTable']/tbody/tr/td[2]/table/tbody/tr/td/span")
	private WebElement Error_Msg;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void doLogin(String UN,String PWD){
		UserName_Field.sendKeys(UN);
		Password_Field.sendKeys(PWD);
		LoginNow_Button.click();
	}
}
