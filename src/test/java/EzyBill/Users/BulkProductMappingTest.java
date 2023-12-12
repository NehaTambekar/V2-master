package EzyBill.Users;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.BulkProductMappingUnmappingPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.UsersPage;

public class BulkProductMappingTest extends BaseClass{

	@Test
	public void test() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getUsers().click();
		UsersPage up=new UsersPage(driver);
		up.getBulkProductMapping().click();
		BulkProductMappingUnmappingPage bpmup=new BulkProductMappingUnmappingPage(driver);
		
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\bulkProductMapping.csv"));
		
		String set1[]= {"*SlNo","*User Name","*Product Name","*Server","*Amount Type(1-Percentage,2-Amount)","*Percentage","Distributor Percentage","Subdistributor Percentage","*Start Date","*End Date","Remarks"};
		String set2[]= {"1","K10H022","1SPORTS","CONAX","1","10","10","10","09-12-2023","09-12-2024"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		write.flush();
		
		String uploadFile="C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\bulkProductMapping.csv";
		
		bpmup.bulkProductMapping(uploadFile);
	}
}
