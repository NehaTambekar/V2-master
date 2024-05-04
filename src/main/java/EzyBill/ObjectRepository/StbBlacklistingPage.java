package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class StbBlacklistingPage extends WebDriverUtility
{
	@FindBy(id="txtMacAddress")
	private WebElement vcNumberEdt;
	
	@FindBy(id="txtBoxNumber")
	private WebElement serialNumberEdt;
	
	@FindBy(id="backend_setup_id")
	private WebElement serverTypeDropdown;
	
	@FindBy(id="sbtSearch")
	private WebElement searchBtn;
	
	@FindBy(id="btnClear")
	private WebElement clearBtn;

	public WebElement getVcNumberEdt() {
		return vcNumberEdt;
	}

	public WebElement getSerialNumberEdt() {
		return serialNumberEdt;
	}

	public WebElement getServerTypeDropdown() {
		return serverTypeDropdown;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public StbBlacklistingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void stbBlacklisting( WebDriver driver,String vcNumber,String serialNumber,String serverType)throws Throwable
	{
		vcNumberEdt.sendKeys(vcNumber);	
		serialNumberEdt.sendKeys(serialNumber);
		handleDropdown(serverType,serverTypeDropdown);
		searchBtn.click();
		clearBtn.click();
		
	}
	

}
