package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class AddProductsPage extends WebDriverUtility{

	@FindBy (id = "isbase1")
	private WebElement basePackRadioBtn;
	
	@FindBy (xpath = "//label[@class='custom-control-label alacarte']")
	private WebElement alacarteRadioBtn;
	
	@FindBy (xpath = "//label[@for='is_mandatory']")
	private WebElement isMandatoryRadioBtn;
	
	@FindBy (id = "services")
	private WebElement serviceTypeDropdown;
	
	@FindBy (xpath = "//span[@class='select2-selection select2-selection--multiple']/ul[@class='select2-selection__rendered']")
	private WebElement serverTypeEdt;
	
	@FindBy (id = "name")
	private WebElement productNameEdt;
	
	@FindBy (id = "sku")
	private WebElement productskuEdt;
	
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
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement saveBtn;

	public AddProductsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getBasePackRadioBtn() {
		return basePackRadioBtn;
	}

	public WebElement getAlacarteRadioBtn() {
		return alacarteRadioBtn;
	}

	public WebElement getIsMandatoryRadioBtn() {
		return isMandatoryRadioBtn;
	}

	public WebElement getServiceTypeDropdown() {
		return serviceTypeDropdown;
	}

	public WebElement getServerTypeEdt() {
		return serverTypeEdt;
	}

	public WebElement getProductNameEdt() {
		return productNameEdt;
	}

	public WebElement getProductskuEdt() {
		return productskuEdt;
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

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createBasePack(WebDriver driver,String serviceType, String serverType, String productName, String productSku, String billingSchedule, String billingType, String isTaxable, String taxTemplate, String serviceDuration, String numberOfMonths, double basePrice)
	{
		basePackRadioBtn.click();
		handleDropdown(serviceType, serviceTypeDropdown);
		mouseHover(driver, serverTypeEdt);
		
		driver.findElement(By.xpath("//option[text()='CONAX']")).click();
		productNameEdt.sendKeys(productName);
		productskuEdt.sendKeys(productSku);
		handleDropdown(billingSchedule, billingScheduleDropdown);
		handleDropdown(billingType, billingTypeDropdown);
		handleDropdown(isTaxable, isTaxableDropdown);
		handleDropdown(taxTemplate, taxTemplateDropdown);
		handleDropdown(serviceDuration, serviceDurationDropdown);
		handleDropdown(numberOfMonths, servicDurationMonthsDropdown);
		basePriceEdt.sendKeys(String.valueOf(basePrice));
		//saveBtn.click();
		//saveBtn.click();
		
	}
}
