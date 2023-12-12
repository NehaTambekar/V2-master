package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class AddBundlePage extends WebDriverUtility {

	@FindBy (xpath = "//label[@for='is_mandatory']")
	private WebElement isMandatoryRadioBtn;
	
	@FindBy (id = "name")
	private WebElement bundleNameEdt;
	
	@FindBy (id = "sku")
	private WebElement bundleskuEdt;
	
	@FindBy (id = "billing_schedule")
	private WebElement billingScheduleDropdown;
	
	@FindBy (id = "billing_type")
	private WebElement billingTypeDropdown;
	
	@FindBy (id = "is_taxable")
	private WebElement isTaxableDropdown;
	
	@FindBy (id = "template_id")
	private WebElement taxTemplateDropdown;
	
	@FindBy (id = "service_duration")
	private WebElement serviceDurationDropdown;
	
	@FindBy (id = "service_duration_months_value")
	private WebElement servicDurationMonthsDropdown;
	
	@FindBy (id = "service_duration_days_value")
	private WebElement serviceDurationDaysEdt;
	
	@FindBy (id = "bestprice")
	private WebElement basePriceEdt;
	
	@FindBy (id = "cas_stype")
	private WebElement serverTypeDropdown;
	
	@FindBy (id = "packagetypes_val")
	private WebElement packageTypeDropdown;
	
	@FindBy (id = "fetch_cas_products")
	private WebElement fetchBtn;
	
	@FindBy (id = "submit")
	private WebElement saveBtn;

	@FindBy (id = "//td[@class='BASE package_type']/input[@id='bundle_cas_products']")
	private WebElement packageCheckbox;
	
	@FindBy (id = "//input[@class='myInputProducts form-control']")
	private WebElement productSearchEdt;
	
	public AddBundlePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getIsMandatoryRadioBtn() {
		return isMandatoryRadioBtn;
	}

	public WebElement getBundleNameEdt() {
		return bundleNameEdt;
	}

	public WebElement getBundleskuEdt() {
		return bundleskuEdt;
	}

	public WebElement getBillingScheduleDropdown() {
		return billingScheduleDropdown;
	}

	public WebElement getBillingTypeDropdown() {
		return billingTypeDropdown;
	}

	public WebElement getIsTaxableDropdown() {
		return isTaxableDropdown;
	}

	public WebElement getTaxTemplateDropdown() {
		return taxTemplateDropdown;
	}

	public WebElement getServiceDurationDropdown() {
		return serviceDurationDropdown;
	}

	public WebElement getServicDurationMonthsDropdown() {
		return servicDurationMonthsDropdown;
	}

	public WebElement getServiceDurationDaysEdt() {
		return serviceDurationDaysEdt;
	}

	public WebElement getBasePriceEdt() {
		return basePriceEdt;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getPackageTypeDropdown() {
		return packageTypeDropdown;
	}

	public WebElement getFetchBtn() {
		return fetchBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getPackageCheckbox() {
		return packageCheckbox;
	}

	public WebElement getProductSearchEdt() {
		return productSearchEdt;
	}

	public void addBundle(WebDriver driver,String bundleSku, String bundleName, String billingSchedule, String billingType, String isTaxable, String taxTemplate, String serviceDuration, String numberOfMonths, double basePrice, String serverType, String packageType1, String packageType2)
	{
		bundleskuEdt.sendKeys(bundleSku);
		bundleNameEdt.sendKeys(bundleName);
		handleDropdown(billingSchedule, billingScheduleDropdown);
		handleDropdown(billingType, billingTypeDropdown);
		handleDropdown(isTaxable, isTaxableDropdown);
		handleDropdown(taxTemplate, taxTemplateDropdown);
		handleDropdown(serviceDuration, serviceDurationDropdown);
		handleDropdown(numberOfMonths, servicDurationMonthsDropdown);
		basePriceEdt.sendKeys(String.valueOf(basePrice));
		handleDropdown(serverType, serverTypeDropdown);
		fetchBtn.click();
		handleDropdown(packageType2, packageTypeDropdown);
		//productSearchEdt.sendKeys(packageType1);
		waitForPageLoad(driver);
		packageCheckbox.click();
		/* waitForPageLoad(driver);
		handleDropdown(packageType2, packageTypeDropdown);
		productSearchEdt.sendKeys(packageType2);
		waitForPageLoad(driver);
		packageCheckbox.click(); */
		//saveBtn.click();
		
	}
	
}
