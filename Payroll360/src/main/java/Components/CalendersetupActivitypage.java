package Components;

//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.sca.commosActions.TestBase;

public class CalendersetupActivitypage extends TestBase {
	
	//WebDriverWait wait = new WebDriverWait(driver, 40);
	 Actions actions = new Actions(driver);

	@FindBy(xpath="//span[contains(text(),'Paygroups')]")
	WebElement paygroupsObj;
 
	@FindBy(xpath= "(//a[@title='VyomsAutomationedge'])[1]")
	WebElement paygroup;
	
	@FindBy(xpath="(//li[@class='slds-tabs_default__item'])[5]")
	WebElement calendersetupObj; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_neutral'])[4]")
	WebElement createbtn; 
	
	@FindBy(xpath="//input[@name='PayPeriodName']")
	WebElement payperiodname; 
	
	@FindBy(xpath="//input[@name='PayDate']")
	WebElement paydate; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[5]")
	WebElement PPduedate; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[8]")
	WebElement CAduedate; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[11]")
	WebElement PFduedate; 
	
	@FindBy(xpath="//button[@class='slds-button slds-button_brand']")
	WebElement savebtn; 
	
	// Drag and Drop event Activity
	
	
	@FindBy(xpath="(//div[@class='fc-content'])[2]")
	WebElement drag; 
	
	@FindBy(xpath="(//div[@class='fc-content'])[3]")
	WebElement drop; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[5]")
	WebElement reason; 
	
	@FindBy(xpath="//button[@class='slds-button slds-button_brand']")
	WebElement update; 
	
	//Switch to list view and edit calender 
	
	@FindBy(xpath="(//div[@class='slds-checkbox_faux'])[1]")
	WebElement switchbtn; 
	
	@FindBy(xpath="(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[2]")
	WebElement editbtn; 
	
	@FindBy(xpath="//a[@title='Edit']")
	WebElement edit; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[4]")
	WebElement editpaydate; 
	
	@FindBy(xpath="(//input[@class='slds-input'])[5]")
	WebElement reasone; 
	
	//calender setup events view
	
	@FindBy(xpath="//button[@class='fc-basicWeek-button fc-button fc-state-default']")
	WebElement weekly; 
	
	@FindBy(xpath="//button[@class='fc-basicDay-button fc-button fc-state-default']")
	WebElement day; 
	
	@FindBy(xpath="//button[@class='fc-listMonth-button fc-button fc-state-default fc-corner-right']")
	WebElement list; 
	
	 public CalendersetupActivitypage() {
			PageFactory.initElements(driver, this);
		}
	
	 
	 
	 public void createNewCalendersetup() throws InterruptedException
	 {
			Thread.sleep(2000);
		    paygroup.click();
			Thread.sleep(10000);
			calendersetupObj.click();
			Thread.sleep(10000);
			//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create")));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='slds-button slds-button_neutral'])[4]")));
			createbtn.click();
			Thread.sleep(10000);
			payperiodname.click();
			Thread.sleep(2000);
			payperiodname.sendKeys("May2022");
			Thread.sleep(5000);
			paydate.click();
			Thread.sleep(2000);
			paydate.sendKeys("May 31, 2022");
			Thread.sleep(5000);
//			PPduedate.click();
//			Thread.sleep(2000);
			PPduedate.sendKeys("May 12, 2022");
			Thread.sleep(5000);
//			CAduedate.click();
//			Thread.sleep(2000);
			CAduedate.sendKeys("May 14, 2022");
			Thread.sleep(5000);
//			PFduedate.click();
//			Thread.sleep(2000);
			PFduedate.sendKeys("May 16, 2022");
			Thread.sleep(5000);
			savebtn.click();
			Thread.sleep(10000);		
			
	 }
	 
	 public void createNewDragdropevent() throws InterruptedException
	 {
			Thread.sleep(5000);
		    paygroup.click();
			Thread.sleep(10000);
			calendersetupObj.click();
			Thread.sleep(10000);
			//Perform drag and drop
			actions.dragAndDrop(drag, drop).build().perform();	
			Thread.sleep(10000);
			reason.sendKeys("Automation testing");
			Thread.sleep(5000);
			update.click();
			Thread.sleep(5000);
			
			
	 } 
	 
	 
	 public void createNewEditevents() throws InterruptedException
	 {
			Thread.sleep(5000);
		    paygroup.click();
			Thread.sleep(10000);
			calendersetupObj.click();
			Thread.sleep(10000);
			switchbtn.click();
			Thread.sleep(5000);
			editbtn.click();	
			Thread.sleep(5000);
			edit.click();
			Thread.sleep(10000);
			editpaydate.clear();
			Thread.sleep(5000);
			editpaydate.sendKeys("May 30, 2022");
			Thread.sleep(5000);
			reasone.sendKeys("Testing purpose");
			Thread.sleep(5000);
			savebtn.click();
			Thread.sleep(10000);	
	 }
	 
	 public void createNewListview() throws InterruptedException
	 {
			Thread.sleep(5000);
		    paygroup.click();
			Thread.sleep(10000);
			calendersetupObj.click();
			Thread.sleep(10000);
			weekly.click();
			Thread.sleep(10000);
			day.click();
			Thread.sleep(10000);
			list.click();
			Thread.sleep(10000);
	 }
	 
	
	 public void clickonPaygroups() {
			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
			js.executeScript("arguments[0].click();",paygroupsObj);
			
		}
	
	
	
}
