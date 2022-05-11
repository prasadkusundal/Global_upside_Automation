package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import Components.LoginPage;
import Components.Paygroupactivitypage;

public class PaygroupemployeeTest extends TestBase {

	LoginPage loginpage;
	Paygroupactivitypage paygroupactiviypage;
	String wbSheet="Employee";
	
	public PaygroupemployeeTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		paygroupactiviypage=new Paygroupactivitypage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		paygroupactiviypage.clickonPaygroups();	
	    
	}
	
	@DataProvider
	public Object getEmployeeDetails() {
		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
		return obj1;
	}
	
	@Test(dataProvider="getEmployeeDetails")
	public void createnewemployee(String EmployeeName,String EmployeeID) throws InterruptedException
	{
		paygroupactiviypage.createNewemployee(EmployeeName, EmployeeID);
	
	
	}
	
		
	
	
}
