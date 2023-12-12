package EzyBill.STB;

import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.CreateStbPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;
import EzyBill.ObjectRepository.TransferIndividualStbPage;
import EzyBill.ObjectRepository.TransferStbPage;

public class CreateAndTransferStbTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		JavaUtilities jUtil=new JavaUtilities();
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
		double serialNumber=eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 13)+jUtil.getRandomNumber();
		double vcNumber=eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 14)+jUtil.getRandomNumber();
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getCreateSTB().click();
		CreateStbPage csp=new CreateStbPage(driver);
		csp.createStb(driver, serviceType, serverType, location, supplier, poNumber, invoiceNumber, pricePerUnit, make, model, waranteeIn, waranteePeriod, batchNumber, stbType, serialNumber, vcNumber);
		sp.getTransferSTB().click();
		TransferStbPage tsp=new TransferStbPage(driver);
		tsp.getStbTransferRadioBtn().click();
		
		String description=eUtil.readDataFromExcelSheet("TransferSTB", 1, 0);
		String sourceLocation=eUtil.readDataFromExcelSheet("TransferSTB", 1, 1);
		String stockLocation=eUtil.readDataFromExcelSheet("TransferSTB", 1, 2);
		String destination=eUtil.readDataFromExcelSheet("TransferSTB", 1, 3);
		String lcoLocation=eUtil.readDataFromExcelSheet("TransferSTB", 1, 4);
		
		TransferIndividualStbPage tisp=new TransferIndividualStbPage(driver);
		tisp.transferSTB(description, sourceLocation, stockLocation, destination, lcoLocation, vcNumber);
		
		
	}
}
