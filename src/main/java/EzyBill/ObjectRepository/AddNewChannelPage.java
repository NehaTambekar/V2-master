package EzyBill.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import EzyBill.GenericUtilities.WebDriverUtility;

public class AddNewChannelPage extends WebDriverUtility{

	@FindBy (id = "txtChannelName")
	private WebElement channelNameEdt;
	
	@FindBy (id = "select2-selChannelCategory-container")
	private WebElement channelCatagoryDropdown;
	
	@FindBy (id = "select2-sellanguage-container")
	private WebElement languageDropdown;
	
	@FindBy (id = "selChannelType")
	private WebElement channelTypeDropdown;
	
	@FindBy (id = "sbtSaveChannel")
	private WebElement saveBtn;
	
	@FindBy (id = "//label[text()='Is Mandatory']")
	private WebElement isMandatory;
	
	@FindBy (id = "//label[text()='Is HD Channel']")
	private WebElement isHDChannel;

	//input[@class='select2-search__field']
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement channelCategoryEdt;
	
	@FindBy (xpath = "//input[@class='select2-search__field']")
	private WebElement languageCategoryEdt;
	
	public WebElement getChannelNameEdt() {
		return channelNameEdt;
	}

	public WebElement getChannelCatagoryDropdown() {
		return channelCatagoryDropdown;
	}

	public WebElement getLanguageDropdown() {
		return languageDropdown;
	}

	public WebElement getChannelTypeDropdown() {
		return channelTypeDropdown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getIsMandatory() {
		return isMandatory;
	}

	public WebElement getIsHDChannel() {
		return isHDChannel;
	}

	public AddNewChannelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void createChannel(WebDriver driver,String channelName, String channelCategory, String language, String channelType) throws Throwable
	{
		channelNameEdt.sendKeys(channelName);
		mouseHover(driver, channelCatagoryDropdown);
		waitForElementToBeVisible(driver, channelCategoryEdt);
		channelCategoryEdt.sendKeys(channelCategory);
		pressEnterKey();
		
		mouseHover(driver, languageDropdown);
		languageCategoryEdt.sendKeys(language);
		pressEnterKey();
		
		handleDropdown(channelType, channelTypeDropdown);
		
		saveBtn.click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
