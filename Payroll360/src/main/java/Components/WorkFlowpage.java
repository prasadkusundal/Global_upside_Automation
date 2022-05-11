package Components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class WorkFlowpage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Paygroups')]")
	WebElement paygroupsObj;
	
	@FindBy(xpath= "(//a[@title='VyomsAutomationedge'])[1]")
	WebElement paygroup;
	
	@FindBy(xpath="(//li[@class='slds-tabs_default__item'])[6]")
	//@FindBy(xpath="(//li[@title='Workflow Setup']")
	WebElement workflowobj; 
	
	
	
	@FindBy(xpath="//span[@title='Secondary Review']")
	WebElement secondaryreview; 
	
	@FindBy(xpath= "(//button[@class='slds-button slds-button_icon slds-button_icon-container'])[1]")
	WebElement selectbtn;
	
	@FindBy(xpath= "(//button[@class='slds-button slds-button_icon slds-button_icon-container'])[2]")
	WebElement deselectbtn;
	
	@FindBy(xpath= "(//button[@class='slds-button slds-button_icon slds-button_icon-container'])[3]")
	WebElement upbtn;
	
	@FindBy(xpath= "(//button[@class='slds-button slds-button_icon slds-button_icon-container'])[4]")
	WebElement downbtn;
	
	@FindBy(xpath="//button[@class='slds-button slds-button_brand']")
	WebElement savebtn; 
	
	@FindBy(linkText = "here")
	WebElement clickhere;
	
	@FindBy(xpath= "//lightning-icon[@class='slds-icon_container_circle slds-icon-action-edit slds-icon_container']")
	WebElement edit;
	
	@FindBy(xpath= "(//span[@class='slds-checkbox_faux'])[19]")
	WebElement managerrole;
	
	@FindBy(xpath= "(//span[@class='slds-checkbox_faux'])[20]")
	WebElement PProle;
	
	@FindBy(xpath= "(//span[@class='slds-checkbox_faux'])[22]")
	WebElement TLrole;
	
	@FindBy(xpath= "(//a[@class='slds-nav-vertical__action'])[2]")
	WebElement clientapproval;
	
	@FindBy(xpath= "(//a[@class='slds-nav-vertical__action'])[3]")
	WebElement payrollfunding;
	
	@FindBy(xpath= "(//span[@class='slds-accordion__summary-content'])[2]")
	WebElement collaps;
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_brand'])[2]")
	WebElement savebtn2; 
	
	 public WorkFlowpage() {
			PageFactory.initElements(driver, this);
		}
	
	 public void createNewworkflow() throws InterruptedException
	 {
			Thread.sleep(2000);
		    paygroup.click();
			Thread.sleep(15000);
			workflowobj.click();
			Thread.sleep(10000);
//			payrollfunding.click();
//			Thread.sleep(5000);
			secondaryreview.click();
			Thread.sleep(5000);
			selectbtn.click();
			Thread.sleep(5000);
			savebtn.click();
			Thread.sleep(5000);
			collaps.click();
			Thread.sleep(10000);
			edit.click();
			Thread.sleep(5000);
			managerrole.click();
			Thread.sleep(5000);
			PProle.click();
			Thread.sleep(5000);
			TLrole.click();
			Thread.sleep(5000);
			savebtn2.click();
			Thread.sleep(5000);
	 }
	 
	 public void clickonPaygroups() {
			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
			js.executeScript("arguments[0].click();",paygroupsObj);
			
		}
	 
	 
	 
	 
}
