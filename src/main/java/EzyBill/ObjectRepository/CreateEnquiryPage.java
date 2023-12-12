package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class CreateEnquiryPage extends WebDriverUtility{

	@FindBy (id = "firstname")
	private WebElement firstNameEdt;
	
	@FindBy (id = "address")
	private WebElement addressEdt;
	
	@FindBy (id = "Mobile")
	private WebElement mobileEdt;
	
	@FindBy (id = "selComplaintCategory")
	private WebElement complaintCategoryDropdown;
	
	@FindBy (id = "enqdesc")
	private WebElement enquiryInfoEdt;
	
	@FindBy (id = "register_enquiry")
	private WebElement createEnquiryBtn;
	
	@FindBy (id = "btnClear")
	private WebElement clearBtn;

	public WebElement getFirstNameEdt() {
		return firstNameEdt;
	}

	public WebElement getAddressEdt() {
		return addressEdt;
	}

	public WebElement getMobileEdt() {
		return mobileEdt;
	}

	public WebElement getComplaintCategoryDropdown() {
		return complaintCategoryDropdown;
	}

	public WebElement getEnquiryInfoEdt() {
		return enquiryInfoEdt;
	}

	public WebElement getCreateEnquiryBtn() {
		return createEnquiryBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public CreateEnquiryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createEnquiry(String firstName, String address, long mobile, String enquiryCategory, String enquiryInfo)
	{
		firstNameEdt.sendKeys(firstName);
		addressEdt.sendKeys(address);
		mobileEdt.sendKeys(String.valueOf(mobile));
		handleDropdown(enquiryCategory, complaintCategoryDropdown);
		enquiryInfoEdt.sendKeys(enquiryInfo);
		createEnquiryBtn.click();
	}
}
