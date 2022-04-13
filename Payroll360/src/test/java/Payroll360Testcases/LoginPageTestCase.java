package Payroll360Testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sca.commosActions.TestBase;
import Components.HomePage;
import Components.LoginPage;

public class LoginPageTestCase extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTestCase() {
		super();
	}
	@BeforeMethod
	public void setup() {
		launch();
		 loginPage=new LoginPage();
		 homePage=new HomePage();
	}
	
	@Test(priority=1)
	public void verifyLoginPage() {
	String page=loginPage.verifyLogin();
	Assert.assertEquals(page, "Login | Salesforce", "Login page does not matched");
	}

	@Test(priority=2)
	public void loginT() {
	homePage=loginPage.login(p.getProperty("userN"), p.getProperty("PassW"));
	// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("prasad.kusundal@cogniwize.com.payrollqa");
	// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Prasad@1994");
	}
	
	@AfterMethod
    public void tearDown() 
	{
		driver.close();
	}


}
