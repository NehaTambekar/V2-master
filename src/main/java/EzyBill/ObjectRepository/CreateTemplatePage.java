package EzyBill.ObjectRepository;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class CreateTemplatePage extends WebDriverUtility {

	@FindBy (id = "selComplaintCategory")
	private WebElement complaintCategoryDropdown;
	
	@FindBy (id = "templatetitle")
	private WebElement titleEdt;
	
	@FindBy (id = "templateMessage")
	private WebElement messageEdt;
	
	@FindBy (id = "add")
	private WebElement addBtn;
	
	@FindBy (id = "clear")
	private WebElement clearBtn;

	//alertify-ok
	@FindBy (id = "alertify-ok")
	private WebElement okBtn;
	
	public WebElement getComplaintCategoryDropdown() {
		return complaintCategoryDropdown;
	}

	public WebElement getTitleEdt() {
		return titleEdt;
	}

	public WebElement getMessageEdt() {
		return messageEdt;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getClearBtn() {
		return clearBtn;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}

	public CreateTemplatePage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	public void createTemplate(WebDriver driver, String complaintCategory, String title, String message)
	{
		handleDropdown(complaintCategory, complaintCategoryDropdown);
		titleEdt.sendKeys(title);
		messageEdt.sendKeys(message);
		addBtn.click();
		String actual=driver.findElement(By.xpath("//p[text()='Complaint Template Inserted Successfully.']")).getText();
		String expected="Complaint Template Inserted Successfully.";
		assertEquals(actual, expected);
		okBtn.click();
	}
}
