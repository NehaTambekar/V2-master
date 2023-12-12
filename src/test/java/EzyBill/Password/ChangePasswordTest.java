package EzyBill.Password;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import EzyBill.GenericUtilities.BaseClass;
import EzyBill.ObjectRepository.HomePage;
import EzyBill.ObjectRepository.ListUsersPage;
import EzyBill.ObjectRepository.UsersPage;

public class ChangePasswordTest extends BaseClass {
	
	@Test
	public void lcoPassword()
	{
		HomePage hp=new HomePage(driver);
		hp.getUsers().click();
		UsersPage up=new UsersPage(driver);
		up.getListUsers().click();
		ListUsersPage lup=new ListUsersPage(driver);
		waitForPageLoad(driver);
		lup.selectUserType(" BUSINESS PARTNER (LCO)", "DIGITAL CABLE NET WORK (K10H022)");
		waitForPageLoad(driver);
		lup.getOkBtn().click();
		lup.getNewPasswordEdt().sendKeys("1234");
		lup.getConfirmPasswordEdt().sendKeys("1234");
		lup.getUpdateBtn().click();
		driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	}
	
	@Test
	public void distributorPassword()
	{
		HomePage hp=new HomePage(driver);
		hp.getUsers().click();
		UsersPage up=new UsersPage(driver);
		up.getListUsers().click();
		ListUsersPage lup=new ListUsersPage(driver);
		waitForPageLoad(driver);
		lup.selectUserType(" DISTRIBUTOR", "ABC (K7575757575)");
		waitForPageLoad(driver);
		lup.getOkBtn().click();
		lup.getNewPasswordEdt().sendKeys("1234");
		lup.getConfirmPasswordEdt().sendKeys("1234");
		lup.getUpdateBtn().click();
		driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	}
	
	@Test
	public void subDistributorPassword()
	{
		HomePage hp=new HomePage(driver);
		hp.getUsers().click();
		UsersPage up=new UsersPage(driver);
		up.getListUsers().click();
		ListUsersPage lup=new ListUsersPage(driver);
		waitForPageLoad(driver);
		lup.selectUserType(" SUBDISTRIBUTOR", "ABC (K75757575757575757575)");
		waitForPageLoad(driver);
		lup.getOkBtn().click();
		lup.getNewPasswordEdt().sendKeys("1234");
		lup.getConfirmPasswordEdt().sendKeys("1234");
		lup.getUpdateBtn().click();
		driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	}
	
	@Test
	public void adminPassword()
	{
		HomePage hp=new HomePage(driver);
		hp.getUsers().click();
		UsersPage up=new UsersPage(driver);
		up.getListUsers().click();
		ListUsersPage lup=new ListUsersPage(driver);
		waitForPageLoad(driver);
		lup.selectUserType(" ADMIN");
		waitForPageLoad(driver);
		lup.getOkBtn().click();
		lup.getNewPasswordEdt().sendKeys("1234");
		lup.getConfirmPasswordEdt().sendKeys("1234");
		//lup.getUpdateBtn().click();
		//driver.findElement(By.xpath("(//button[text()='OK'])[2]")).click();
	}
}
