package EzyBill.STB;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.BulkReplacementPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;

public class BulkSTBReplacementTest extends BaseClass{

	@Test
	public void test() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getBulkStbReplacement().click();
		BulkReplacementPage brp=new BulkReplacementPage(driver);
		String dataInFile="STB Serial Number";
		String replacementReason="Bulk Defective(Unassigned box)";
		String uploadFilePath="";
		if(replacementReason.equals("Bulk Defective"))
		{
			CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\bulkReplacement.csv"));
			
			String set1[]= {"old_stb","new_stb","amount","receipt_number"};
			String set2[]= {"12345678901","123456789012345","500","1234"};
			
			write.writeNext(set1);
			write.writeNext(set2);
			
			write.flush();
			uploadFilePath="C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\bulkReplacement.csv";
		}
		else if(replacementReason.equals("Bulk Defective(Unassigned box)"))
		{
			CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\bulkReplacement_Unassigned.csv"));
			
			String set1[]= {"stb","amount","receipt_number"};
			String set2[]= {"12345678901","500","1234"};
			
			write.writeNext(set1);
			write.writeNext(set2);
			
			uploadFilePath="C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\bulkReplacement_Unassigned.csv";
		}
		
		String remarks="NA";
		
		brp.bulkReplacement(dataInFile, replacementReason, uploadFilePath, remarks);
	}
}
