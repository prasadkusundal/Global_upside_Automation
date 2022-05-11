package Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class Companyuserpage extends TestBase  {

	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companyObj;
 
	@FindBy(xpath= "(//a[@title='VyomsAutomationedge'])[1]")
	WebElement company;
	
	@FindBy(xpath="(//a[@class='slds-tabs_default__link'])[2]")
	WebElement userObj;
	
	@FindBy(xpath="(//button[@class=\"slds-button slds-button_neutral\"])[3]")
	WebElement newuser;
	
	@FindBy(xpath="(//input[@class=\"slds-combobox__input slds-input\"])[1]")
	WebElement username;
	
	 @FindBy(xpath = "//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")
		WebElement userrole;
	
	 @FindBy(xpath="(//span[@class=\"slds-checkbox_faux\"])[6]")
		WebElement grantaccess1;
		
	 @FindBy(xpath="(//span[@class=\"slds-checkbox_faux\"])[7]")
		WebElement viewdataaccess1;
	
	 @FindBy(xpath="(//span[@class=\"slds-checkbox_faux\"])[8]")
		WebElement grantaccess2;
	 
	 @FindBy(xpath="(//span[@class=\"slds-checkbox_faux\"])[9]")
		WebElement viewdataaccess2;
	 
	 @FindBy(xpath="//button[@class=\'slds-button slds-button_brand\']")
	 WebElement savebtn;
	 
	 
	 // company user edit 
	 
	 
	 @FindBy(xpath="(//span[@class=\"slds-grid slds-grid_align-spread\"])[6]")
		WebElement editbtn;
	 
	 @FindBy(xpath="//a[@title='Edit']")
	 WebElement edit;
	 
	 
	 
	 
	 
	  
	 public Companyuserpage() {
			PageFactory.initElements(driver, this);
		}
	
	 public void createNewUser(String companyusername,String companyuserrole) throws InterruptedException 
	 {
		 Thread.sleep(5000);
		 company.click();
		 Thread.sleep(10000);
		 userObj.click();
		 Thread.sleep(15000);
		 newuser.click();
		 Thread.sleep(15000);
//		 username.sendKeys(companyusername);
//	     Thread.sleep(6000);
//	     username.sendKeys(Keys.DOWN );
//		Thread.sleep(6000);
//		 username.sendKeys(Keys.ARROW_DOWN);
//			Thread.sleep(6000);
//		username.sendKeys(Keys.ENTER);
//		Thread.sleep(6000);
		 username.click();
		 Thread.sleep(6000);
		 username.sendKeys(Keys.ENTER);
		 Thread.sleep(6000);
		userrole.click();
		 Thread.sleep(6000);
		userrole.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 userrole.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 userrole.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 userrole.sendKeys(Keys.ENTER);
		 //Thread.sleep(6000);
		// List<WebElement> counList=driver.findElements(By.xpath("//lightning-base-combobox-role[@class=\"slds-combobox__form-element slds-input-has-icon slds-input-has-icon_right\"]/span[@class=\"slds-truncate\"]/span"));
//		List<WebElement> counList=driver.findElements(By.xpath("//lightning-base-combobox-item[@class=\"slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain\"]/span[2]"));
//			for(WebElement ele :counList)
//			{
//				String coun=ele.getText();
//				if(coun.equalsIgnoreCase(companyuserrole))
//				{
//					ele.click();
//					Thread.sleep(2000);
//					break;
//				}
//			}
			Thread.sleep(5000);
			grantaccess1.click();
			Thread.sleep(5000);
			viewdataaccess1.click();
			Thread.sleep(5000);
			grantaccess2.click();
			Thread.sleep(5000);
			viewdataaccess2.click();
			Thread.sleep(5000);
			savebtn.click();
			Thread.sleep(10000);
		
		
		
	 }
	 
	 public void createEditUser(String companyusername,String companyuserrole) throws InterruptedException 
	 {
		 Thread.sleep(5000);
		 company.click();
		 Thread.sleep(10000);
		 userObj.click();
		 Thread.sleep(15000);
		 editbtn.click();
		 Thread.sleep(10000);
		 edit.click();
		 Thread.sleep(15000);
		 userrole.click();
		 Thread.sleep(6000);
		userrole.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 userrole.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 userrole.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 savebtn.click();
		Thread.sleep(10000);
		 
	 }
	 
	 
	 
	 
	 public void clickonCompany() {
			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
			js.executeScript("arguments[0].click();",companyObj);
			
		}
	 
}
