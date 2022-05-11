package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;

import Components.LoginPage;
import Components.Paygroupactivitypage;

public class PaygroupstagesTest extends TestBase  {

	LoginPage loginpage;
	Paygroupactivitypage paygroupactiviypage;
	
	public PaygroupstagesTest()
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
	
	@Test
	public void createexecutionsequence() throws InterruptedException {
		paygroupactiviypage.createExecuionsequence();
	

	}
	
	
	
}
