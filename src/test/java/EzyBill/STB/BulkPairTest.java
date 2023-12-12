package EzyBill.STB;

import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.BulkPairUnpairPage;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.StbPage;

public class BulkPairTest extends BaseClass
{
	@Test
	public void pair() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getSTB().click();
		StbPage sp=new StbPage(driver);
		sp.getBulkPairUnpair().click();
		BulkPairUnpairPage bpup=new BulkPairUnpairPage(driver);
		
		CSVWriter write=new CSVWriter(new FileWriter("C:\\Users\\user\\Desktop\\Automation Test\\PairSTB.csv"));
		
		String set1[]= {"*STB Serial","*Mac/VC/Chip ID"};
		String set2[]= {"'12345678901","'12345678901"};
		
		write.writeNext(set1);
		write.writeNext(set2);
		
		write.flush();
		
		String serverType="CONAX";
		String uploadFile="C:\\\\Users\\\\user\\\\Desktop\\\\Automation Test\\\\PairSTB.csv";
		
		bpup.pair(serverType, uploadFile);
		
	}
}
