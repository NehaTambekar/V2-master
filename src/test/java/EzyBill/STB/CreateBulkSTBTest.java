package EzyBill.STB;

import java.io.FileWriter;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.ObjectRepository.CreateStbPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;

public class CreateBulkSTBTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String serviceType=eUtil.readDataFromExcelSheet("CreateStB", 1, 0);
		String serverType=eUtil.readDataFromExcelSheet("CreateStB", 1, 1);
		String location=eUtil.readDataFromExcelSheet("CreateStB", 1, 2);
		String supplier=eUtil.readDataFromExcelSheet("CreateStB", 1, 3);
		double poNumber = eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 4); 
		double invoiceNumber=eUtil.readIntegerDataFromExcelSheet("CreateSTB", 1, 5);
		double pricePerUnit=eUtil.readIntegerDataFromExcelSheet("CreateSTB", 1, 6);
		String make=eUtil.readDataFromExcelSheet("CreateStB", 1, 7);
		String model=eUtil.readDataFromExcelSheet("CreateStB", 1, 8);
		String waranteeIn=eUtil.readDataFromExcelSheet("CreateStB", 1, 9);
		double waranteePeriod=eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 10);
		double batchNumber=eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 11);
		String stbType=eUtil.readDataFromExcelSheet("CreateStB", 1, 12);
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getCreateSTB().click();
		CreateStbPage csp=new CreateStbPage(driver);
		csp.createBulkStb(driver, serviceType, serverType, location, supplier, poNumber, invoiceNumber, pricePerUnit, make, model, waranteeIn, waranteePeriod, batchNumber, stbType);
		
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\CreateSTB.csv"));
		
		String set1[]= {"Chip ID","VC Number"};
		String set2[]= {"123456789012345","123456789012345"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		write.flush();
		driver.findElement(By.id("uploaded_file")).sendKeys("C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\CreateSTB.csv");
		csp.getAddBtn().click();
		driver.findElement(By.id("alertify-ok")).click();
		
	}
}
