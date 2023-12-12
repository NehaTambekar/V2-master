package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;



public class AddNewCategoryPage extends WebDriverUtility{

	@FindBy(id = "category")
	private WebElement categoryEdt;
	
	@FindBy(id = "NewCategory")
	private WebElement saveBtn;

	@FindBy(id = "alertify-ok")
	private WebElement okBtn;
	
	public WebElement getCategoryEdt() {
		return categoryEdt;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public WebElement getOkBtn() {
		return okBtn;
	}

	public AddNewCategoryPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void addNewCategory(WebDriver driver,String productCategoryName)
	{
		categoryEdt.sendKeys(productCategoryName);
		saveBtn.click();
		waitForPageLoad(driver);
		okBtn.click();
	}
}
