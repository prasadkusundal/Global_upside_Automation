package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import com.sca.utilities.ExcelUtilities;

import Components.CalendersetupActivitypage;
import Components.LoginPage;

public class CalendersetupeventTest extends TestBase {

	LoginPage loginpage;
	CalendersetupActivitypage calendersetupactivitypage;
	//String wbSheet="CalenderSetup";
	
	public CalendersetupeventTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		calendersetupactivitypage=new CalendersetupActivitypage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		calendersetupactivitypage.clickonPaygroups();	
	    
	}
	
//	@DataProvider
//	public Object getCalendersetupDetails() {
//		Object[][] obj1=ExcelUtilities.getExcel(wbSheet);
//		return obj1;
//	}
	
	@Test //(dataProvider="getCalendersetupDetails")
//	public void createnewcalendersetup(String PayPeriodName,String PayDate,String PPDueDate,String CADueDate,String PFDueDate) throws InterruptedException 
//	{
//		calendersetupactivitypage.createNewCalendersetup(PayPeriodName, PayDate, PPDueDate, CADueDate, PFDueDate);
//	
//	
//	}
	public void createnewcalendersetup() throws InterruptedException {
		
		calendersetupactivitypage.createNewCalendersetup();
		
		
	}
	
	
}
