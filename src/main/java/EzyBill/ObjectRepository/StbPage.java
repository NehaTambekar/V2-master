package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StbPage {

	@FindBy(xpath = "//a[text()='Create STB/Edit STB']")
	private WebElement createSTB;
	
	@FindBy(xpath = "//a[text()='Transfer STB']")
	private WebElement transferSTB;
	
	@FindBy(xpath = "//a[text()='Pull Stock']")
	private WebElement pullStock;
	
	@FindBy(xpath = "//div[@id='sidebarstb']/descendant::a[text()='STB List']")
	private WebElement stbList;
	
	@FindBy(xpath = "//a[text()='Bulk Operations']")
	private WebElement bulkOperations;
	
	@FindBy(xpath = "//a[text()='VC Management']")
	private WebElement vcManagement;
	
	@FindBy(xpath = "//a[text()='Unpaired VC Transfer']")
	private WebElement unpairedVCtransfer;
	
	@FindBy(xpath = "//a[text()='VC Number Edit']")
	private WebElement vcNumberEdit;
	
	@FindBy(xpath = "//a[text()='Serial Number Edit']")
	private WebElement serialNumberEdit;
	
	@FindBy(xpath = "//a[text()='STB Replacement']")
	private WebElement stbReplacement;
	
	@FindBy(xpath = "//a[text()='Bulk STB Replacement']")
	private WebElement bulkStbReplacement;
	
	@FindBy(xpath = "//a[text()='Bulk Pair/Unpair ']")
	private WebElement bulkPairUnpair;
	
	@FindBy(id = "tempsubmenu")
	private WebElement tempBlockingOfStb;
	
	@FindBy(xpath = "//a[text()='Blocking']")
	private WebElement blocking;
	
	@FindBy(xpath = "//a[text()='Un Blocking']")
	private WebElement unblocking;
	
	@FindBy(xpath = "//a[text()='Warranty Check']")
	private WebElement warrantyCheck;
	
	public StbPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateSTB() {
		return createSTB;
	}

	public WebElement getTransferSTB() {
		return transferSTB;
	}

	public WebElement getPullStock() {
		return pullStock;
	}

	public WebElement getStbList() {
		return stbList;
	}

	public WebElement getStbReplacement() {
		return stbReplacement;
	}

	public WebElement getBulkOperations() {
		return bulkOperations;
	}

	public WebElement getVcManagement() {
		return vcManagement;
	}

	public WebElement getUnpairedVCtransfer() {
		return unpairedVCtransfer;
	}

	public WebElement getVcNumberEdit() {
		return vcNumberEdit;
	}

	public WebElement getSerialNumberEdit() {
		return serialNumberEdit;
	}

	public WebElement getBulkStbReplacement() {
		return bulkStbReplacement;
	}

	public WebElement getBulkPairUnpair() {
		return bulkPairUnpair;
	}

	public WebElement getTempBlockingOfStb() {
		return tempBlockingOfStb;
	}

	public WebElement getBlocking() {
		return blocking;
	}

	public WebElement getUnblocking() {
		return unblocking;
	}

	public WebElement getWarrantyCheck() {
		return warrantyCheck;
	}
	
	
}
