package EzyBill.Channels;

import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.AddNewChannelPage;
import EzyBill.ObjectRepository.ChannelListPage;
import EzyBill.ObjectRepository.ChannelsPage;
import EzyBill.ObjectRepository.HomePage;

public class AddNewChannelTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		JavaUtilities jUtil=new JavaUtilities();
		String channelName="Anything"+jUtil.getRandomNumber();
		String channelCategory="knowledge";
		String language="english";
		String channelType="FTA";
		
		HomePage hp=new HomePage(driver);
		hp.getChannels().click();
		ChannelsPage cp=new ChannelsPage(driver);
		cp.getChannelList().click();
		ChannelListPage clp=new ChannelListPage(driver);
		clp.getAddNewChannelBtn().click();
		AddNewChannelPage ancp=new AddNewChannelPage(driver);
		ancp.createChannel(driver, channelName, channelCategory, language, channelType);
	}
	
}
