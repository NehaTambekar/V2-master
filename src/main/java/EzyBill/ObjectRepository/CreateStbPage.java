package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class CreateStbPage extends WebDriverUtility {

	@FindBy (xpath = "//select[@id='services']")
	private WebElement casDropdown;
	
	@FindBy (xpath = "//select[@id='sip']")
	private WebElement serverTypeDropdown;
	
	@FindBy (xpath = "//span[@id='select2-location-container']")
	private WebElement locationDropdown;
	
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement locationSearchEdt;
	
	@FindBy (xpath = "//span[@id='select2-supplier-container']")
	private WebElement supplierDropdown;
	
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement supplierSearchEdt;
	
	@FindBy (xpath = "//input[@id='po']")
	private WebElement poNumberEdt;
	
	@FindBy (xpath = "//input[@id='invoice']")
	private WebElement invoiceNumberEdt;
	
	@FindBy (xpath = "//input[@id='price']")
	private WebElement pricePerUnitEdt;
	
	@FindBy (xpath = "//span[@id='select2-make-container']")
	private WebElement makeDropdown;
	
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement makeSearchEdt;
	
	@FindBy (xpath = "//span[@id='select2-model-container']")
	private WebElement modelDropdown;
	
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement modelSearchEdt;

	@FindBy (xpath = "//select[@id='is_month']")
	private WebElement waranteeInDropdown;
	
	@FindBy (xpath = "//input[@id='period']")
	private WebElement waranteePeriodUnitEdt;
	
	@FindBy (xpath = "//input[@id='batch_no']")
	private WebElement batchNumberPerUnitEdt;
	
	@FindBy (xpath = "//select[@id='stb_type']")
	private WebElement stbTypeInDropdown;
	
	@FindBy (xpath = "//textarea[@id='remarks']")
	private WebElement remarkstEdt;
	
	@FindBy (xpath = "//label[text()='Create Individuals']")
	private WebElement createIndividualRadio;
	
	@FindBy (xpath = "//a[@type='submit']")
	private WebElement editBtn;
	
	@FindBy (xpath = "//button[@id='filesave']")
	private WebElement addBtn;
	
	@FindBy (xpath = "//button[@id='clear']")
	private WebElement clearBtn;
	
	@FindBy (xpath = "//input[@id='manual_serials']")
	private WebElement serialNumberEdt;
	
	@FindBy (xpath = "//input[@id='manual_vcs']")
	private WebElement vcEdt;
	
	public WebElement getCasDropdown() {
		return casDropdown;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getLocationDropdown() {
		return locationDropdown;
	}

	public WebElement getSupplierDropdown() {
		return supplierDropdown;
	}

	public WebElement getPoNumberEdt() {
		return poNumberEdt;
	}

	public WebElement getInvoiceNumberEdt() {
		return invoiceNumberEdt;
	}

	public WebElement getPricePerUnitEdt() {
		return pricePerUnitEdt;
	}

	public WebElement getMakeDropdown() {
		return makeDropdown;
	}
	
	public WebElement getMakeSearchEdt() {
		return makeSearchEdt;
	}

	public WebElement getModelDropdown() {
		return modelDropdown;
	}
	
	public WebElement getModelSearchEdt() {
		return modelSearchEdt;
	}

	public WebElement getWaranteeInDropdown() {
		return waranteeInDropdown;
	}

	public WebElement getWaranteePeriodUnitEdt() {
		return waranteePeriodUnitEdt;
	}

	public WebElement getBatchNumberPerUnitEdt() {
		return batchNumberPerUnitEdt;
	}

	public WebElement getStbTypeInDropdown() {
		return stbTypeInDropdown;
	}

	public WebElement getRemarkstEdt() {
		return remarkstEdt;
	}

	public WebElement getCreateIndividualRadio() {
		return createIndividualRadio;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getSerialNumberEdt() {
		return serialNumberEdt;
	}

	public WebElement getVcEdt() {
		return vcEdt;
	}

	public WebElement getLocationSearchEdt() {
		return locationSearchEdt;
	}

	public WebElement getSupplierSearchEdt() {
		return supplierSearchEdt;
	}

	public CreateStbPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createStb(WebDriver driver, String serviceType, String serverType, String location, String supplier, double poNumber, double invoiceNumber, double pricePerUnit, String make, String model, String waranteeIn, double waranteePeriod, double batchNumber, String stbType, double serialNumber, double vcNumber) throws Throwable
	{
		createIndividualRadio.click();
		handleDropdown(serviceType, casDropdown);
	    handleDropdown(serverType, serverTypeDropdown);
		mouseHover(driver, locationDropdown); //handleDropdown(location)
		getLocationSearchEdt().sendKeys(location);
		pressEnterKey();
		mouseHover(driver, supplierDropdown); //handleDropdown (supplier)
		getSupplierSearchEdt().sendKeys(supplier);
		pressEnterKey();
		getPoNumberEdt().sendKeys(String.valueOf(poNumber));
	 	getInvoiceNumberEdt().sendKeys(String.valueOf(invoiceNumber));
		getPricePerUnitEdt().sendKeys(String.valueOf(pricePerUnit));
		mouseHover(driver, makeDropdown);//handleDropdown(make, makeDropdown);
		getMakeSearchEdt().sendKeys(make);
		pressEnterKey();
		mouseHover(driver, modelDropdown);//handleDropdown(model, modelDropdown);
		getModelSearchEdt().sendKeys(model);
		pressEnterKey();
		handleDropdown(waranteeIn, waranteeInDropdown);
		getWaranteePeriodUnitEdt().sendKeys(String.valueOf(waranteePeriod));
		getBatchNumberPerUnitEdt().sendKeys(String.valueOf(batchNumber));
		handleDropdown(stbType, stbTypeInDropdown);
		getSerialNumberEdt().sendKeys(String.valueOf(serialNumber));
		getVcEdt().sendKeys(String.valueOf(vcNumber));
		getAddBtn().click();
	}
	public void createBulkStb(WebDriver driver, String serviceType, String serverType, String location, String supplier, double poNumber, double invoiceNumber, double pricePerUnit, String make, String model, String waranteeIn, double waranteePeriod, double batchNumber, String stbType) throws Throwable
	{
		handleDropdown(serviceType, casDropdown);
	    handleDropdown(serverType, serverTypeDropdown);
		mouseHover(driver, locationDropdown); //handleDropdown(location)
		getLocationSearchEdt().sendKeys(location);
		pressEnterKey();
		mouseHover(driver, supplierDropdown); //handleDropdown (supplier)
		getSupplierSearchEdt().sendKeys(supplier);
		pressEnterKey();
		getPoNumberEdt().sendKeys(String.valueOf(poNumber));
	 	getInvoiceNumberEdt().sendKeys(String.valueOf(invoiceNumber));
		getPricePerUnitEdt().sendKeys(String.valueOf(pricePerUnit));
		mouseHover(driver, makeDropdown);//handleDropdown(make, makeDropdown);
		getMakeSearchEdt().sendKeys(make);
		pressEnterKey();
		mouseHover(driver, modelDropdown);//handleDropdown(model, modelDropdown);
		getModelSearchEdt().sendKeys(model);
		pressEnterKey();
		handleDropdown(waranteeIn, waranteeInDropdown);
		getWaranteePeriodUnitEdt().sendKeys(String.valueOf(waranteePeriod));
		getBatchNumberPerUnitEdt().sendKeys(String.valueOf(batchNumber));
		handleDropdown(stbType, stbTypeInDropdown);
	}
}
