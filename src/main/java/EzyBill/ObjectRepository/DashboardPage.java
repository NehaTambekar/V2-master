package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	@FindBy (xpath = "//span[text()='Active Customers']")
	private WebElement activeCustomers;
	
	@FindBy (xpath = "//span[text()='Inactive Customers']")
	private WebElement inactiveCustomers;
	
	@FindBy (xpath = "//span[text()='Current Month Paid Customers']")
	private WebElement currentMonthPaidCustomers;
	
	@FindBy (xpath = "//span[text()='Current Month Paid Customers']")
	private WebElement currentMonthUnpaidCustomers;
	
	@FindBy (xpath = "//h3[text()='Billing Information']")
	private WebElement billingInformation;
	
	@FindBy (xpath = "//h6[text()='Current Month Billing']")
	private WebElement currentMonthBilling;
	
	@FindBy (xpath = "//h3[@class='header-title mb-2 mt-3']")
	private WebElement stbInformation;
	
	@FindBy (xpath = "(//h6[@class='mb-1'])[2]")
	private WebElement assignedInactiveSTB;
	
	@FindBy (xpath = "(//h6[@class='mb-1'])[3]")
	private WebElement unassignedSTB;
	
	@FindBy (xpath = "(//h6[@class='mb-1'])[4]")
	private WebElement totalassignedSTB;
	
	@FindBy (xpath = "//h3[text()='STB Counts']")
	private WebElement stbCounts;
	
	@FindBy (xpath = "//h3[text()='Customer Information']")
	private WebElement customerInformation;
	
	@FindBy (xpath = "//h4[text()='OTT Counts ']")
	private WebElement ottCounts;
	
	@FindBy (xpath = "//h4[text()='Complaints']")
	private WebElement complaints;

	public WebElement getActiveCustomers() {
		return activeCustomers;
	}

	public WebElement getInactiveCustomers() {
		return inactiveCustomers;
	}

	public WebElement getCurrentMonthPaidCustomers() {
		return currentMonthPaidCustomers;
	}

	public WebElement getCurrentMonthUnpaidCustomers() {
		return currentMonthUnpaidCustomers;
	}

	public WebElement getBillingInformation() {
		return billingInformation;
	}

	public WebElement getCurrentMonthBilling() {
		return currentMonthBilling;
	}

	public WebElement getStbInformation() {
		return stbInformation;
	}

	public WebElement getAssignedInactiveSTB() {
		return assignedInactiveSTB;
	}

	public WebElement getUnassignedSTB() {
		return unassignedSTB;
	}

	public WebElement getTotalassignedSTB() {
		return totalassignedSTB;
	}

	public WebElement getStbCounts() {
		return stbCounts;
	}

	public WebElement getCustomerInformation() {
		return customerInformation;
	}

	public WebElement getOttCounts() {
		return ottCounts;
	}

	public WebElement getComplaints() {
		return complaints;
	}

	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
