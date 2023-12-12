package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class CreateBroadcasterPage extends WebDriverUtility {

	@FindBy (id = "broadcaster_name")
	private WebElement broadcasterNameEdt;
	
	@FindBy (xpath = "//input[@id='broadcaster_phone']")
	private WebElement broadcasterPhoneEdt;
	
	@FindBy (id = "contact_name")
	private WebElement contactNameEdt;
	
	@FindBy (id = "contact_phone")
	private WebElement contactPhoneEdt;
	
	@FindBy (id = "Address1")
	private WebElement address1Edt;
	
	@FindBy (id = "country")
	private WebElement countryDropdown;
	
	@FindBy (id = "select2-state-container")
	private WebElement stateDropdown;
	
	//input[@aria-controls='select2-state-results']
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement stateSearchEdt;
	
	@FindBy (id = "select2-district-container")
	private WebElement districtDropdown;
	
	//input[@aria-controls='select2-district-results']
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement districtSearchEdt;
	
	@FindBy (id = "select2-city-container")
	private WebElement cityDropdown;
	
	//input[@aria-controls='select2-city-results']
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement citySearchEdt;
	
	@FindBy (id = "Pin_Code")
	private WebElement pincodeEdt;
	
	@FindBy (id = "Email")
	private WebElement emailEdt;

	@FindBy (id = "addbroadcaster")
	private WebElement saveBtn;
	
	@FindBy (id = "bclear")
	private WebElement clearBtn;
	
	public WebElement getBroadcasterNameEdt() {
		return broadcasterNameEdt;
	}

	public WebElement getBroadcasterPhoneEdt() {
		return broadcasterPhoneEdt;
	}

	public WebElement getContactNameEdt() {
		return contactNameEdt;
	}

	public WebElement getContactPhoneEdt() {
		return contactPhoneEdt;
	}

	public WebElement getAddress1Edt() {
		return address1Edt;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getDistrictDropdown() {
		return districtDropdown;
	}

	public WebElement getCityDropdown() {
		return cityDropdown;
	}

	public WebElement getPincodeEdt() {
		return pincodeEdt;
	}

	public WebElement getEmailEdt() {
		return emailEdt;
	}
	
	public WebElement getStateSearchEdt() {
		return stateSearchEdt;
	}

	public WebElement getDistrictSearchEdt() {
		return districtSearchEdt;
	}

	public WebElement getCitySearchEdt() {
		return citySearchEdt;
	}

	
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public CreateBroadcasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createBroadcaster(WebDriver driver, String broadcasterName, long broadcasterMobile, String contactName, long contactPhone, String address1, String country, String state, String district, String city, double pincode, String email) throws Throwable
	{
		broadcasterNameEdt.sendKeys(broadcasterName);
		broadcasterPhoneEdt.sendKeys(String.valueOf(broadcasterMobile));
		contactNameEdt.sendKeys(contactName);
		contactPhoneEdt.sendKeys(String.valueOf(contactPhone));
		address1Edt.sendKeys(address1);
		handleDropdown(country, countryDropdown);
		mouseHover(driver, stateDropdown);
		stateSearchEdt.sendKeys(state);
		pressEnterKey();
		mouseHover(driver, districtDropdown);
		stateSearchEdt.sendKeys(district);
		pressEnterKey();
		mouseHover(driver, cityDropdown);
		stateSearchEdt.sendKeys(city);
		pressEnterKey();
		pincodeEdt.sendKeys(String.valueOf(pincode));
		emailEdt.sendKeys(email);
		saveBtn.click();
	}
}
