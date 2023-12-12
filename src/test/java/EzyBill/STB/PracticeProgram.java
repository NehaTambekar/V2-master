package EzyBill.STB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



import EzyBill.GenericUtilities.BaseClass;
import EzyBill.GenericUtilities.ExcelFileUtility;
import EzyBill.ObjectRepository.HomePage;


public class PracticeProgram extends BaseClass
{
	
	@Test
	public void main() throws Throwable
	{
		/*HomePage hp=new HomePage(driver);
		hp.getCustomerBillingShare().click();
		
		 String url = "jdbc:mysql://192.168.1.144:3306/ezybill_kodada";
	        String username = "root";
	        String password = "vemsoft123";

	        // Connection and statement objects
	        Connection conn = null;
	        Statement stmt = null;

	        try {
	            // Step 1: Register the JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Step 2: Open a connection
	            conn = DriverManager.getConnection(url, username, password);

	            // Step 3: Create a statement
	            stmt = conn.createStatement();

	            // Step 4: Perform database operations
	            // For example, executing a query
	            String sqlQuery = "select * from employee where employee_id=1255;";
	            ResultSet resultSet = stmt.executeQuery(sqlQuery);

	            // Process the query results
	            while (resultSet.next()) {
	                // Perform operations with the data
	                String column1Value = resultSet.getString("first_name");
	               // int column2Value = resultSet.getInt("employee_id");
	                // ... and so on
	                System.out.println("+++++++++++++++++++ " + column1Value);
	            }

	            // Step 5: Close the ResultSet, Statement, and Connection
	            resultSet.close();
	            stmt.close();
	            conn.close();
	        } catch (SQLException se) {
	            // Handle errors for JDBC
	            se.printStackTrace();
	        } catch (Exception e) {
	            // Handle errors for Class.forName
	            e.printStackTrace();
	        } finally {
	            // Close resources in the reverse order of their creation to avoid resource leaks
	            try {
	                if (stmt != null)
	                    stmt.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	            try {
	                if (conn != null)
	                    conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }*/
		/*ExcelFileUtility eUtil=new ExcelFileUtility();
		String sample = eUtil.readDataFromExcelSheet("CreateSTB", 1, 4);
		
		System.out.println(sample);*/
		
		
	}
}
