package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@id='uname']")
	private WebElement usernameTxt;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTxt;
	
	@FindBy(xpath = "//button[@id='proceed']")
	private WebElement loginBtn;
	
	
	public WebElement getUsernameTxt() {
		return usernameTxt;
	}


	public WebElement getPasswordTxt() {
		return passwordTxt;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void loginToApplication(String username,String password)
	{
		getUsernameTxt().sendKeys(username);
		getPasswordTxt().sendKeys(password);
		getLoginBtn().click();
	}

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
