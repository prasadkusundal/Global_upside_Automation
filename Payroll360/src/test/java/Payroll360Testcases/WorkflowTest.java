package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;

import Components.LoginPage;
import Components.WorkFlowpage;

public class WorkflowTest extends TestBase  {

	LoginPage loginpage;
	WorkFlowpage workflowpage;
	
	public WorkflowTest()
	{
		super();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		workflowpage=new WorkFlowpage();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		workflowpage.clickonPaygroups();	
	    
	}
	
	@Test
	public void createactivatedpaygroup() throws InterruptedException {
		workflowpage.createNewworkflow();
	
	}
	
	
	
	
	
	
}
