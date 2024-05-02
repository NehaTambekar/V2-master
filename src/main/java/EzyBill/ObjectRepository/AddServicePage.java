package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class AddServicePage extends WebDriverUtility {

	@FindBy(xpath="//a[text()=' Documents']")
	private WebElement documentsBtn;
	
	@FindBy(xpath="//a[text()=' Login And Contact Details']")
	private WebElement loginDetailsBtn;
	
	@FindBy(xpath="//a[text()=' Services']")
	private WebElement servicesBtn;
	
	@FindBy(xpath="//a[text()=' Remarks']")
	private WebElement remarksBtn;
	
	@FindBy(xpath="//a[text()=' 360']")
	private WebElement view360Btn;
	
	@FindBy(xpath="(//a[text()='Back'])[2]")
	private WebElement backBtn ;
	
	@FindBy(xpath="//select[@id='sort_order']")
	private WebElement sortOrderDropdown ;
	
	@FindBy(xpath="//input[@id='myInputChannels_1384']")
	private WebElement productSearchEdt;
	
	@FindBy(xpath="//select[@name='packagetypes']")
	private WebElement packagetypeDropdown ;
	
	@FindBy(xpath="//a[@id='schedule']")
	private WebElement scheduleBtn ;
	
	@FindBy(xpath="//input[@id='package_1']")
	private WebElement selectedPackageCheckBox;
	
	@FindBy(xpath="//button[text()=' Activate']")
	private WebElement activateBtn ;
	
	@FindBy(xpath="//meta[@name='viewport']")
	private WebElement viewScroll;
	
	@FindBy(xpath="//button[@id='confirm_submit']")
	private WebElement yesBtn;
	
	@FindBy(xpath="//button[@id=\"cancel_submit\"]")
	private WebElement noBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okBtn;
	
	@FindBy(xpath="//input[@name='select_all']")
	private WebElement selectAlldeactCheckbox;
	
	@FindBy(xpath="//button[text()=' Deactivate']")
	private WebElement deactivateBtn;
	
	@FindBy(xpath="//select[@id='deact_reason_id']")
	private WebElement deactReasonDropdown;
	
	@FindBy(xpath="//textarea[@id='deact_remarks']")
	private WebElement deactRemarkEdt;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement deactSubmitBtn;
	
	@FindBy(xpath="(//button[text()='Close'])[3]")
	private WebElement deactCloseBtn;
	
	@FindBy(xpath="//button[text()='Reactivate']")
	private WebElement reactiveBtn;

	@FindBy(xpath="//button[text()='Renew Service']")
	private WebElement renewServiceBtn;
	
	
	public AddServicePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getDocumentsBtn() {
		return documentsBtn;
	}

	public WebElement getLoginDetailsBtn() {
		return loginDetailsBtn;
	}

	public WebElement getServicesBtn() {
		return servicesBtn;
	}

	public WebElement getRemarksBtn() {
		return remarksBtn;
	}

	public WebElement getView360Btn() {
		return view360Btn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getSortOrderDropdown() {
		return sortOrderDropdown;
	}

	public WebElement getProductSearchEdt() {
		return productSearchEdt;
	}

	public WebElement getPackagetypeDropdown() {
		return packagetypeDropdown;
	}

	public WebElement getScheduleBtn() {
		return scheduleBtn;
	}

	public WebElement getSelectedPackageCheckBox() {
		return selectedPackageCheckBox;
	}

	public WebElement getActivateBtn() {
		return activateBtn;
	}
	
	public WebElement getViewScroll() {
		return viewScroll;
	}
	
	public WebElement getYesBtn() {
		return yesBtn;
	}
	
	public WebElement getSelectAlldeactCheckbox() {
		return selectAlldeactCheckbox;
	}
	
	public WebElement getDeactivateBtn() {
		return deactivateBtn;
	}
	
	public WebElement getDeactReasonDropdown() {
		return deactReasonDropdown;
	}
	
	public WebElement getDeactRemarkEdt() {
		return deactRemarkEdt;
	}
	
	public WebElement getDeactSubmitBtn() {
		return deactSubmitBtn;
	}
	
	public WebElement getDeactCloseBtn() {
		return deactCloseBtn;
	}
	
	public WebElement getReactiveBtn() {
		return reactiveBtn;
	}
	
	public WebElement getNoBtn() {
		return noBtn;
	}
	
	public WebElement getRenewServiceBtn() {
		return renewServiceBtn;
	}
	
	public WebElement getOkBtn() {
		return okBtn;
	}
	
	
    public void addServiceActivation(WebDriver driver, String packagetype)
    {
    	//scrollAction(driver, viewScroll);
    	scrollAction(driver);
    	handleDropdown(packagetype,packagetypeDropdown);
    	selectedPackageCheckBox.click();
    	activateBtn.click();
    	waitForElementToBeClickable(driver, yesBtn);
    	//mouseHover(driver,yesBtn );
    	getYesBtn().click();
    	//getNoBtn().click();
    	}
    	
    
     public void addServiceDeactivation(WebDriver driver,String deactReason,String remarks)
     {
    	getSelectAlldeactCheckbox().click();
 		getDeactivateBtn().click();
 		waitForElementToBeClickable(driver,deactReasonDropdown);
 		handleDropdown(deactReason,deactReasonDropdown);
 		getDeactRemarkEdt().sendKeys(remarks);
 		getDeactSubmitBtn().click();
 		//getDeactCloseBtn().click();
 		waitForElementToBeClickable(driver, yesBtn);
 		getYesBtn().click();
 		//getNoBtn().click();
 		getOkBtn().click();
 		
     }
    	
    }

