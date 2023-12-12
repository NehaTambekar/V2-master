package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class CreateComplaintPage extends WebDriverUtility {

	@FindBy (id = "customer_id")
	private WebElement customerID;
	
	@FindBy (id = "sbtFetchCustomerDetails")
	private WebElement fetchBtn;
	
	@FindBy (id = "selComplaintCategory")
	private WebElement complaintCategoryDropdown;
	
	@FindBy (id = "selComplaintsubCategory")
	private WebElement subCategoryDropdown;
	
	@FindBy (id = "assigned_users_type")
	private WebElement assignToDropdown;
	
	//assignedusersname
	@FindBy (id = "assignedusersname")
	private WebElement assignedusersnameDropDown;
	
	@FindBy (id = "msg")
	private WebElement enterComplaintMessage;
	
	@FindBy (id = "registerComplaint")
	private WebElement placeComplaintBtn;
	
	@FindBy (id = "ftrComplaint")
	private WebElement FTRBtn;

	public WebElement getCustomerID() {
		return customerID;
	}

	public WebElement getFetchBtn() {
		return fetchBtn;
	}

	public WebElement getComplaintCategoryDropdown() {
		return complaintCategoryDropdown;
	}

	public WebElement getSubCategoryDropdown() {
		return subCategoryDropdown;
	}

	public WebElement getAssignToDropdown() {
		return assignToDropdown;
	}

	public WebElement getEnterComplaintMessage() {
		return enterComplaintMessage;
	}

	public WebElement getPlaceComplaintBtn() {
		return placeComplaintBtn;
	}

	public WebElement getAssignedusersnameDropDown() {
		return assignedusersnameDropDown;
	}

	public WebElement getFTRBtn() {
		return FTRBtn;
	}

	public CreateComplaintPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void createComplaint(WebDriver driver, long customerID, String complaintCategory, String subCategory, String assignTo,String assignedusersname, String Message)
	{
		this.customerID.sendKeys(String.valueOf(customerID));
		fetchBtn.click();
		waitForElementToBeVisible(driver, complaintCategoryDropdown);
		handleDropdown(complaintCategory, complaintCategoryDropdown);
		waitForElementToBeVisible(driver, subCategoryDropdown);
		handleDropdown(subCategory, subCategoryDropdown);
		waitForElementToBeVisible(driver, assignToDropdown);
		handleDropdown(assignTo, assignToDropdown);
		waitForElementToBeVisible(driver, assignedusersnameDropDown);
		handleDropdown(assignedusersname, getAssignedusersnameDropDown());
		enterComplaintMessage.sendKeys(Message);
		placeComplaintBtn.click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
	
}
