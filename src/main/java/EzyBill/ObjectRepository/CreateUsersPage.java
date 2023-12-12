package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class CreateUsersPage extends WebDriverUtility {

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastName;
	
	@FindBy(xpath = "//input[@id='dateOfBirth']")
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "//select[@id='id_type']")
	private WebElement idType;
	
	@FindBy(xpath = "//input[@id='id_number']")
	private WebElement idNumber;
	
	@FindBy(xpath = "//select[@id='country']")
	private WebElement country;
	
	@FindBy(xpath = "//span[@id='select2-state-container']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement searchStateEdt;
	
	@FindBy(xpath = "//span[@id='select2-district-container']")
	private WebElement district;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement searchDistrictEdt;
	
	@FindBy(xpath = "//span[@id='select2-mandal-container']")
	private WebElement taluka;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement searchTalukaEdt;
	
	@FindBy(xpath = "//span[@id='select2-city-container']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement searchCityEdt;
	
	@FindBy(xpath = "//input[@id='pin_code']")
	private WebElement pinCode;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailID;
	
	@FindBy(xpath = "//input[@id='mobile_no']")
	private WebElement mobile;
	
	@FindBy(xpath = "//textarea[@id='address1']")
	private WebElement billingAddress;
	
	@FindBy(xpath = "//input[@id='bank_name']")
	private WebElement bankName;
	
	@FindBy(xpath = "//input[@id='bank_account_number']")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//input[@id='bank_branch_name']")
	private WebElement branchName;
	
	@FindBy(xpath = "//input[@id='bank_ifsc_code']")
	private WebElement ifscCode;
	
	@FindBy(xpath = "//select[@id='users_type']")
	private WebElement userType;

	@FindBy(id = "business_name")
	private WebElement businessName;
	
	@FindBy(id = "lco_code")
	private WebElement lcoCode;
	
	@FindBy(id = "createEmployee")
	private WebElement saveBtn;
	
	@FindBy(id="alertify-ok")
	private WebElement okPopupBtn;
	
	public WebElement getFirstName() {
		return firstName;
	}



	public WebElement getLastName() {
		return lastName;
	}



	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}



	public WebElement getIdType() {
		return idType;
	}



	public WebElement getIdNumber() {
		return idNumber;
	}



	public WebElement getCountry() {
		return country;
	}



	public WebElement getState() {
		return state;
	}



	public WebElement getSearchStateEdt() {
		return searchStateEdt;
	}



	public WebElement getDistrict() {
		return district;
	}



	public WebElement getSearchDistrictEdt() {
		return searchDistrictEdt;
	}



	public WebElement getTaluka() {
		return taluka;
	}



	public WebElement getSearchTalukaEdt() {
		return searchTalukaEdt;
	}



	public WebElement getCity() {
		return city;
	}



	public WebElement getSearchCityEdt() {
		return searchCityEdt;
	}



	public WebElement getPinCode() {
		return pinCode;
	}



	public WebElement getEmailID() {
		return emailID;
	}



	public WebElement getMobile() {
		return mobile;
	}



	public WebElement getBillingAddress() {
		return billingAddress;
	}



	public WebElement getBankName() {
		return bankName;
	}



	public WebElement getAccountNumber() {
		return accountNumber;
	}



	public WebElement getBranchName() {
		return branchName;
	}



	public WebElement getIfscCode() {
		return ifscCode;
	}



	public WebElement getUserType() {
		return userType;
	}



	public CreateUsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void createLCO(WebDriver driver, String FirstName, String LastName, String IDType, double IDNumber, String country, String state, String district, String Taluka, String city, double pincode, String emailID, double mobile, String billingAddress, String bankName, double accountNumber, String branchName, String ifscCode, String userType, String businessName, String lcoCode) throws Throwable
	{
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		handleDropdown(IDType, idType);
		idNumber.sendKeys(String.valueOf(IDNumber));
		handleDropdown(country, this.country);
		mouseHover(driver, this.state);
		searchStateEdt.sendKeys(state);
		pressEnterKey();
		mouseHover(driver, this.district);
		searchStateEdt.sendKeys(district);
		pressEnterKey();
		mouseHover(driver, taluka);
		searchStateEdt.sendKeys(Taluka);
		pressEnterKey();
		waitForElementToBeClickable(driver, this.city);
		mouseHover(driver, this.city);
		searchCityEdt.sendKeys(city);
		pressEnterKey();
		pinCode.sendKeys(String.valueOf(pincode));
		this.emailID.sendKeys(emailID);
		this.mobile.sendKeys(String.valueOf(mobile));
		this.billingAddress.sendKeys(billingAddress);
		this.bankName.sendKeys(bankName);
		//this.accountNumber.sendKeys(String.valueOf(accountNumber));
		this.branchName.sendKeys(branchName);
		this.ifscCode.sendKeys(ifscCode);
		handleDropdown(userType, this.userType);
		waitForElementToBeVisible(driver, this.businessName);
		this.businessName.sendKeys(businessName);
		this.lcoCode.sendKeys(lcoCode);
		saveBtn.click();
		//takeScreenShot(driver,"first");
		
		//mouseHover(driver, okPopupBtn);
		//okPopupBtn.click();//
		WebElement ele = driver.findElement(By.xpath("//button[@id='alertify-ok']"));
		mouseHover(driver, ele);
		//driver.switchTo().alert().accept();
	}
}
