package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;

import Components.Companystages;

import Components.LoginPage;

public class CompanystagesTest extends TestBase {

	LoginPage loginpage;
	Companystages companystages;
	
	public CompanystagesTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void login() throws InterruptedException {
		launch();
		loginpage=new LoginPage();
		companystages=new Companystages();
		loginpage.login(p.getProperty("userN"),p.getProperty("PassW"));
		Thread.sleep(15000);
		Assert.assertEquals(loginpage.loginverify(),"Companies","Login fail");
		Thread.sleep(5000);
		companystages.clickonCompany();	
	    
	}
	@Test
	public void createlinkedstages() throws InterruptedException {
		companystages.createLinkedstages();
	
	}
		
	
	
	
	
}
