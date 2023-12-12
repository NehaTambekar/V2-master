package EzyBill.Dashboard;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.DashboardPage;

public class DashBoardTest extends BaseClass{

	@Test
	public void test()
	{
		DashboardPage dp=new DashboardPage(driver);
		String actual=dp.getActiveCustomers().getText();
		String expected="Active Customers";
		assertEquals(actual, expected);
		
		String actual1=dp.getInactiveCustomers().getText();
		String expected1="Inactive Customers";
		assertEquals(actual1, expected1);
		
		String actual2=dp.getCurrentMonthPaidCustomers().getText();
		String expected2="Current Month Paid Customers";
		assertEquals(actual2, expected2);
		
		String actual3=dp.getCurrentMonthUnpaidCustomers().getText();
		String expected3="Current Month Unpaid Customers";
		assertEquals(actual3, expected3);
	}
}
