package EzyBill.STB;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.BulkReplacementPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;

public class BulkSTBSurrenderTest extends BaseClass{
 
	@Test
	public void test() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getBulkStbReplacement().click();
		BulkReplacementPage brp=new BulkReplacementPage(driver);
		String dataInFile="STB Serial Number";
		String stbStatus="All";
		
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\bulkSurrender.csv"));
		
		String set1[]= {"STB"};
		String set2[]= {"'00548141454"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		write.flush();
		String uploadFilePath="C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\bulkSurrender.csv";
		String remarks="NA";
		
		brp.bulkSurrender(dataInFile, stbStatus, uploadFilePath, remarks);
	}
}
