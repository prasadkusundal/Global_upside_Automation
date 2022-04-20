package Payroll360Testcases;
import org.testng.Assert;
import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Components.Companypage;
import Components.LoginPage;

public class CompanypageTest extends TestBase {

	LoginPage loginpage;
	Companypage companyPage;
	String wbSheet="Company";
	
	public CompanypageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		companyPage=new Companypage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		companyPage.clickonCompany();	
	    
		
		
	}
	
	@DataProvider
	public Object getCompanyDetails() {
		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
		return obj1;
	}
	
	@Test(dataProvider="getCompanyDetails")
	public void createnewcomp(String compname,String streetnumber,String streetadd,String postno,String cityname,String countryN) throws InterruptedException {
		companyPage.createNewCompany(compname, streetnumber, streetadd, postno, cityname,countryN);
		Assert.assertEquals(companyPage.verifycompanyname(),compname,"Account name not match");
		System.out.println("Assertion pass");
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
//	@Test
//	public void createnewcomp() throws InterruptedException {
//		createnewcompany.createNewCompany(p.getProperty("companyname"), p.getProperty("streetnumber"), p.getProperty("streetadd"), p.getProperty("postno"), p.getProperty("cityname"));
//		Thread.sleep(9000);
//		Assert.assertEquals(createnewcompany.verifycompanyname(),"VyomsAutomationedge","companycreation fail");
//	}
//	
	
}
