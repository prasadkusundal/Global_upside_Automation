package Payroll360Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
//import com.sca.pages.CampaignPage;
import Components.HomePage;
import  Components.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	//CampaignPage campaignPage;
	HomePage homePage;

	@BeforeMethod
	public void setup() throws InterruptedException {
		launch();
		 loginPage=new LoginPage();
		// campaignPage= new CampaignPage();
		 homePage=new HomePage();
		 Thread.sleep(15000);
		 homePage=loginPage.login(p.getProperty("userN"), p.getProperty("PassW"));
		 Thread.sleep(15000);
		 Assert.assertEquals(loginPage.loginverify(),"Companies","Login fail");
		
	} 
	@Test(priority=1)
	public void verify() {
		String title=homePage.verifyHomePageTitle();
		//Assert.assertEquals(title, "Home | Salesforce", "Home Page tile not matched");
	}

}
	

