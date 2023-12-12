package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class BulkReplacementPage extends WebDriverUtility{
	@FindBy(xpath = "(//input[@id='transfer_Type'])[1]")
	private WebElement bulkSurrenderRadioBtn;
	
	@FindBy(xpath = "(//input[@id='transfer_Type'])[2]")
	private WebElement bulkReplacementRadioBtn;
	
	@FindBy(id = "Data")
	private WebElement dataInFileDropdown;
	
	@FindBy(id = "stb_status")
	private WebElement stbStatusDropdown;
	
	@FindBy(id = "csvFile")
	private WebElement uploadFileForSurrender;
	
	@FindBy(id = "remarks")
	private WebElement remarksEdt;
	
	@FindBy(id = "uploadCsv")
	private WebElement bulkSurrenderBtn;
	
	@FindBy(id = "data_type")
	private WebElement brDataInFileDropdown;
	
	@FindBy(id = "operation_type")
	private WebElement replacementReasonDropdown;
	
	@FindBy(id = "uploaded_file")
	private WebElement uploadFileForReplacement;
	
	@FindBy(id = "bulk_remarks")
	private WebElement remarksReplacementEdt;
	
	@FindBy(id = "bulk_uploadCsv")
	private WebElement bulkReplacementBtn;

	public WebElement getBulkSurrenderRadioBtn() {
		return bulkSurrenderRadioBtn;
	}

	public WebElement getbulkReplacementRadioBtn() {
		return bulkReplacementRadioBtn;
	}

	public WebElement getDataInFileDropdown() {
		return dataInFileDropdown;
	}

	public WebElement getStbStatusDropdown() {
		return stbStatusDropdown;
	}

	public WebElement getUploadFileForSurrender() {
		return uploadFileForSurrender;
	}

	public WebElement getRemarksEdt() {
		return remarksEdt;
	}

	public WebElement getBulkSurrenderBtn() {
		return bulkSurrenderBtn;
	}

	public WebElement getBrDataInFileDropdown() {
		return brDataInFileDropdown;
	}

	public WebElement getReplacementReasonDropdown() {
		return replacementReasonDropdown;
	}

	public WebElement getUploadFileForReplacement() {
		return uploadFileForReplacement;
	}

	public WebElement getRemarksReplacementEdt() {
		return remarksReplacementEdt;
	}

	public WebElement getBulkReplacementBtn() {
		return bulkReplacementBtn;
	}

	public BulkReplacementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void bulkSurrender(String dataInFile, String stbStatus, String uploadFilePath, String remarks)
	{
		bulkSurrenderRadioBtn.click();
		handleDropdown(dataInFile, dataInFileDropdown);
		handleDropdown(stbStatus, stbStatusDropdown);
		uploadFileForSurrender.sendKeys(uploadFilePath);
		remarksEdt.sendKeys(remarks);
		bulkSurrenderBtn.click();
	}
	
	public void bulkReplacement(String dataInFile, String replacementReason, String uploadFilePath, String remarks)
	{
		bulkReplacementRadioBtn.click();
		handleDropdown(dataInFile, brDataInFileDropdown);
		handleDropdown(replacementReason, replacementReasonDropdown);
		uploadFileForReplacement.sendKeys(uploadFilePath);
		remarksReplacementEdt.sendKeys(remarks);
		bulkReplacementBtn.click();
		
	}
	
}
