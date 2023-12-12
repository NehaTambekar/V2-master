package EzyBill.STB;

import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;
import EzyBill.ObjectRepository.StbReplacementPage;


public class StbReplacementTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		int serialNumber=8889898;
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		
		StbPage sp=new StbPage(driver);
		sp.getStbReplacement().click();
		
		StbReplacementPage srp=new StbReplacementPage(driver);
		srp.stbReplacement(serialNumber);
		
	}
}
