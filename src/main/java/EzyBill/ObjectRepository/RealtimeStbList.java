package EzyBill.ObjectRepository;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class RealtimeStbList extends WebDriverUtility{
	@FindBy(xpath="//select[@id='services']")
	private WebElement serviceTypeDropdown;

	@FindBy(xpath="//select[@id='backend_setup_id']")
	private WebElement serverTypeDropdown;
	
	@FindBy(id="txtCustomerName")
    private WebElement customerNameEdt;
	
	@FindBy(id="txtAccountNumber")
	private WebElement cafNumberEdt;
	
	@FindBy(xpath="//input[@id='serial_number']")
	private WebElement serialNumberEdt;
	
	@FindBy(xpath="//input[@id='txtMacAddress']")
	private WebElement vcNumberEdt;
	
	@FindBy(xpath="//span[@id='select2-model-container']")
	private WebElement modelDropdown;
	
	@FindBy(xpath="//select[@id='selStatus']")
	private WebElement customerStatusDropdown;
	
	@FindBy(xpath="//select[@id='status1']")
	private WebElement statusDropdown;
	
	@FindBy(xpath="//select[@id='sub_status']")
	private WebElement subcriptionStatusDropdown;
	
	@FindBy(xpath="//select[@id='stb_type']")
	private WebElement stbTypeDropdown;
	
	@FindBy(xpath="//select[@id='stb_status']")
	private WebElement stbStatusDropdown;
	
	@FindBy(xpath="//input[@id='inst_date']")
	private WebElement installationDate;
	
	//@FindBy(xpath="(//button[@id='generic_search1'])[1]")
	//private WebElement calender;
	
	@FindBy(xpath="//span[@id='select2-customerCity-container']")
	private WebElement cityAreaDropdown;
	
	@FindBy(xpath="//input[@id='mobileno']")
	private WebElement mobileNoEdt;
	
	@FindBy(xpath="//input[@id='lco_customer_id']")
	private WebElement lcoCustomerIdEdt;
	
	@FindBy(xpath="//select[@id='users']")
	private WebElement userTypeDropdown;
	
	@FindBy(xpath=" //span[@id='select2-usersname-container']")
	private WebElement userTypeSearchDropdown;
	
	@FindBy(xpath=" //input[@id='generic_code']")
	private WebElement userCodeEdt;
	
	@FindBy(xpath=" //button[@id='generic_search']")
	private WebElement userSearchBtn;
	
	@FindBy(xpath=" //select[@id='customer_id_type']")
	private WebElement customerIdTypeDropdown;
	
	@FindBy(id="customer_id_number")
	private WebElement customerIdEdt;
	
	@FindBy(id="inventory_status")
	private WebElement inventoryDropdown;
	
	@FindBy(id="batch_no")
	private WebElement batchNoEdt;
	
	@FindBy(id="show_remarks")
	private WebElement showRemarkDropdown;
	
	@FindBy(id="customer_sla")
	private WebElement customerSlaDropdown;
	
	@FindBy(id="state_id")
	private WebElement lcoStateDropdown;
	
	@FindBy(xpath="//select[@fdprocessedid='p0b899']")
	private WebElement downloadTypeDropdown;
	
	@FindBy(id="sbtSearch")
	private WebElement searchBtn;
	
	@FindBy(id="btnClear")
	private WebElement clearBtn;

	public RealtimeStbList(WebDriver drive) {
	 PageFactory.initElements(drive, this);
	}

	public WebElement getServiceTypeDropdown() {
		return serviceTypeDropdown;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getCustomerNameEdt() {
		return customerNameEdt;
	}

	public WebElement getCafNumberEdt() {
		return cafNumberEdt;
	}

	public WebElement getSerialNumberEdt() {
		return serialNumberEdt;
	}

	public WebElement getVcNumberEdt() {
		return vcNumberEdt;
	}

	public WebElement getModelDropdown() {
		return modelDropdown;
	}

	public WebElement getCustomerStatusDropdown() {
		return customerStatusDropdown;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public WebElement getSubcriptionStatusDropdown() {
		return subcriptionStatusDropdown;
	}

	public WebElement getStbTypeDropdown() {
		return stbTypeDropdown;
	}

	public WebElement getStbStatusDropdown() {
		return stbStatusDropdown;
	}

	public WebElement getInstallationDate() {
		return installationDate;
	}

	public WebElement getCityAreaDropdown() {
		return cityAreaDropdown;
	}

	public WebElement getMobileNoEdt() {
		return mobileNoEdt;
	}

	public WebElement getLcoCustomerIdEdt() {
		return lcoCustomerIdEdt;
	}

	public WebElement getUserTypeDropdown() {
		return userTypeDropdown;
	}

	public WebElement getUserTypeSearchDropdown() {
		return userTypeSearchDropdown;
	}

	public WebElement getUserCodeEdt() {
		return userCodeEdt;
	}

	public WebElement getUserSearchBtn() {
		return userSearchBtn;
	}

	public WebElement getCustomerIdTypeDropdown() {
		return customerIdTypeDropdown;
	}

	public WebElement getCuatomerIdEdt() {
		return customerIdEdt;
	}

	public WebElement getInventoryDropdown() {
		return inventoryDropdown;
	}

	public WebElement getBatchNoEdt() {
		return batchNoEdt;
	}

	public WebElement getShowRemarkDropdown() {
		return showRemarkDropdown;
	}

	public WebElement getCustomerSlaDropdown() {
		return customerSlaDropdown;
	}

	public WebElement getLcoStateDropdown() {
		return lcoStateDropdown;
	}

	public WebElement getDownloadTypeDropdown() {
		return downloadTypeDropdown;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}
	
	public void realTimeStbList(WebDriver driver, String serviceType, String serverType, String customerName, String cafNumber, String serialNumber, String vcNumber
	,String model, String customerStatus, String status,String subscriptionStatus,
	String stbType, String stbStatus, String cityArea,String mobileNo, String lcoCustomerId
	,String userType, String userTypeSearch, String userCode, String customerIdType, String customerId, String inventory,
	String batchNo, String showRemarks,String customerSla, String lcoStatus, String downloadType)
	{
		handleDropdown(serviceType,serviceTypeDropdown);
		handleDropdown(serverType,serverTypeDropdown);
		customerNameEdt.sendKeys(customerName);
		cafNumberEdt.sendKeys(cafNumber);
		serialNumberEdt.sendKeys(serialNumber);
		vcNumberEdt.sendKeys(vcNumber);
		handleDropdown(model, modelDropdown);
		handleDropdown(customerStatus,customerStatusDropdown);
		handleDropdown(status,statusDropdown);
		handleDropdown(subscriptionStatus,subcriptionStatusDropdown);
		handleDropdown(stbType,stbTypeDropdown);
		handleDropdown(stbStatus,stbStatusDropdown);
		//installation date
		handleDropdown(cityArea,cityAreaDropdown);
		mobileNoEdt.sendKeys(mobileNo);
		lcoCustomerIdEdt.sendKeys(lcoCustomerId);
		handleDropdown(userType,userTypeDropdown);
		handleDropdown(userTypeSearch,userTypeSearchDropdown);
		userCodeEdt.sendKeys(userCode);
		userSearchBtn.click();
		handleDropdown(customerIdType,customerIdTypeDropdown);
		customerIdEdt.sendKeys(customerId);
		handleDropdown(inventory,inventoryDropdown);
		batchNoEdt.sendKeys(batchNo);
		handleDropdown(showRemarks,showRemarkDropdown);
		handleDropdown(customerSla,customerSlaDropdown);
		handleDropdown(lcoStatus,lcoStateDropdown);
		handleDropdown(downloadType,downloadTypeDropdown);
		searchBtn.click();
		clearBtn.click();
	}
	
	
	
	
	
}
