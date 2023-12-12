package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class BulkProductCreationPage extends WebDriverUtility{

	@FindBy(id = "services")
	private WebElement serviceTypeDropdown;
	
	@FindBy(xpath = "//ul[@class='select2-selection__rendered']")
	private WebElement serverTypeDropdown;
	
	@FindBy(id = "billing_schedule")
	private WebElement billingScheduleDropdown;
	
	@FindBy(id = "billing_type")
	private WebElement billingTypeDropdown;
	
	@FindBy(id = "uploaded_file")
	private WebElement uploadFile;
	
	@FindBy(id = "service_duration")
	private WebElement serviceDurationDropdown;
	
	@FindBy(id = "bestprice")
	private WebElement basePriceEdt;

	@FindBy(id = "btnimport")
	private WebElement importBtn;

	public WebElement getServiceTypeDropdown() {
		return serviceTypeDropdown;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getBillingScheduleDropdown() {
		return billingScheduleDropdown;
	}

	public WebElement getBillingTypeDropdown() {
		return billingTypeDropdown;
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public WebElement getServiceDurationDropdown() {
		return serviceDurationDropdown;
	}

	public WebElement getBasePriceEdt() {
		return basePriceEdt;
	}

	public WebElement getImportBtn() {
		return importBtn;
	}

	public BulkProductCreationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bulkProductCreation(WebDriver driver,String serviceType, String serverType, String billingSchedule, String billingType,String uploadFilePath, String serviceDuration, String basePrice) throws Throwable
	{
		handleDropdown(serviceType, serviceTypeDropdown);
		
		
		
		handleDropdown(billingSchedule, billingScheduleDropdown);
		handleDropdown(billingType, billingTypeDropdown);
		uploadFile.sendKeys(uploadFilePath);
		handleDropdown(serviceDuration, serviceDurationDropdown);
		basePriceEdt.sendKeys(basePrice);
		driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).click();
		waitForPageLoad(driver);
		waitForPageLoad(driver);
		serverTypeDropdown.sendKeys("co");
		waitForPageLoad(driver);
		pressEnterKey();
		//importBtn.click();
	}
}
