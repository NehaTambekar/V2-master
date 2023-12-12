package EzyBill.Complaints;


import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.ObjectRepository.ComplaintsPage;
import EzyBill.ObjectRepository.CreateTemplatePage;
import EzyBill.ObjectRepository.HomePage;

public class CreateTemplateTest extends BaseClass{

	@Test
	public void test() throws Throwable
	{
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String complaintCategory=eUtil.readDataFromExcelSheet("Create Template", 1, 0);
		String title=eUtil.readDataFromExcelSheet("Create Template", 1, 1);
		String message=eUtil.readDataFromExcelSheet("Create Template", 1, 2);
		
		HomePage hp=new HomePage(driver);
		hp.getComplaints().click();
		ComplaintsPage cp=new ComplaintsPage(driver);
		cp.getCreateTemplate().click();
		CreateTemplatePage ctp=new CreateTemplatePage(driver);
		ctp.createTemplate(driver, complaintCategory, title, message);
		
	}
}
