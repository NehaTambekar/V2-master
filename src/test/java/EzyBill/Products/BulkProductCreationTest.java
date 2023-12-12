package EzyBill.Products;

import java.io.FileWriter;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.BulkProductCreationPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.ProductsPage;

public class BulkProductCreationTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		JavaUtilities jUtil=new JavaUtilities();
		HomePage hp=new HomePage(driver);
		hp.getProducts().click();
		ProductsPage pp=new ProductsPage(driver);
		pp.getBulkProductCreation().click();
		BulkProductCreationPage bpcp=new BulkProductCreationPage(driver);
		
		String serviceType="CAS";
		String serverType="CONAX";
		String billingSchedule="Recurring-Monthly";
		String billingType="Advance";
		
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\BulkProductCreation.csv"));
		
		String set1[]= {"*SlNo","*Product SKU","*Product Name","*Is Base Package(Yes/No)","Tax Template","*Deduct Lco deposit(Yes/No)","*Deduct LCO Deposit while activation (Yes/No)","Is Alacarte package(Yes/No)","Package Type(Pay/Fta)"};
		String set2[]= {"1","Base Pack Automation"+jUtil.getRandomNumber(),"Base Pack Automation"+jUtil.getRandomNumber(),"Yes","GST","Yes","Yes","No","Fta"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		write.flush();
		
		String uploadFilePath="C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\BulkProductCreation.csv";
		String serviceDuration="Longstanding";
		String basePrice="500";
		
		bpcp.bulkProductCreation(driver, serviceType, serverType, billingSchedule, billingType, uploadFilePath, serviceDuration, basePrice);
	}
}
