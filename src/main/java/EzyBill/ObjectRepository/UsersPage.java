package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath = "//a[text()='Create User']")
	private WebElement createUser;
	
	@FindBy(xpath = "//a[text()='List Users']")
	private WebElement listUsers;
	
	@FindBy(xpath = "//a[text()='Bulk Product Mapping/Unmapping']")
	private WebElement bulkProductMapping;
	
	@FindBy(xpath = "//a[text()='Intra LCO Mapping']")
	private WebElement intraLcoMapping;
	
	@FindBy(xpath = "//a[text()='LCO Payment']")
	private WebElement lcoPayment;
	
	@FindBy(xpath = "//a[text()='LCO Payments List ']")
	private WebElement lcoPaymentsList;
	
	@FindBy(xpath = "//a[text()='LCO Payable Format']")
	private WebElement lcoPayableFormat;
	
	@FindBy(xpath = "//a[text()='LCO Billing ']")
	private WebElement lcoBilling;
	
	@FindBy(xpath = "//a[text()='GST Receipt']")
	private WebElement gstReceipt;
	
	@FindBy(xpath = "//a[text()='Distributor List']")
	private WebElement distributorList;
	
	@FindBy(xpath = "//a[text()='LCO Packages']")
	private WebElement lcoPackages;
	
	@FindBy(xpath = "//a[text()=' Outlet Deposits ']")
	private WebElement outletDeposits;
	
	@FindBy(xpath = "//a[text()='Customer Online Paymets']")
	private WebElement customerOnlinePayments;
	
	@FindBy(xpath = "//a[text()='Service Employee List']")
	private WebElement serviceEmployeeList;
	
	@FindBy(xpath = "//a[text()='LCO Payment Reconciliation']")
	private WebElement lcoPaymentReconciliation;
	
	@FindBy(xpath = "//a[text()='LCO Share Percentages']")
	private WebElement lcoSharePercentages;

	
	
	public WebElement getCreateUser() {
		return createUser;
	}



	public WebElement getListUsers() {
		return listUsers;
	}



	public WebElement getBulkProductMapping() {
		return bulkProductMapping;
	}



	public WebElement getIntraLcoMapping() {
		return intraLcoMapping;
	}



	public WebElement getLcoPayment() {
		return lcoPayment;
	}



	public WebElement getLcoPaymentsList() {
		return lcoPaymentsList;
	}



	public WebElement getLcoPayableFormat() {
		return lcoPayableFormat;
	}



	public WebElement getLcoBilling() {
		return lcoBilling;
	}



	public WebElement getGstReceipt() {
		return gstReceipt;
	}



	public WebElement getDistributorList() {
		return distributorList;
	}



	public WebElement getLcoPackages() {
		return lcoPackages;
	}



	public WebElement getOutletDeposits() {
		return outletDeposits;
	}



	public WebElement getCustomerOnlinePayments() {
		return customerOnlinePayments;
	}



	public WebElement getServiceEmployeeList() {
		return serviceEmployeeList;
	}



	public WebElement getLcoPaymentReconciliation() {
		return lcoPaymentReconciliation;
	}



	public WebElement getLcoSharePercentages() {
		return lcoSharePercentages;
	}



	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
