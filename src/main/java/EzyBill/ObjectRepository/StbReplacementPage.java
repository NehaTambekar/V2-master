package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StbReplacementPage {

	@FindBy(id = "customer_id")
	private WebElement crfNumberEdt;
	
	@FindBy(id = "serial_number")
	private WebElement serialNumberEdt;
	
	@FindBy(id = "mac_id")
	private WebElement vcNumberEdt;
	
	@FindBy(id = "search")
	private WebElement searchBtn;
	
	@FindBy(id = "clear")
	private WebElement clearBtn;
	
	@FindBy(id = "replacement_type")
	private WebElement complaintReasonDropdown;
	
	@FindBy(id = "amount")
	private WebElement amountEdt;
	
	@FindBy(id = "receipt_no")
	private WebElement receiptNumberEdt;
	
	@FindBy(id = "remarks")
	private WebElement remarksEdt;
	
	@FindBy(id = "replace_stb")
	private WebElement replaceBtn;
	
	@FindBy(id = "clearbtn")
	private WebElement cancelBtn;

	@FindBy(id = "alertify-ok")
	private WebElement okBtn;
	
	public StbReplacementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCrfNumberEdt() {
		return crfNumberEdt;
	}

	public WebElement getSerialNumberEdt() {
		return serialNumberEdt;
	}

	public WebElement getVcNumberEdt() {
		return vcNumberEdt;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getComplaintReasonDropdown() {
		return complaintReasonDropdown;
	}

	public WebElement getAmountEdt() {
		return amountEdt;
	}

	public WebElement getReceiptNumberEdt() {
		return receiptNumberEdt;
	}

	public WebElement getRemarksEdt() {
		return remarksEdt;
	}

	public WebElement getReplaceBtn() {
		return replaceBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	public void stbReplacement(int serialNumber)
	{
		serialNumberEdt.sendKeys(String.valueOf(serialNumber));
		searchBtn.click();
		okBtn.click();
	}
	
}
