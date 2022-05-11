package Components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class Paygroupactivitypage extends TestBase{

	//paygroup Activation
	
	@FindBy(xpath="//span[contains(text(),'Paygroups')]")
	WebElement paygroupsObj;
 
	@FindBy(xpath= "(//a[@title='VyomsAutomationedge'])[1]")
	WebElement paygroup;
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_neutral'])[3]")
	WebElement activatebtn; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_neutral'])[3]")
	WebElement deactivatebtn; 
	
	@FindBy(xpath="(//button[@class=\"slds-button slds-button_brand\"])[1]")
	WebElement yesbtn;
	
	//Paygroup stage execution sequence
	
	@FindBy(xpath="(//a[@class='slds-tabs_default__link'])[5]")
	WebElement stagesObj; 
	
	@FindBy(xpath="(//span[@class='slds-checkbox_faux'])[3]")
	WebElement payrollpreview; 
	
	@FindBy(xpath="(//span[@class='slds-checkbox_faux'])[4]")
	WebElement clientapproval; 
	
	@FindBy(xpath="(//span[@class='slds-checkbox_faux'])[5]")
	WebElement payrollfunding; 
	

	@FindBy(xpath="(//button[@class='slds-button slds-button_icon slds-button_icon-bare'])[5]")
	WebElement editsequencePP; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_icon slds-button_icon-bare'])[6]")
	WebElement editsequenceCA; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_icon slds-button_icon-bare'])[7]")
	WebElement editsequencePF; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[3]")
	WebElement executionsqPP; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[5]")
	WebElement executionsqCA; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[7]")
	WebElement executionsqPF; 
	
	@FindBy(xpath="//button[@class='slds-button slds-button_brand']")
	WebElement savebtn; 
	
	//Add and verify paygroup users
	
	@FindBy(xpath="(//a[@class='slds-tabs_default__link'])[2]")
	WebElement userObj; 
	
//	@FindBy(xpath="//*[@id=\"table-240\"]/tbody/tr[1]/th[4]/div")
//	WebElement managerrole; 
	
	@FindBy(linkText = "GU PY360 Manager")
	WebElement managerrole;
	
	
	@FindBy(xpath="//*[@id=\"table-240\"]/tbody/tr[2]/th[4]/div")
	WebElement processorrole; 
	
	@FindBy(xpath="//*[@id=\"table-240\"]/tbody/tr[3]/th[4]/div")
	WebElement teamleadrole; 
	
	@FindBy(xpath="//div[@class='c-container slds-form-element__label slds-m-bottom_none']")
	WebElement newuser; 
	
	@FindBy(xpath="(//div[@class='slds-form-element__control'])[16]")
	WebElement userselection; 
	
	@FindBy(xpath="(//span[@class='slds-checkbox_faux'])[9]")
	WebElement viewempdata; 
	
	//Employee creation on paygroup level
	
	@FindBy(xpath="(//a[@class='slds-tabs_default__link'])[8]")
	WebElement employeeObj; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_neutral'])[6]")
	WebElement newemployee; 
	
	@FindBy(xpath="//input[@name='VLSF_Employee_Name__c']")
	WebElement employeename; 
	
	@FindBy(xpath="//input[@name='VLSF_Employee_ID__c']")
	WebElement employeeid; 
	
	@FindBy(xpath="(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")
	WebElement empstatus; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_brand'])[3]")
	WebElement saveemp; 
	
	
	 public Paygroupactivitypage() {
			PageFactory.initElements(driver, this);
		}

	 public void createActivatepaygroup() throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 paygroup.click();
		 Thread.sleep(10000);
		 activatebtn.click();
		 Thread.sleep(10000);
		 yesbtn.click();
		 Thread.sleep(10000);
		 System.out.println("Paygroup Activated successfully");
		 
	 }
	
	 public void createDeactivatepaygroup() throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 paygroup.click();
		 Thread.sleep(10000);
		 deactivatebtn.click();
		 Thread.sleep(10000);
		 yesbtn.click();
		 Thread.sleep(10000);
		 System.out.println("Paygroup deActivated successfully");
		 
	 }
	 
	 public void createExecuionsequence() throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 paygroup.click();
		 Thread.sleep(10000);
		 stagesObj.click();
		 Thread.sleep(10000);
		 payrollpreview.click();
		 Thread.sleep(5000);
		 clientapproval.click();
		 Thread.sleep(5000);
		 payrollfunding.click();
		 Thread.sleep(5000);
		 
		 editsequencePP.click();
		 Thread.sleep(5000);
		 editsequenceCA.click();
		 Thread.sleep(5000);
		 editsequencePF.click();
		 Thread.sleep(5000);
		 
		 executionsqPP.sendKeys("1");
		 Thread.sleep(5000);
		 executionsqCA.sendKeys("2");
		 Thread.sleep(5000);
		 executionsqPF.sendKeys("3");
		 Thread.sleep(5000);
		 savebtn.click();
		 Thread.sleep(10000);
	
		 System.out.println("paygroup stages updated successfully");
		 
	 }
	 public void createRolesaccess() throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 paygroup.click();
		 Thread.sleep(10000);
		 userObj.click();
		 Thread.sleep(10000);		 
	 
	 }
	 
	 public void createNewemployee(String EmployeeName,String EmployeeID) throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 paygroup.click();
		 Thread.sleep(10000);
		 employeeObj.click();
		 Thread.sleep(10000);		 
		 newemployee.click();
		 Thread.sleep(10000);
		 employeename.sendKeys(EmployeeName);
		 Thread.sleep(5000);
		 employeeid.sendKeys(EmployeeID);
		 Thread.sleep(5000);
		 empstatus.click();
		 Thread.sleep(2000);
		 empstatus.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(2000);
		 empstatus.sendKeys(Keys.ARROW_DOWN);
		 empstatus.sendKeys(Keys.ENTER);
		 Thread.sleep(5000);
		 saveemp.click();
		 Thread.sleep(10000);
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public String verifyrolesaccess() {
			return managerrole.getText();
				
		}
	 
	 
	 public void clickonPaygroups() {
			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
			js.executeScript("arguments[0].click();",paygroupsObj);
			
		}
	
	
}
