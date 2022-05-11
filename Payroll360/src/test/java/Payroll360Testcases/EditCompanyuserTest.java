package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import Components.Companyuserpage;
import Components.LoginPage;

public class EditCompanyuserTest extends TestBase {

	LoginPage loginpage;
	Companyuserpage companyuserpage;
	String wbSheet="CompanyUser";
	
	public EditCompanyuserTest()
	{
		super();
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		companyuserpage=new Companyuserpage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		companyuserpage.clickonCompany();	
	
	
	
	}
	
	@DataProvider
	public Object getCompanyUserDetails() {
		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
		return obj1;
	}
	

	@Test(dataProvider="getCompanyUserDetails")
	public void createnewpaygrp(String companyusername,String companyuserrole) throws InterruptedException {
		companyuserpage.createEditUser(companyusername, companyuserrole);
	
	}
	
	
}
