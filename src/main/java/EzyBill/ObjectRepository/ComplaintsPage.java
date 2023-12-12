package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComplaintsPage 
{
	@FindBy (xpath = "//a[text()='Create Complaint']")
	private WebElement createComplaint;
	
	@FindBy (xpath = "//a[text()='Bulk Complaint Creation']")
	private WebElement bulkComplaintCreation;
	
	@FindBy (xpath = "//a[text()='Compliant List']")
	private WebElement complaintList;
	
	@FindBy (xpath = "//a[text()='Leads List']")
	private WebElement leadList;
	
	@FindBy (xpath = "//a[text()='Employee Category Map']")
	private WebElement employeeCategoryMap;
	
	@FindBy (xpath = "//a[text()='Employee Lco Map']")
	private WebElement employeeLCOMap;
	
	@FindBy (xpath = "//a[text()='Create Template']")
	private WebElement createTemplate;
	
	@FindBy (xpath = "//a[text()='Create Enquiry']")
	private WebElement createEnquiry;
	
	@FindBy (xpath = "//a[text()='Enquiry List']")
	private WebElement enquiryList;

	public WebElement getCreateComplaint() {
		return createComplaint;
	}

	public WebElement getBulkComplaintCreation() {
		return bulkComplaintCreation;
	}

	public WebElement getComplaintList() {
		return complaintList;
	}

	public WebElement getLeadList() {
		return leadList;
	}

	public WebElement getEmployeeCategoryMap() {
		return employeeCategoryMap;
	}

	public WebElement getEmployeeLCOMap() {
		return employeeLCOMap;
	}

	public WebElement getCreateTemplate() {
		return createTemplate;
	}

	public WebElement getCreateEnquiry() {
		return createEnquiry;
	}

	public WebElement getEnquiryList() {
		return enquiryList;
	}

	public ComplaintsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
