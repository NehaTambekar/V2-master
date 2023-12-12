package EzyBill.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChannelListPage {

	@FindBy (id = "butAddChannel")
	private WebElement addNewChannelBtn;

	public WebElement getAddNewChannelBtn() {
		return addNewChannelBtn;
	}

	public ChannelListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
}
