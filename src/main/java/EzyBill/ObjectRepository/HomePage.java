package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span[text()=' STB ']")
	private WebElement STB;

	@FindBy(xpath = "//span[text()=' DAS ']")
	private WebElement DAS;
	
	@FindBy(xpath = "//img[@alt='Profile Pic']")
	private WebElement profileImg;
	
	@FindBy(xpath = "//span[text()='Logout']")
	private WebElement logoutBtn;
	
	@FindBy(xpath = "//span[text()=' Dashboard ']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//span[text()=' Customers ']")
	private WebElement customers;
	
	@FindBy(xpath = "//span[text()=' Users ']")
	private WebElement users;
	
	@FindBy(xpath = "//span[text()=' Products ']")
	private WebElement products;
	
	@FindBy(xpath = "//span[text()=' Channels ']")
	private WebElement channels;
	
	@FindBy(xpath = "//span[text()=' Complaints ']")
	private WebElement complaints;
	
	@FindBy(xpath = "//span[text()=' Reports ']")
	private WebElement reports;
	
	@FindBy(xpath = "//span[text()=' Inventory ']")
	private WebElement inventory;
	
	@FindBy(xpath = "//span[text()=' TRAI ']")
	private WebElement trai;
	
	@FindBy(xpath = "//span[text()=' Settings ']")
	private WebElement setting;
	
	@FindBy(xpath = "//span[text()=' Customer Billing Share ']")
	private WebElement customerBillingShare;
	
	public WebElement getDashboard() {
		return dashboard;
	}

	public WebElement getCustomers() {
		return customers;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getProducts() {
		return products;
	}

	public WebElement getChannels() {
		return channels;
	}

	public WebElement getComplaints() {
		return complaints;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getInventory() {
		return inventory;
	}

	public WebElement getTrai() {
		return trai;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getCustomerBillingShare() {
		return customerBillingShare;
	}

	public WebElement getProfileImg() {
		return profileImg;
	}

	public WebElement getSTB() {
		return STB;
	}

	public WebElement getDAS() {
		return DAS;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public void logout()
	{
		profileImg.click();
		getLogoutBtn().click();
	}
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
