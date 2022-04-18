package Payroll360Testcases;
import org.testng.Assert;
import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Components.Companypage;
import Components.LoginPage;

public class CompanypageTest extends TestBase {

	LoginPage loginpage;
	Companypage createnewcompany;
	String wbSheet="Company";
	
	public CompanypageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		createnewcompany=new Companypage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(5000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
	    createnewcompany.clickonCompany();	
	    
		
		
	}
	
	@DataProvider
	public Object getCompanyDetails() {
		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
		return obj1;
	}
	
	@Test(dataProvider="getCompanyDetails")
	public void createnewcomp(String compname) throws InterruptedException {
		createnewcompany.createNewCompany1(compname);
		Assert.assertEquals(createnewcompany.verifycompanyname(),compname,"Account name not match");
		System.out.println("Assertion pass");
	}
	
//	@Test
//	public void createnewcomp() throws InterruptedException {
//		createnewcompany.createNewCompany(p.getProperty("companyname"), p.getProperty("streetnumber"), p.getProperty("streetadd"), p.getProperty("postno"), p.getProperty("cityname"));
//		Thread.sleep(9000);
//		Assert.assertEquals(createnewcompany.verifycompanyname(),"VyomsAutomationedge","companycreation fail");
//	}
//	
	
}
