package EzyBill.Complaints;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.ObjectRepository.ComplaintsPage;
import EzyBill.ObjectRepository.CreateEnquiryPage;
import EzyBill.ObjectRepository.HomePage;

public class CreateEnquiryTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String firstName=eUtil.readDataFromExcelSheet("Create Enquiry", 1, 0);
		String address=eUtil.readDataFromExcelSheet("Create Enquiry", 1, 1);
		long mobile=(long) eUtil.readIntegerDataFromExcelSheet("Create Enquiry", 1, 2); 
		String enquiryCategory=eUtil.readDataFromExcelSheet("Create Enquiry", 1, 3); 
		String enquiryInfo=eUtil.readDataFromExcelSheet("Create Enquiry", 1, 4);
		
		HomePage hp=new HomePage(driver);
		hp.getComplaints().click();
		ComplaintsPage cp=new ComplaintsPage(driver);
		cp.getCreateEnquiry().click();
		CreateEnquiryPage cep=new CreateEnquiryPage(driver);
		cep.createEnquiry(firstName, address, mobile, enquiryCategory, enquiryInfo);
		String actual=driver.findElement(By.xpath("//p[text()='Enquiry Created Successfully.']")).getText();
		String expected="Enquiry Created Successfully.";
		assertEquals(actual, expected);
		driver.findElement(By.id("alertify-ok")).click();
		
	}
}
