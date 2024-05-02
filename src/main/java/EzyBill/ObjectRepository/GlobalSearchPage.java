package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlobalSearchPage {
	
	@FindBy(xpath="//span[text()='Edit']")
	private WebElement editBtn;
	
	@FindBy(xpath="//span[text()='Invoices']")
	private WebElement invoiceBtn;
	
	@FindBy(xpath="//span[text()='Payments']")
	private WebElement paymentBtn;
	
	@FindBy(xpath="//span[text()='History']")
	private WebElement historyBtn;

	@FindBy(xpath="//span[text()='Add New Box']")
	private WebElement addNewBoxBtn;
	
	@FindBy(xpath="//span[text()='Deactivate']")
	private WebElement deactiveBtn;
	
	@FindBy(xpath="//span[text()='Reactivation']")
	private WebElement reactivationBtn;
	
	@FindBy(xpath="//span[text()='Add Service']")
	private WebElement addServiceBtn;
	
	@FindBy(xpath="//span[text()='Last OSD']")
	private WebElement lastOSDBtn;
	
	@FindBy(xpath="//span[text()='Fingerprint']")
	private WebElement fingerPrintBtn;
	
	@FindBy(xpath="(//span[@class='new-btn-text gd_text_font'])[2]")
	private WebElement unpairBtn;
	
	@FindBy(xpath="//span[text()='LCO Transfer '] ")
	private WebElement lcoTransferBtn;
	
	@FindBy(xpath="//span[@class='new-btn-text gd_text_font']")
	private WebElement pairBtn;
	
	@FindBy(xpath="//span[text()='Make Normal']")
	private WebElement makeNormalBtn;
	
	@FindBy(xpath="//span[text()='Send to ServiceCenter ']")
	private WebElement sendServiceCenterBtn;
	
	@FindBy(xpath="//span[text()='Assign']")
	private WebElement assignBtn;
	
	@FindBy(xpath="//i[@title='Unpair']")
	private WebElement unpairIcon;
	
	@FindBy(xpath="//i[@class='fas fa-plus-circle font-17 green']")
	private WebElement addServiceIcon;
	
	@FindBy(xpath="//i[@class='fas fa-times-circle font-17 red']")
	private WebElement deactiveIcon;
	
	@FindBy(xpath="//i[@class='fas fa-sync-alt font-16 blue']")
	private WebElement reactiveIcon;
	
	@FindBy(xpath="//i[@title='Pair']")
	private WebElement pairIcon;
	
	@FindBy(xpath="//i[@class='fa fa-info-circle font-17']")
	private WebElement moreinfoIcon;

	public GlobalSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getInvoiceBtn() {
		return invoiceBtn;
	}

	public WebElement getPaymentBtn() {
		return paymentBtn;
	}

	public WebElement getHistoryBtn() {
		return historyBtn;
	}

	public WebElement getAddNewBoxBtn() {
		return addNewBoxBtn;
	}

	public WebElement getDeactiveBtn() {
		return deactiveBtn;
	}

	public WebElement getReactivationBtn() {
		return reactivationBtn;
	}

	public WebElement getAddServiceBtn() {
		return addServiceBtn;
	}

	public WebElement getLastOSDBtn() {
		return lastOSDBtn;
	}

	public WebElement getFingerPrintBtn() {
		return fingerPrintBtn;
	}

	public WebElement getUnpairBtn() {
		return unpairBtn;
	}

	public WebElement getLcoTransferBtn() {
		return lcoTransferBtn;
	}

	public WebElement getPairBtn() {
		return pairBtn;
	}

	public WebElement getMakeNormalBtn() {
		return makeNormalBtn;
	}

	public WebElement getSendServiceCenterBtn() {
		return sendServiceCenterBtn;
	}

	public WebElement getAssignBtn() {
		return assignBtn;
	}

	public WebElement getUnpairIcon() {
		return unpairIcon;
	}

	public WebElement getAddServiceIcon() {
		return addServiceIcon;
	}

	public WebElement getDeactiveIcon() {
		return deactiveIcon;
	}

	public WebElement getReactiveIcon() {
		return reactiveIcon;
	}

	public WebElement getPairIcon() {
		return pairIcon;
	}

	public WebElement getMoreinfoIcon() {
		return moreinfoIcon;
	}
	
	
	
	
	
	
}
