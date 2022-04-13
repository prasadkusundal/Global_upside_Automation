package Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;
import Components.HomePage;

public class LoginPage extends TestBase{
	@FindBy(xpath="//input[@id='username']")
	WebElement uname;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement loginBtn; 

	@FindBy(xpath="(//span[@class='slds-truncate'])[2]")
	WebElement Homeverify;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pass) {
		uname.sendKeys(un);
		password.sendKeys(pass);
		loginBtn.click();
		return new HomePage();
	}
	
	public String loginverify() {
		return Homeverify.getText();
	}
	
	public String verifyLogin() {
		return driver.getTitle();
	}
}
