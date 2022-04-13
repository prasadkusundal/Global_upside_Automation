package Components;
import com.sca.commosActions.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sca.commosActions.TestBase;

public class Companypage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement companyObj;

	@FindBy(linkText = "New")
	WebElement newcompany;
	
	@FindBy(xpath = "//input[@name='Name']")
	WebElement compname;
	
	@FindBy(xpath = "//input[@name='VLSF_Street_Number__c']")
	WebElement streetno;
	
	@FindBy(xpath = "//input[@name='VLSF_Street__c']")
	WebElement street;
	
	@FindBy(xpath = "//input[@name='VLSF_Post_Code__c']")
	WebElement postcode;
	
    @FindBy(xpath = "//*[@id=\"combobox-button-139\"]")
	WebElement country;
    
    @FindBy(xpath = "//input[@id='combobox-button-139-9']")
   	WebElement countryname;
    
   // @FindBy(xpath = "//input[@data-value='Brazil']")
   //WebElement countryname;
    
	@FindBy(xpath = "//input[@name='VLSF_City__c']")
	WebElement city;
	
	  @FindBy(xpath = "//input[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][2]")
		WebElement financialyear;
	
	  @FindBy(xpath = "//input[@aria-label='Financial Year Start Day, 3']")
		WebElement fyvalue;
	  
	  @FindBy(xpath = "//input[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][3]")
		WebElement financialmonth;
	  
	  @FindBy(xpath = "//input[@aria-label='Financial Year Start Month, March']")
		WebElement monthvalue;
	  
	
	  @FindBy(xpath = "//input[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][4]")
		WebElement decimalplaces;
	  
	  @FindBy(xpath = "//input[@aria-label='Decimal Places, 2']")
		WebElement decimalvalue;
	
	  @FindBy(xpath = "//input[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][5]")
		WebElement seperater;
	  
	  @FindBy(xpath = "//input[@aria-label='1000 Separator, Comma']")
		WebElement seperatervalue;
	  
	  @FindBy(xpath = "//input[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'][6]")
		WebElement globalcurrency;
	  
	  @FindBy(xpath = "//input[@aria-label='Global Currency, BAM']")
		WebElement currencyvalue;
	  
	  
	  @FindBy(xpath = "//input[@class='slds-button slds-button_brand'][6]")
		WebElement savebtn;
	  @FindBy(xpath = "//lightning-formatted-text[@class=\"custom-truncate\"]")
		WebElement  createdcompanyname;
	  
	  public Companypage() {
			PageFactory.initElements(driver, this);
		}

//	public void clickonCompany1() {
//			JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
//			js.executeScript("arguments[0].click();",companyObj);
//		}
		
		
		
	  
		public void createNewCompany(String companyname,String streetnumber,String streetadd,String postno,String cityname) throws InterruptedException {
			Thread.sleep(2000);
			newcompany.click();
			Thread.sleep(9000);
			compname.sendKeys(companyname);
			Thread.sleep(6000);
			streetno.sendKeys(streetnumber);
			Thread.sleep(6000);
			street.sendKeys(streetadd);
			Thread.sleep(6000);
			postcode.sendKeys(postno);
			Thread.sleep(6000);
			country.click();
			Thread.sleep(6000);
			countryname.click();
			Thread.sleep(9000);
			city.sendKeys(cityname);
			financialyear.click();
			Thread.sleep(6000);
			fyvalue.click();
			Thread.sleep(6000);
			financialmonth.click();
			Thread.sleep(6000);
			monthvalue.click();
			Thread.sleep(6000);
			decimalplaces.click();
			Thread.sleep(6000);
			decimalvalue.click();
			Thread.sleep(6000);
			globalcurrency.click();
			Thread.sleep(6000);
			currencyvalue.click();
			Thread.sleep(6000);
			savebtn.click();
			Thread.sleep(10000);
			
		}
		
	public String verifycompanyname() {
			return createdcompanyname.getText();
		}

	public void createNewCompany1(String companyname) throws InterruptedException {
		
		compname.sendKeys(companyname);
		Thread.sleep(6000);
	}

	public void clickonCompany() {
		JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
		js.executeScript("arguments[0].click();",companyObj);
		
	}
}


