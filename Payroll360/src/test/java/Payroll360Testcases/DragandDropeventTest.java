package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;

import Components.CalendersetupActivitypage;
import Components.LoginPage;

public class DragandDropeventTest extends TestBase {

	
	LoginPage loginpage;
	CalendersetupActivitypage calendersetupactivitypage;
	
	public DragandDropeventTest()
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
		Thread.sleep(10000);
		calendersetupactivitypage.clickonPaygroups();	
	    
	}
	@Test 
    public void createnewdragevent() throws InterruptedException {
		
		calendersetupactivitypage.createNewDragdropevent();
		
		
	}
}

