package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DasPage {
	@FindBy(xpath = "//a[text()='STB Management']")
	private WebElement stbManagement;

	@FindBy(xpath = "//a[text()='STB Messaging']")
	private WebElement stbMessaging;
	
	@FindBy(xpath = "//a[text()='STB Black Listing']")
	private WebElement stbBlackListing;
	
	@FindBy(xpath = "//a[text()='Global Fingerprint']")
	private WebElement globalFingerprint;
	
	@FindBy(xpath = "//a[text()='Service Center']")
	private WebElement serviceCenter;
	
	@FindBy(xpath = "//a[text()='Migrate/Upgrade Services']")
	private WebElement upgradeService;
	
	@FindBy(xpath = "//a[text()='CAS Misc. Operations']")
	private WebElement casMiscOperations;
	
	@FindBy(xpath = "//a[text()='CAS Reconciliation']")
	private WebElement casReconciliation;
	
	@FindBy(xpath = "//a[text()='CAS Response Time']")
	private WebElement casResponseTime;
	
	@FindBy(xpath = "//a[text()='Kill OSD']")
	private WebElement killOSD;
	
	
	
	public WebElement getStbManagement() {
		return stbManagement;
	}

	public WebElement getStbMessaging() {
		return stbMessaging;
	}

	public WebElement getStbBlackListing() {
		return stbBlackListing;
	}

	public WebElement getGlobalFingerprint() {
		return globalFingerprint;
	}

	public WebElement getServiceCenter() {
		return serviceCenter;
	}

	public WebElement getUpgradeService() {
		return upgradeService;
	}

	public WebElement getCasMiscOperations() {
		return casMiscOperations;
	}

	public WebElement getCasReconciliation() {
		return casReconciliation;
	}

	public WebElement getCasResponseTime() {
		return casResponseTime;
	}

	public WebElement getKillOSD() {
		return killOSD;
	}

	public DasPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
