package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferStbPage {
	
	@FindBy (xpath = "//input[@name='transfer_Type' and @value=1]")
	private WebElement stbTransferRadioBtn;
	
	@FindBy (xpath = "//input[@name='transfer_Type' and @value=2]")
	private WebElement stbTransferByFileUploadRadioBtn;
	
	@FindBy (xpath = "//input[@name='transfer_Type' and @value=3]")
	private WebElement multiUserStbTransferByFileUploadRadioBtn;

	public TransferStbPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getStbTransferRadioBtn() {
		return stbTransferRadioBtn;
	}

	public WebElement getStbTransferByFileUploadRadioBtn() {
		return stbTransferByFileUploadRadioBtn;
	}

	public WebElement getMultiUserStbTransferByFileUploadRadioBtn() {
		return multiUserStbTransferByFileUploadRadioBtn;
	}
	
	
}
