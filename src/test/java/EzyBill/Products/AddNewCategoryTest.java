package EzyBill.Products;

import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.AddNewCategoryPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.ProductsPage;

public class AddNewCategoryTest extends BaseClass{

	@Test
	public void test()
	{
		JavaUtilities jUtil=new JavaUtilities();
		String productCategoryName="Product category"+jUtil.getRandomNumber();
		HomePage hp=new HomePage(driver);
		hp.getProducts().click();
		ProductsPage pp=new ProductsPage(driver);
		pp.getCatagories().click();
		AddNewCategoryPage ancp=new AddNewCategoryPage(driver);
		ancp.addNewCategory(driver, productCategoryName);
		
	}
}
