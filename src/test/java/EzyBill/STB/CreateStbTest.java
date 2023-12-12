package EzyBill.STB;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.CreateStbPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;

public class CreateStbTest extends BaseClass {

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
		double serialNumber=eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 13);
		double vcNumber=eUtil.readIntegerDataFromExcelSheet("CreateStB", 1, 14);
		JavaUtilities jUtil=new JavaUtilities();
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getCreateSTB().click();
		CreateStbPage csp=new CreateStbPage(driver);
		csp.createStb(driver, serviceType, serverType, location, supplier, poNumber, invoiceNumber, pricePerUnit, make, model, waranteeIn, waranteePeriod, batchNumber, stbType, serialNumber+jUtil.getRandomNumber(), vcNumber+jUtil.getRandomNumber());
		String expected="Success.";
		String actual=driver.findElement(By.xpath("//strong[text()='Success.']")).getText();
		assertEquals(actual, expected);
		waitForPageLoad(driver);
	}
}
