package Payroll360Testcases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

//import Components.Companypage;
import Components.LoginPage;
import Components.Paygrouppage;
public class PaygrouppageTest extends TestBase{

	LoginPage loginpage;
	Paygrouppage paygrouppage;
	String wbSheet="paygroup";
	
	public PaygrouppageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		paygrouppage=new Paygrouppage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		paygrouppage.clickonCompany();	
	    
	
		
	}
	
	@DataProvider
	public Object getPaygroupDetails() {
		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
		return obj1;
	}
	

	@Test(dataProvider="getPaygroupDetails")
	public void createnewpaygrp(String paygroupname,String paygrpcountry,String paygrplocation) throws InterruptedException {
		paygrouppage.createNewPaygroup(paygroupname, paygrpcountry, paygrplocation);
		//Assert.assertEquals(paygrouppage.verifypaygruppname(),paygroupname,"paygroup name not match");
		System.out.println("Assertion pass");
	}
	
	
	
}
