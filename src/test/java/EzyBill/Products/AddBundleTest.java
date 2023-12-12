package EzyBill.Products;

import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.AddBundlePage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.ProductsPage;

public class AddBundleTest extends BaseClass {

	@Test
	public void test()
	{
		JavaUtilities jUtil=new JavaUtilities();
		String bundleSku="Automation Test"+jUtil.getRandomNumber();
		String bundleName="Automation Test"+jUtil.getRandomNumber();
		String billingSchedule="Recurring-Monthly";
		String billingType="Advanced";
		String isTaxable="YES";
		String taxTemplate="GST";
		String serviceDuration="Months";
		String numberOfMonths="1";
		double basePrice=500;
		String serverType="CDCAS";
		String packageType1="Base Package";
		String packageType2="Base Package";
		HomePage hp=new HomePage(driver);
		hp.getProducts().click();
		ProductsPage pp=new ProductsPage(driver);
		pp.getBundle().click();
		pp.getAddBundle().click();
		AddBundlePage abp=new AddBundlePage(driver);
		abp.addBundle(driver, bundleSku, bundleName, billingSchedule, billingType, isTaxable, taxTemplate, serviceDuration, numberOfMonths, basePrice, serverType, packageType1, packageType2);
		
	}
}
