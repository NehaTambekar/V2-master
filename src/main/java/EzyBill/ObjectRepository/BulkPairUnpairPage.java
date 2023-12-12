package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class BulkPairUnpairPage extends WebDriverUtility{

	@FindBy(id = "btnPair")
	private WebElement pairBtn;
	
	@FindBy(id = "btnUnPair")
	private WebElement unpairBtn;
	
	@FindBy(id = "sip")
	private WebElement serverTypeDropdown;
	
	@FindBy(id = "file")
	private WebElement uploadFileForPair;
	
	@FindBy(id = "filePair")
	private WebElement importPairBtn;
	
	@FindBy(id = "sipUnpair")
	private WebElement unpairServerTypeDropdown;
	
	@FindBy(id = "vc_serialopt")
	private WebElement chooseDropdown;
	
	@FindBy(id = "file_unpair")
	private WebElement uploadFileForUnpair;
	
	@FindBy(id = "fileUnPair")
	private WebElement importUnpairBtn;

	public WebElement getPairBtn() {
		return pairBtn;
	}

	public WebElement getUnpairBtn() {
		return unpairBtn;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getUploadFileForPair() {
		return uploadFileForPair;
	}

	public WebElement getImportPairBtn() {
		return importPairBtn;
	}

	public WebElement getUnpairServerTypeDropdown() {
		return unpairServerTypeDropdown;
	}

	public WebElement getChooseDropdown() {
		return chooseDropdown;
	}

	public WebElement getUploadFileForUnpair() {
		return uploadFileForUnpair;
	}

	public WebElement getImportUnpairBtn() {
		return importUnpairBtn;
	}

	public BulkPairUnpairPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void pair(String serverType, String uploadFile)
	{
		pairBtn.click();
		handleDropdown(serverType, serverTypeDropdown);
		uploadFileForPair.sendKeys(uploadFile);
		importPairBtn.click();
	}
	public void unpair(String serverType, String uploadFile)
	{
		unpairBtn.click();
		handleDropdown(serverType, unpairServerTypeDropdown);
		uploadFileForUnpair.sendKeys(uploadFile);
		importUnpairBtn.click();
	}
}
