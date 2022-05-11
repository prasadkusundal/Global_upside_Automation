package Components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class Companystages extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companyObj;
 
	@FindBy(xpath= "(//a[@title='VyomsAutomationedge'])[1]")
	WebElement company;
	@FindBy(xpath="(//a[@class='slds-tabs_default__link'])[4]")
	WebElement stagesObj;
	 @FindBy(xpath="//lightning-button[@class='slds-m-left_x-small']")
	 WebElement linkstagesbtn;
	
	//sages Is applicable to GU expaths
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[7]")
		WebElement payrollinputcutoff;
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[9]")
		WebElement payrollpreview;
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[11]")
		WebElement clientapproval;
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[13]")
		WebElement payrollfunding;
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[15]")
		WebElement payrollfundingapproval;
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[17]")
		WebElement finalpayrollreportsavailable;
	
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[19]")
		WebElement payslipavailable;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[21]")
		WebElement compulsoryremmitance;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[23]")
		WebElement finalizingpayroll;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[25]")
		WebElement payrollfundinginovice;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[27]")
		WebElement payrollfundingsent;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[29]")
		WebElement payrollinput;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[31]")
		WebElement payrollapproval;
	 
	//sages Is applicable to GU expaths
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[8]")
		WebElement GPSpayrollinputcutoff;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[10]")
		WebElement GPSpayrollpreview;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[12]")
		WebElement GPSclientapproval;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[14]")
		WebElement GPSpayrollfunding;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[16]")
		WebElement GPSpayrollfundingapproval;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[18]")
		WebElement GPSfinalpayrollreportsavailable;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[20]")
		WebElement GPSpayslipavailable;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[22]")
		WebElement GPScompulsoryremmitance;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[24]")
		WebElement GPSfinalizingpayroll;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[26]")
		WebElement GPSpayrollfundinginovice;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[28]")
		WebElement GPSpayrollfundingsent;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[30]")
		WebElement GPSpayrollinput;
	 
	 @FindBy(xpath="(//label[@class='slds-checkbox__label'])[32]")
		WebElement GPSpayrollapproval;
	 
	 @FindBy(xpath="//button[@class=\'slds-button slds-button_brand\']")
	 WebElement savebtn;
	 
	 public Companystages() {
			PageFactory.initElements(driver, this);
		}
	 
	 public void createLinkedstages() throws InterruptedException 
	 {
		 Thread.sleep(5000);
		 company.click();
		 Thread.sleep(10000);
		 stagesObj.click();
		 Thread.sleep(10000);
		 linkstagesbtn.click();
		 Thread.sleep(10000);
	 //link stages as per your requirement for GU and GPS 
	 	 payrollinputcutoff.click();
		 Thread.sleep(5000);
		 payrollpreview.click();
		 Thread.sleep(5000);
		 clientapproval.click();
		 Thread.sleep(5000);
//		 compulsoryremmitance.click();
//		 Thread.sleep(5000);
		 savebtn.click();
		 Thread.sleep(8000);
		 System.out.println("stages linked successfully to company");
	
	 }
	  
	 
	 
	 public void clickonCompany() {
			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
			js.executeScript("arguments[0].click();",companyObj);
			
		}
	 
	 
	 
}
