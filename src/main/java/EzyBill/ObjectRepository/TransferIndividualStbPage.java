package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class TransferIndividualStbPage extends WebDriverUtility{

	@FindBy (xpath = "//textarea[@id='remarks']")
	private WebElement descriptionEdt;
	
	@FindBy (xpath = "//select[@id='selSourceUser']")
	private WebElement sourceDropdown;
	
	@FindBy (xpath = "//select[@id='stock_location']")
	private WebElement stockLocationDropdown;
	
	@FindBy (xpath = "//select[@id='selDestinationUser']")
	private WebElement destinationDropdown;
	
	@FindBy (xpath = "//select[@id='location']")
	private WebElement locationDropdown;
	
	@FindBy (xpath = "//input[@id='search_with_vcno']")
	private WebElement searchWithVC;
	
	@FindBy (xpath = "//input[@name='serial[]']")
	private WebElement vcEdt;
	
	@FindBy (xpath = "//button[@value='Transfer']")
	private WebElement transferBtn;
	
	@FindBy (xpath = "//button[@id='bclear']")
	private WebElement clearBtn;
	
	@FindBy (id = "alertify-ok")
	private WebElement okBtn;

	public WebElement getDescriptionEdt() {
		return descriptionEdt;
	}

	public WebElement getSourceDropdown() {
		return sourceDropdown;
	}

	public WebElement getStockLocationDropdown() {
		return stockLocationDropdown;
	}

	public WebElement getDestinationDropdown() {
		return destinationDropdown;
	}

	public WebElement getLocationDropdown() {
		return locationDropdown;
	}

	public WebElement getSearchWithVC() {
		return searchWithVC;
	}

	public WebElement getVcEdt() {
		return vcEdt;
	}

	public WebElement getTransferBtn() {
		return transferBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public TransferIndividualStbPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void transferSTB(String description, String sourceLocation, String stockLocation, String destination, String lcoLocation, double vcNumber)
	{
		descriptionEdt.sendKeys(description);
		handleDropdown(sourceLocation, sourceDropdown);
		handleDropdown(stockLocation, stockLocationDropdown);
		handleDropdown(destination, destinationDropdown);
		handleDropdown(lcoLocation, locationDropdown);
		searchWithVC.click();
		vcEdt.sendKeys(String.valueOf(vcNumber));
		transferBtn.click();
		okBtn.click();
	}
}










