package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import Components.Globalpaygrouppage;
import Components.LoginPage;


public class GlobalpaygroupTest extends TestBase {

	LoginPage loginpage;
	Globalpaygrouppage globalpaygrouppage;
	String wbSheet="GlobalPaygroup";
	
	public GlobalpaygroupTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		globalpaygrouppage=new Globalpaygrouppage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		globalpaygrouppage.clickonPaygroups();	
	    
	}
	
	@DataProvider
	public Object getGlobalpgrpDetails() {
		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
		return obj1;
	}
	@Test(dataProvider="getGlobalpgrpDetails")
	public void createnewcalendersetup(String paygroupname,String paygrpcountry,String paygrplocation) throws InterruptedException
	{
		globalpaygrouppage.createNewGlobalpaygroup(paygroupname, paygrpcountry, paygrplocation);
	
	
	}
	
}
