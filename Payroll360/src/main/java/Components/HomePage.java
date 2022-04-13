package Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class HomePage extends TestBase{

	//@FindBy(xpath="//span[contains(text(),'Campaigns')]/parent::a/parent::one-app-nav-bar-item-root")
	@FindBy(xpath="(//span[@class='slds-truncate'])[3]")
	WebElement Companiesobj;
	
	//@FindBy(xpath="//span[contains(text(),'Leads')]/parent::a/parent::one-app-nav-bar-item-root")
	@FindBy(xpath="(//span[@class='slds-truncate'])[4]")
	WebElement Paygroupsobj;
	
   //@FindBy(xpath="//span[contains(text(),'App Launcher')]")
	@FindBy(xpath="(//span[@class='slds-icon-waffle'])[2]")
	WebElement appLauncher;
	
	@FindBy(xpath="//input[@placeholder='Search apps and items...']")
	WebElement search;
	
	@FindBy(xpath="(//div[@class=\"al-menu-dropdown-list\"])[2]/one-app-launcher-menu-item/a")
	WebElement cam;
	
	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

}
