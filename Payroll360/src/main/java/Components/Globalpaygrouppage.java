package Components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class Globalpaygrouppage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Paygroups')]")
	WebElement paygroupsObj;
	
	@FindBy(xpath= "//a[@title='New']")
	WebElement newpgrp;
	
	@FindBy(xpath = "//input[@name='Name']")
	WebElement paygrpname;
	
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[1]")
		WebElement paycountry;
	
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[2]")
		WebElement frequency;
	
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[3]")
		WebElement currency;
	 
	 @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[4]")
		WebElement paygrouptype;
	 
	 @FindBy(xpath = "//input[@name='VLSF_Location__c']")
		WebElement location;
	 
	 @FindBy(xpath = "(//input[@class='slds-combobox__input slds-input'])[1]")
		WebElement cmpname;
	 
	 @FindBy(xpath = "(//input[@class='slds-combobox__input slds-input'])[1]")
		WebElement parentpaygroup;
	 
	 @FindBy(xpath = "//button[@class='slds-button slds-button_brand']")
		WebElement savebtn;
	
	 public Globalpaygrouppage() {
			PageFactory.initElements(driver, this);
		}

	 
	 public void createNewGlobalpaygroup(String paygroupname,String paygrpcountry,String paygrplocation) throws InterruptedException 
	 {
		 Thread.sleep(6000);
		 newpgrp.click();
		 Thread.sleep(10000);
		 paygrpname.sendKeys(paygroupname);
		 Thread.sleep(5000);
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
			frequency.sendKeys("B");
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
			cmpname.click();
			Thread.sleep(10000);
		//	cmpname.sendKeys(Keys.ARROW_DOWN);
			cmpname.sendKeys(Keys.ENTER);
			Thread.sleep(15000);
			parentpaygroup.click();
			Thread.sleep(10000);
			//parentpaygroup.sendKeys(Keys.ARROW_DOWN);
			parentpaygroup.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			savebtn.click();
			Thread.sleep(6000);
			
			
			
	 }
	 
	 
	 
	 
	 
	 public void clickonPaygroups() {
			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
			js.executeScript("arguments[0].click();",paygroupsObj);
			
		}
	 
	 
	 
}
