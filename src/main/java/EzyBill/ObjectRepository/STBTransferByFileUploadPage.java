package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class STBTransferByFileUploadPage extends WebDriverUtility{
	@FindBy (id = "services1")
	private WebElement serviceTypeDropdown;
	
	@FindBy (id = "sip1")
	private WebElement serverTypeDropdown;
	
	@FindBy (id = "selSourceUser1")
	private WebElement sourceDropdown;

	@FindBy (id = "stock_location1")
	private WebElement sourceLocationDropdown;
	
	@FindBy (id = "selDestinationUser1")
	private WebElement destinationDropdown;
	
	@FindBy (id = "location1")
	private WebElement destinationLocationDropdown;
	
	@FindBy (id = "remarks1")
	private WebElement discriptionEdt;
	
	@FindBy (id = "csv_transfer")
	private WebElement transferBtn;

	@FindBy (id = "alertify-ok")
	private WebElement okBtn;
	
	public STBTransferByFileUploadPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getServiceTypeDropdown() {
		return serviceTypeDropdown;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getSourceDropdown() {
		return sourceDropdown;
	}

	public WebElement getSourceLocationDropdown() {
		return sourceLocationDropdown;
	}

	public WebElement getDestinationDropdown() {
		return destinationDropdown;
	}

	public WebElement getDestinationLocationDropdown() {
		return destinationLocationDropdown;
	}

	public WebElement getDiscriptionEdt() {
		return discriptionEdt;
	}

	public WebElement getTransferBtn() {
		return transferBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public void transferSTB(String description,String serviceType, String serverType, String sourceLocation, String stockLocation, String destination, String lcoLocation)
	{
		discriptionEdt.sendKeys(description);
		handleDropdown(serviceType, serviceTypeDropdown);
		handleDropdown(serverType, serverTypeDropdown);
		handleDropdown(sourceLocation, sourceDropdown);
		handleDropdown(stockLocation, sourceLocationDropdown);
		handleDropdown(destination, destinationDropdown);
		handleDropdown(lcoLocation, destinationLocationDropdown);
	}
}
