package EzyBill.Products;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.AddProductsPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.ProductsPage;

public class AddProductTest extends BaseClass
{
	@Test
	public void test()
	{
		JavaUtilities jUtil=new JavaUtilities();
		String serviceType="CAS";
		String serverType="CONAX";
		String productName="Automation Test"+jUtil.getRandomNumber();
		String productSku="Automation Test"+jUtil.getRandomNumber();
		String billingSchedule="Recurring-Monthly";
		String billingType="Advance";
		String isTaxable="YES";
		String taxTemplate="Tax1";
		String serviceDuration="Months";
		String numberOfMonths="1";
		double basePrice=500;
		HomePage hp=new HomePage(driver);
		hp.getProducts().click();
		ProductsPage pp=new ProductsPage(driver);
		pp.getAdd().click();
		AddProductsPage app=new AddProductsPage(driver);
		app.createBasePack(driver, serviceType, serverType, productName, productSku, billingSchedule, billingType, isTaxable, taxTemplate, serviceDuration, numberOfMonths, basePrice);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
