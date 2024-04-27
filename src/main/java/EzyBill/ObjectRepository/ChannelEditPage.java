  package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import EzyBill.GenericUtilities.WebDriverUtility;

public class ChannelEditPage extends WebDriverUtility
{
  @FindBy(xpath="(//i[@class='fas fa-edit mr-1'])[1]")
  private WebElement editBtn;
  
  @FindBy(xpath="//input[@id='channel_name']")
  private WebElement channelNameEdt;
  
  @FindBy(xpath="//select[@id='channel_category']")
  private WebElement channelCategoryDropdown;
  
  @FindBy(xpath="//select[@id='channel_type']")
  private WebElement channelTypeDropdown;
  
  @FindBy(xpath="//input[@id='channelprice']")
  private WebElement channelPriceEdt;
  
  @FindBy(xpath="//input[@id='carriageprice']")
  private WebElement carriageFeeEdt;
  
  @FindBy(xpath="//input[@id='is_hd']")
  private WebElement isHdCheckbox;
  
  @FindBy(xpath="//input[@id='is_mandatory']")
  private WebElement isMandatoryCheckbox;
  
  @FindBy(xpath="//select[@id='language']")
  private WebElement languageDropdown;
  
  @FindBy(xpath="//input[@id='channel_number']")
  private WebElement channelNoEdt;
  
  @FindBy(id="update_channel_btn")
  private WebElement updateChannelBtn;
  
  @FindBy(xpath="(//button[text()='Close'])[2]")
  private WebElement closeBtn;
  
public WebElement getEditBtn() {
		return editBtn;
}
public WebElement getChannelNameEdt() {
	return channelNameEdt;
}

public WebElement getChannelCategoryDropdown() {
	return channelCategoryDropdown;
}

public WebElement getChannelTypeDropdown() {
	return channelTypeDropdown;
}

public WebElement getChannelPriceEdt() {
	return channelPriceEdt;
}

public WebElement getCarriageFeeEdt() {
	return carriageFeeEdt;
}

public WebElement getIsHdCheckbox() {
	return isHdCheckbox;
}

public WebElement getIsMandatoryCheckbox() {
	return isMandatoryCheckbox;
}

public WebElement getLanguageDropdown() {
	return languageDropdown;
}

public WebElement getChannelNoEdt() {
	return channelNoEdt;
}

public WebElement getUpdateChannelBtn() {
	return updateChannelBtn;
}

public WebElement getCloseBtn() {
	return closeBtn;
}

public ChannelEditPage(WebDriver driver) {
	PageFactory.initElements(driver ,this);
}


public void editChannel(WebDriver driver, String channelName, String channelCategory, double channelType, double channelPrice, double carriageFee, String language, double channelNumber)
{

  channelNameEdt.sendKeys(channelName);
  //handleDropdown(channelCategory,channelCategoryDropdown);
  //handleDropdown(channelType,channelTypeDropdown);
  channelPriceEdt.sendKeys(String.valueOf(channelPrice)); 
  carriageFeeEdt.sendKeys(String.valueOf(carriageFee));
  isHdCheckbox.click();
  isMandatoryCheckbox.click();
  handleDropdown(language, languageDropdown);
  channelNoEdt.sendKeys(String.valueOf(channelNumber)); 
  updateChannelBtn.click();
 //closeBtn.click();
  
 }
}
