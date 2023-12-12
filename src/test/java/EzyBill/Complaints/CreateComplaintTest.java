package EzyBill.Complaints;

import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.ObjectRepository.ComplaintsPage;
import EzyBill.ObjectRepository.CreateComplaintPage;
import EzyBill.ObjectRepository.HomePage;

public class CreateComplaintTest extends BaseClass
{
	@Test
	public void test() throws Throwable
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		long customerID=(long) eUtil.readIntegerDataFromExcelSheet("Create Complaint", 1, 0);
		String complaintCategory=eUtil.readDataFromExcelSheet("Create Complaint", 1, 1);
		String subCategory=eUtil.readDataFromExcelSheet("Create Complaint", 1, 2);
		String assignTo=eUtil.readDataFromExcelSheet("Create Complaint", 1, 3);
		String assignedusersname=eUtil.readDataFromExcelSheet("Create Complaint", 1, 4);
		String Message=eUtil.readDataFromExcelSheet("Create Complaint", 1, 5);
		HomePage hp=new HomePage(driver);    
		hp.getComplaints().click();
		ComplaintsPage cp=new ComplaintsPage(driver);
		cp.getCreateComplaint().click();
		CreateComplaintPage ccp=new CreateComplaintPage(driver);
		ccp.createComplaint(driver, customerID, complaintCategory, subCategory, assignTo,assignedusersname , Message);
	}	
}
