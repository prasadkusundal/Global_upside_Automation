package Components;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class Paygrouppage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companyObj;
 
	@FindBy(xpath= "(//a[@title='VyomsAutomationedge'])[1]")
	WebElement company;
	
	@FindBy(xpath="(//a[@class='slds-tabs_default__link'])[5]")
	WebElement paygroupObj;
	
	@FindBy(xpath="(//button[@class=\"slds-button slds-button_neutral\"])[3]")
	WebElement newpaygroup;
	
//	@FindBy(linkText = "Monthly")
//	WebElement frequencyvl;
//	
	@FindBy(xpath = "//input[@name='Name']")
	WebElement paygrpname;
	
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[1]")
		WebElement paycountry;
	
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[2]")
		WebElement frequency;
	
//	 @FindBy(xpath = "//button[@data-position-id='lgcp-1000043']")
//		WebElement frequencyvl;
	
	 
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[3]")
		WebElement currency;
	
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[4]")
		WebElement paygrouptype;
	 
	 
	@FindBy(xpath = "//input[@name='VLSF_Location__c']")
	WebElement location;
	 
	 @FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
	WebElement savebtn;
	
//	 @FindBy(xpath = "(//lightning-formatted-text[@class=\"slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp\"])[2]")
//		WebElement createdpaygrpname;
//	
	 
	 public Paygrouppage() {
			PageFactory.initElements(driver, this);
		}

	 public void createNewPaygroup(String paygroupname,String paygrpcountry,String paygrplocation) throws InterruptedException 
	 {
		 Thread.sleep(2000);
		 company.click();
		 Thread.sleep(10000);
		 paygroupObj.click();
		 Thread.sleep(15000);
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();",newpaygroup);
     	 newpaygroup.click();
		 Thread.sleep(10000);
		 paygrpname.sendKeys(paygroupname);
		 Thread.sleep(6000);
		 paycountry.click();
		  List<WebElement> counList=driver.findElements(By.xpath("//lightning-base-combobox-item[@class=\"slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain\"]/span[@class=\"slds-media__body\"]/span"));
			for(WebElement ele :counList)
			{
				String coun=ele.getText();
				if(coun.equalsIgnoreCase(paygrpcountry))
				{
					ele.click();
					Thread.sleep(2000);
					break;
				}
			}
			Thread.sleep(6000);
			frequency.sendKeys("M");
			Thread.sleep(5000);
			frequency.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(6000);
			frequency.sendKeys(Keys.ENTER);
			currency.sendKeys("B");
			currency.sendKeys(Keys.ENTER);
			Thread.sleep(6000);
			paygrouptype.sendKeys("G");
			paygrouptype.sendKeys(Keys.ENTER);
			Thread.sleep(6000);
			location.sendKeys(paygrplocation);
			Thread.sleep(6000);
			savebtn.click();
			Thread.sleep(6000);
		 
	 }
	 
//	 public String verifypaygruppname() {
//			return createdpaygrpname.getText();
//		}

		 
		 
		 
		 public void clickonCompany() {
				JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
				js.executeScript("arguments[0].click();",companyObj);
				
			}
}
