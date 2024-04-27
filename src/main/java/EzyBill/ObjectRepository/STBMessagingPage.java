package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import EzyBill.GenericUtilities.WebDriverUtility;

public class STBMessagingPage extends WebDriverUtility {
	
	@FindBy(id="backend_setup_id")
	private WebElement serverTypeDropdown;
	
	@FindBy(id="isosd")
	private WebElement isSODRadioBtn;
	
	@FindBy(id="users")
	private WebElement userTypeDropdown;
	
	@FindBy(id = "generic_code")
	private WebElement usersCode;
	
	@FindBy(id = "generic_search")
	private WebElement usersCodeSearchBtn;
	
	@FindBy(id="group")
	private WebElement stbCategoryDropdown;
	
	@FindBy(id="message_template")
	private WebElement messageTemplateLink;
	
	@FindBy(id="lco_cust_id")
	private WebElement lcoCustomerIDEdt;
	
	@FindBy(id="lco_cust_search")
	private WebElement lcocustomerIdSearchBtn;
	
	@FindBy(id="mac_vc_number")
	private WebElement vcNumberEdt;
	
	@FindBy(id="addmore")
	private WebElement addMoreVcBtn;
	
	@FindBy(id="msg_title")
	private WebElement messageTitleEdt;
	
	@FindBy(id="ennqnq")
	private WebElement mobileNumberDropdown;
	
	@FindBy(id="msg")
	private WebElement messageEdt;
	
	@FindBy(id="schedule")
	private WebElement scheduleRadioBtn;
	
	@FindBy(id="forced_osd")
	private WebElement forcedOsdCheckbox;
	
	@FindBy(id="sendmsg")
	private WebElement sendBtn;

	public WebElement getServerType() {
		return serverTypeDropdown;
	}

	public WebElement getIsSODRadioBtn() {
		return isSODRadioBtn;
	}

	public WebElement getUserTypeDropdown() {
		return userTypeDropdown;
	}

	public WebElement getUsersCode() {
		return usersCode;
	}

	public WebElement getUsersCodeSearchBtn() {
		return usersCodeSearchBtn;
	}

	public WebElement getStbCategoryDropdown() {
		return stbCategoryDropdown;
	}

	public WebElement getMessageTemplateLink() {
		return messageTemplateLink;
	}

	public WebElement getLcoCustomerID() {
		return lcoCustomerIDEdt;
	}

	public WebElement getLcocustomerIdSearchBtn() {
		return lcocustomerIdSearchBtn;
	}

	public WebElement getVcNumberEdt() {
		return vcNumberEdt;
	}

	public WebElement getAddMoreVcBtn() {
		return addMoreVcBtn;
	}

	public WebElement getMessageTitleEdt() {
		return messageTitleEdt;
	}

	public WebElement getMobileNumberDropdown() {
		return mobileNumberDropdown;
	}

	public WebElement getMessageEdt() {
		return messageEdt;
	}

	public WebElement getScheduleRadioBtn() {
		return scheduleRadioBtn;
	}

	public WebElement getForcedOsdCheckbox() {
		return forcedOsdCheckbox;
	}

	public WebElement getSendBtn() {
		return sendBtn;
	}
    
	
	public STBMessagingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public void addBundle(WebDriver driver,String serverType,String userType,String userCode,String stbCategory,String lcoCustID,String vcNumber,String messageTitle,String mobileNumber,String message  )
	{
     handleDropdown(serverType,serverTypeDropdown);
     isSODRadioBtn.click();
     handleDropdown(userType, userTypeDropdown);
     usersCode.sendKeys(userCode);
     usersCodeSearchBtn.click();
     handleDropdown(stbCategory, stbCategoryDropdown);
     messageTemplateLink.click();
     lcoCustomerIDEdt.sendKeys(lcoCustID);
     lcocustomerIdSearchBtn.click();
     vcNumberEdt.sendKeys(vcNumber);
     addMoreVcBtn.click();
     messageTitleEdt.sendKeys(messageTitle);
     handleDropdown(mobileNumber, mobileNumberDropdown);
     messageEdt.sendKeys(message);
     scheduleRadioBtn.click();
     forcedOsdCheckbox.click();
     sendBtn.click();
    
	}
}
