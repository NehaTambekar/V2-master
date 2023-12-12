package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelsPage {
	
	@FindBy (xpath = "//a[text()='Broadcaster List']")
	private WebElement broadcasterList;

	@FindBy (xpath = "//a[text()='Create Broadcaster']")
	private WebElement createBroadcaster;

	@FindBy (xpath = "//a[text()='Channel CAS Map']")
	private WebElement channelCASMap;

	/*@FindBy (xpath = "")
	private WebElement abgc; */

	@FindBy (xpath = "//descendant::a[text()='Channel List']")
	private WebElement channelList;

	@FindBy (xpath = "//descendant::a[text()='Channel Info']")
	private WebElement channelInfo;

	public WebElement getBroadcasterList() {
		return broadcasterList;
	}

	public WebElement getCreateBroadcaster() {
		return createBroadcaster;
	}

	public WebElement getChannelCASMap() {
		return channelCASMap;
	}

	public WebElement getChannelList() {
		return channelList;
	}

	public WebElement getChannelInfo() {
		return channelInfo;
	}

	public ChannelsPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	
	}
	
	

}
