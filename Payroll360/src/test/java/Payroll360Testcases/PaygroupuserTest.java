package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;

import Components.LoginPage;
import Components.Paygroupactivitypage;

public class PaygroupuserTest extends TestBase {

	
	LoginPage loginpage;
	Paygroupactivitypage paygroupactiviypage;
	
	public PaygroupuserTest()
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
	public void createroleaccess() throws InterruptedException {
		paygroupactiviypage.createRolesaccess();
		String Role= "GU PY360 Manager";
		Assert.assertEquals(paygroupactiviypage.verifyrolesaccess(),Role,"manager Role is mandatory for paygroup Activation");
		System.out.println("Assertion pass");

	}
	
	
}