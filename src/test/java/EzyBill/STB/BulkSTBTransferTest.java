package EzyBill.STB;

import java.io.FileWriter;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.STBTransferByFileUploadPage;
import EzyBill.ObjectRepository.StbPage;
import EzyBill.ObjectRepository.TransferStbPage;

public class BulkSTBTransferTest extends BaseClass{
	@Test
	public void test() throws Throwable
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getTransferSTB().click();
		TransferStbPage tsp=new TransferStbPage(driver);
		tsp.getStbTransferByFileUploadRadioBtn().click();
		STBTransferByFileUploadPage stfu=new STBTransferByFileUploadPage(driver);
		
		String description=eUtil.readDataFromExcelSheet("TransferSTB", 1, 0);
		String sourceLocation=eUtil.readDataFromExcelSheet("TransferSTB", 1, 1);
		String stockLocation=eUtil.readDataFromExcelSheet("TransferSTB", 1, 2);
		String destination=eUtil.readDataFromExcelSheet("TransferSTB", 1, 3);
		String lcoLocation=eUtil.readDataFromExcelSheet("TransferSTB", 1, 4);
		String serviceType=eUtil.readDataFromExcelSheet("TransferSTB", 1, 5);
		String serverType=eUtil.readDataFromExcelSheet("TransferSTB", 1, 6);
		
		stfu.transferSTB(description, serviceType, serverType, sourceLocation, stockLocation, destination, lcoLocation);
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\TransferStb.csv"));
		
		String set1[]= {"*Chip ID"};
		String set2[]= {"123456789012345"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		write.flush();
		
		driver.findElement(By.id("uploaded_file")).sendKeys("C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\TransferStb.csv");
		stfu.getTransferBtn().click();
		stfu.getOkBtn().click();
		
	}
}
