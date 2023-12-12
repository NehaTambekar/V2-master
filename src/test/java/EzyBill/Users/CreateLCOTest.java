package EzyBill.Users;




import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.GenericUtilities.JavaUtilities;
import EzyBill.ObjectRepository.CreateUsersPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.UsersPage;

public class CreateLCOTest extends BaseClass {
	
	@Test
	public void test() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.getUsers().click();
		UsersPage up=new UsersPage(driver);
		up.getCreateUser().click();
		JavaUtilities jUtil=new JavaUtilities();
		ExcelFileUtility eUtil=new ExcelFileUtility();
		String FirstName=eUtil.readDataFromExcelSheet("CreateUser", 1, 0);
		String LastName=eUtil.readDataFromExcelSheet("CreateUser", 1, 1);
		String IDType=eUtil.readDataFromExcelSheet("CreateUser", 1, 3);
		double IDNumber=eUtil.readIntegerDataFromExcelSheet("CreateUser", 1, 4);//double IDNumber=451265329865d;
		String country=eUtil.readDataFromExcelSheet("CreateUser", 1, 5);
		String state=eUtil.readDataFromExcelSheet("CreateUser", 1, 6);
		String district=eUtil.readDataFromExcelSheet("CreateUser", 1, 7);
		String Taluka=eUtil.readDataFromExcelSheet("CreateUser", 1, 8);
		String city=eUtil.readDataFromExcelSheet("CreateUser", 1, 9);
		double pincode=eUtil.readIntegerDataFromExcelSheet("CreateUser", 1, 10); //double pincode=412554;
		String emailID=eUtil.readDataFromExcelSheet("CreateUser", 1, 11);
		double mobile=7845126598d;//double mobile=eUtil.readIntegerDataFromExcelSheet("CreateUser", 1, 12);
		String billingAddress=eUtil.readDataFromExcelSheet("CreateUser", 1, 13);
		String bankName=eUtil.readDataFromExcelSheet("CreateUser", 1, 14);
		double accountNumber=50100215478d;//double accountNumber=eUtil.readIntegerDataFromExcelSheet1("CreateUser", 1, 15);
		String branchName=eUtil.readDataFromExcelSheet("CreateUser", 1, 16);
		String ifscCode=eUtil.readDataFromExcelSheet("CreateUser", 1, 17);
		String userType=eUtil.readDataFromExcelSheet("CreateUser", 1, 18);
		String businessName=eUtil.readDataFromExcelSheet("CreateUser", 1, 19)+jUtil.getRandomNumber();
		String lcoCode=eUtil.readDataFromExcelSheet("CreateUser", 1, 20)+jUtil.getRandomNumber();
		CreateUsersPage cusp=new CreateUsersPage(driver);
		cusp.createLCO(driver, FirstName, LastName, IDType, IDNumber, country, state, district, Taluka, city, pincode, emailID, mobile, billingAddress, bankName, accountNumber, branchName, ifscCode, userType, businessName, lcoCode);
		
	}

}
