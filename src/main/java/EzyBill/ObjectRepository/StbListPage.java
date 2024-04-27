package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class StbListPage extends WebDriverUtility {

	@FindBy(xpath="//input[@id='btnStatic']")
	private WebElement staticBtn;
	
	@FindBy(xpath="//input[@id='btnDynamic']")
	private WebElement realTimeBtn;

	public WebElement getStaticBtn() {
		return staticBtn;
	}

	public WebElement getRealTimeBtn() {
		return realTimeBtn;
	}

	public StbListPage(WebDriver driver) {
      PageFactory.initElements(driver, this);
	}
	
	public void stbList(WebDriver driver )
	{
		staticBtn.click();
		realTimeBtn.click();
		
	}
	
	
	

}
