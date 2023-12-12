package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class ListUsersPage extends WebDriverUtility{

	@FindBy(id = "users_type")
	private WebElement userTypeDropdown;
	
	@FindBy(id = "usersname")
	private WebElement chooseUser;
	
	@FindBy(xpath = "//button[@class='btn btn-primary waves-effect waves-light m-r-5']")
	private WebElement searchBtn;
	
	@FindBy(id = "empids[]")
	private WebElement checkBox;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement okBtn;
	
	@FindBy(xpath = "(//button[@id='btnResetPassword1'])[1]")
	private WebElement resetBtn;
	
	@FindBy(id = "user_new_password")
	private WebElement newPasswordEdt;
	
	@FindBy(id = "user_conform_password")
	private WebElement confirmPasswordEdt;
	
	@FindBy(id = "updt")
	private WebElement updateBtn;
	
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getUserTypeDropdown() {
		return userTypeDropdown;
	}
	public WebElement getChooseUser() {
		return chooseUser;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	public WebElement getNewPasswordEdt() {
		return newPasswordEdt;
	}
	public WebElement getConfirmPasswordEdt() {
		return confirmPasswordEdt;
	}
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	public WebElement getOkBtn() {
		return okBtn;
	}
	public WebElement getResetBtn() {
		return resetBtn;
	}
	public ListUsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void selectUserType(String userType, String LCO)
	{
		handleDropdown(userType, userTypeDropdown);
		handleDropdown(LCO, chooseUser);
		searchBtn.click();
		checkBox.click();
		resetBtn.click();
	}
	
	public void selectUserType(String userType)
	{
		handleDropdown(userType, userTypeDropdown);
		searchBtn.click();
		checkBox.click();
		resetBtn.click();
	}
}
