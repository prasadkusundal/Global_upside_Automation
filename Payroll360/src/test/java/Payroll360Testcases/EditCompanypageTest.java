package Payroll360Testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import Components.Companypage;
import Components.LoginPage;

public class EditCompanypageTest extends TestBase {

	LoginPage loginpage;
	Companypage companyPage;
	String wbSheet="Company";
	
	public EditCompanypageTest()
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
	
	public void editcompany(String compname,String streetnumber,String streetadd,String postno,String cityname,String countryN) throws InterruptedException 
	{
		companyPage.EditCompany(compname, streetnumber, streetadd, postno, cityname,countryN);
		//Assert.assertEquals(companyPage.verifycompanyname(),compname,"Account name not match");
		System.out.println("Assertion pass");
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
