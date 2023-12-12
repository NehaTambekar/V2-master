package EzyBill.Channels;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.ChannelsPage;
import EzyBill.ObjectRepository.CreateBroadcasterPage;
import EzyBill.ObjectRepository.HomePage;

public class CreateBroadcasterTest extends BaseClass
{
	@Test
	public void test() throws Throwable
	{
		JavaUtilities jUtil=new JavaUtilities();
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String broadcasterName=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 0)+jUtil.getRandomNumber();
		long broadcasterMobile=(long)eUtil.readIntegerDataFromExcelSheet("CreateBroadcaster", 1, 1);
		String contactName=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 2);
		long contactPhone=(long)eUtil.readIntegerDataFromExcelSheet("CreateBroadcaster", 1, 3);
		String address1=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 4);
		String country=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 5);
		String state=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 6);
		String district=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 7);
		String city=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 8);
		double pincode=eUtil.readIntegerDataFromExcelSheet("CreateBroadcaster", 1, 9);
		String email=eUtil.readDataFromExcelSheet("CreateBroadcaster", 1, 10);
		
		HomePage hp=new HomePage(driver);
		hp.getChannels().click();
		
		ChannelsPage cp=new ChannelsPage(driver);
		cp.getCreateBroadcaster().click();
		
		CreateBroadcasterPage cbp=new CreateBroadcasterPage(driver);
		cbp.createBroadcaster(driver, broadcasterName, broadcasterMobile, contactName, contactPhone, address1, country, state, district, city, pincode, email);
		String actual=driver.findElement(By.xpath("//p[text()='Broadcaster Created Successfully.']")).getText();
		String expected="Broadcaster Created Successfully.";
		assertEquals(actual, expected);
	}
}
