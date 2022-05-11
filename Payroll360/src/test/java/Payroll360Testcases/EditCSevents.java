package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;

import Components.CalendersetupActivitypage;
import Components.LoginPage;

public class EditCSevents extends TestBase {

	
	LoginPage loginpage;
	CalendersetupActivitypage calendersetupactivitypage;
	
	public EditCSevents()
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
	@Test
	
  public void createneweditevents() throws InterruptedException {
		
		calendersetupactivitypage.createNewEditevents();
		
		
	}
	
	
	
	
	
}
