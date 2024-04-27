package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class StaticStbListPage extends WebDriverUtility{
	@FindBy(xpath="//select[@id='services']")
    private WebElement serviceTypeDropdown;
	
	@FindBy(xpath="//select[@id='backend_setup_id']")
	private WebElement serverTypeDropdown;
	
	@FindBy(xpath="//span[@id='select2-model-container']")
	private WebElement modelDropdown;
	
	@FindBy(xpath="//select[@id='stb_type']")
	private WebElement stbTypeDropdown;
	
	@FindBy(xpath="//select[@id='static_report_stb_status']")
	private WebElement stbStatusDropdown;
	
	@FindBy(xpath="//input[@id='customlabell']")
	private WebElement nonLocationCheckbox;
	
	@FindBy(xpath="//span[@id='select2-inventory_make-container']")
	private WebElement makeDropdown;
	
	@FindBy(xpath="//select[@id='sub_status']")
	private WebElement subscriptionStatusDropdown;
	
	@FindBy(xpath="//select[@id='customer_sla_static']")
	private WebElement customerSlaDropdown;
	
	@FindBy(xpath="//select[@id='show_remarks']")
	private WebElement showRemarkDropdown;
	
	@FindBy(xpath="//select[@id='state_id']")
	private WebElement lcoStateDropdown;
	
	@FindBy(xpath="//select[@id='users']")
	private WebElement userTypeDropdown;
	
	@FindBy(xpath="//span[@id='select2-usersname-container']")
	private WebElement selectUsertypeDropdown;
	
	@FindBy(xpath="//input[@id='generic_code']")
	private WebElement userCodeEdt;
	
	@FindBy(xpath="//button[@id='generic_search']")
	private WebElement searchUserCodeBtn;
	
	@FindBy(xpath="//button[@id='btnGenerate']")
	private WebElement generateBtn;
	
	@FindBy(xpath="//button[@id='formClear']")
	private WebElement clearBtn;

	public WebElement getServiceTypeDropdown() {
		return serviceTypeDropdown;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getModelDropdown() {
		return modelDropdown;
	}

	public WebElement getStbTypeDropdown() {
		return stbTypeDropdown;
	}

	public WebElement getStbStatusDropdown() {
		return stbStatusDropdown;
	}

	public WebElement getNonLocationCheckbox() {
		return nonLocationCheckbox;
	}

	public WebElement getMakeDropdown() {
		return makeDropdown;
	}

	public WebElement getSubscriptionStatusDropdown() {
		return subscriptionStatusDropdown;
	}

	public WebElement getCustomerSlaDropdown() {
		return customerSlaDropdown;
	}

	public WebElement getShowRemarkDropdown() {
		return showRemarkDropdown;
	}

	public WebElement getLcoStateDropdown() {
		return lcoStateDropdown;
	}

	public WebElement getUserTypeDropdown() {
		return userTypeDropdown;
	}

	public WebElement getSelectUsertypeDropdown() {
		return selectUsertypeDropdown;
	}

	public WebElement getUserCode() {
		return userCodeEdt;
	}

	public WebElement getSearchUserCodeBtn() {
		return searchUserCodeBtn;
	}

	public WebElement getGenerateBtn() {
		return generateBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public StaticStbListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void staticStbList(WebDriver driver,String seriveType,String serverType,String model,String stbType,String stbStatus,String make,String subscriptionStatus,String customerSla,String showRemark,String lcoState,String userType,String selectUsertype,String userCode)
	{
		handleDropdown(seriveType, serviceTypeDropdown);
		handleDropdown(serverType,serverTypeDropdown);
		handleDropdown(model,modelDropdown);
		handleDropdown(stbType,stbTypeDropdown);
		handleDropdown(stbStatus, stbStatusDropdown);
		nonLocationCheckbox.click();
		handleDropdown(make, makeDropdown);
		handleDropdown(subscriptionStatus,subscriptionStatusDropdown);
        handleDropdown(customerSla, customerSlaDropdown);
		handleDropdown(showRemark,showRemarkDropdown);
		handleDropdown(lcoState,lcoStateDropdown);
		handleDropdown(userType,userTypeDropdown);
		handleDropdown(selectUsertype,selectUsertypeDropdown);
		userCodeEdt.sendKeys(userCode);
		searchUserCodeBtn.click();
		generateBtn.click();
		clearBtn.click();
		
	}
	
	
}
