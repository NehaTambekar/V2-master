package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class STBManagementPage extends WebDriverUtility{

	@FindBy(id = "users")
	private WebElement usersDropdown;
	
	@FindBy(id = "generic_code")
	private WebElement usersCode;
	
	@FindBy(id = "generic_search")
	private WebElement usersCodeSearchBtn;
	
	@FindBy(id = "services")
	private WebElement serviceTypeDropdown;
	
	@FindBy(id = "backend_setup_id")
	private WebElement serverTypeDropdown;
	
	@FindBy(id = "stb_status")
	private WebElement stbStatusDropdown;
	
	@FindBy(id = "sub_status")
	private WebElement subscipstionStatusDropdown;
	
	@FindBy(id = "sbt_search")
	private WebElement searchBtn;

	public STBManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsersDropdown() {
		return usersDropdown;
	}

	public WebElement getUsersCode() {
		return usersCode;
	}

	public WebElement getUsersCodeSearchBtn() {
		return usersCodeSearchBtn;
	}

	public WebElement getServiceTypeDropdown() {
		return serviceTypeDropdown;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getStbStatusDropdown() {
		return stbStatusDropdown;
	}

	public WebElement getSubscipstionStatusDropdown() {
		return subscipstionStatusDropdown;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public void stbManagement(WebDriver driver, String userType, String usercode, String serviceType, String subscriptionStatus) throws Throwable
	{
		handleDropdown(userType, usersDropdown);
		waitForPageLoad(driver);
		usersCode.sendKeys(usercode);
		usersCodeSearchBtn.click();
		handleDropdown(serviceType, serviceTypeDropdown);
		handleDropdown(subscriptionStatus, subscipstionStatusDropdown);
		searchBtn.click();
		waitForPageLoad(driver);
		
		
	}
}
