package Components;
import com.sca.commosActions.TestBase;

import java.util.List;

import org.openqa.selenium.By;
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
	
    @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[1]")
	WebElement country;
    
    @FindBy(xpath = "//button[@id='combobox-button-133'])[2]")
   	WebElement countryname1;
    
    @FindBy(xpath="//lightning-base-combobox-item[@class=\"slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain\"]/span[@class=\"slds-media__figure slds-listbox__option-icon\"]")
    WebElement countryList;
    
   // @FindBy(xpath = "//input[@data-value='Brazil']")
   //WebElement countryname;
    
	@FindBy(xpath = "//input[@name='VLSF_City__c']")
	WebElement city;
	
	  @FindBy(xpath = "(//button[@class=\"slds-combobox__input slds-input_faux slds-combobox__input-value\"])[2]")
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
		
		
		
	  
		public void createNewCompany(String companyname,String streetnumber,String streetadd,String postno,String cityname, String countryN) throws InterruptedException {
			Thread.sleep(2000);
			newcompany.click();
			Thread.sleep(9000);
			compname.sendKeys(companyname);//vyomsAutomationlab
			Thread.sleep(6000);
			streetno.sendKeys(streetnumber);
			Thread.sleep(6000);
			street.sendKeys(streetadd);
			Thread.sleep(6000);
			postcode.sendKeys(postno);
			Thread.sleep(6000);
			country.click();
			Thread.sleep(6000);
			country.sendKeys(countryN);
		//	countryname1.click();
			List<WebElement> counList=driver.findElements(By.xpath("//lightning-base-combobox-item[@class=\"slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain\"]/span[@class=\"slds-media__body\"]/span"));
			for(WebElement ele :counList)
			{
				String coun=ele.getText();
				if(coun.equalsIgnoreCase(countryN))
				{
					ele.click();
					Thread.sleep(2000);
					break;
				}
			}
			city.sendKeys(cityname);
			
			
		}
		
	public String verifycompanyname() {
			return createdcompanyname.getText();
		}



	public void clickonCompany() {
		JavascriptExecutor js=(JavascriptExecutor)TestBase.driver;
		js.executeScript("arguments[0].click();",companyObj);
		
	}
}


