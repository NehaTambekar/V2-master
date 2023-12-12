package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdductsPage 
{
	@FindBy (xpath = "//a[text()='Add']")
	private WebElement addNewProductBtn;
	
	@FindBy (xpath = "//a[@href='http://192.168.1.143/patch7_kccl/index.php/Products/productlist']")
	private WebElement listBtn;

	public ProdductsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
		
	public WebElement getAddNewProductBtn() {
		return addNewProductBtn;
	}

	public WebElement getListBtn() {
		return listBtn;
	}
	
}
