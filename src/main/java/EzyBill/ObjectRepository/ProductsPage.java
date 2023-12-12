package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	@FindBy(xpath = "//a[text()='Add']")
	private WebElement add;
	
	//a[@href='#sidebarMultilevel2']
	@FindBy(xpath = "//div[@id='sidebar_product']//a[@data-toggle='collapse' and @href='#sidebarMultilevel2']/span[@class='menu-arrow']")
	private WebElement bundle;
	
	@FindBy(xpath = "//a[text()='Add Bundle']")
	private WebElement addBundle;
	
	@FindBy(xpath = "//a[text()='List']")
	private WebElement list;
	
	@FindBy(xpath = "//a[@href='#sidebardiscount']")
	private WebElement discount;
	
	@FindBy(xpath = "//a[text()='Categories']")
	private WebElement catagories;
	
	@FindBy(xpath = "//a[text()='Product Mapping']")
	private WebElement productMapping;
	
	@FindBy(xpath = "//a[text()='Trai Product Price']")
	private WebElement traiProductPrice;
	
	@FindBy(xpath = "//a[text()='Bulk Product Creation']")
	private WebElement bulkProductCreation;

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getBundle() {
		return bundle;
	}
	
	public WebElement getAddBundle() {
		return addBundle;
	}

	public WebElement getList() {
		return list;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getCatagories() {
		return catagories;
	}

	public WebElement getProductMapping() {
		return productMapping;
	}

	public WebElement getTraiProductPrice() {
		return traiProductPrice;
	}

	public WebElement getBulkProductCreation() {
		return bulkProductCreation;
	}
	
	
}
