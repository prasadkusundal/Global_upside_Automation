package com.sca.commosActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import commonActions.TestBase;
//import com.sca.utilities.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static XSSFReader reader;

	public static WebDriver driver;
	public static Properties p;
	public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;

	public TestBase(){
		try {
			p=new Properties();
			String path=System.getProperty("user.dir");
			System.out.println(path);
			FileInputStream f=new FileInputStream("C:\\Users\\Gitesh\\Documents\\GitHub\\Global_upside_Automation\\Payroll360\\src\\main\\java\\Properties\\config.properties" );
			p.load(f);
			;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
	
	public static void launch() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("url"));
		//driver.get("https://test.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		e_driver = new EventFiringWebDriver(driver);
		//eventListener = new WebEventListener();
	//	e_driver.register((WebDriverEventListener) eventListener);
		driver = e_driver;

	}
	
	public static boolean verify(By webEle) {
		boolean check=driver.findElement(webEle).isDisplayed();
		System.out.println(check);
		return check;

	}

	public static void clickOnElement(By webEle)
	{
		driver.findElement((webEle)).click();
	}

	public static void sendKey(By webEle,String text) {
		driver.findElement(webEle).sendKeys(text);
	}

	public static void clickoncheckbox(By webEle) {

		boolean check=driver.findElement(webEle).isSelected();
		if(!check)
		{
			driver.findElement(webEle).click();

		}
	}
	public String titleTest() {
		return driver.getTitle();
	}

	public static void pressEnter() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER);
	}

	public static void scrollupto(By webEle) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",webEle);

	}

	public static void clickonElementbyjs(WebElement webEle) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", webEle);
	}

	public static String getText(By webEle) {
		String gettext=driver.findElement(webEle).getText();
		return gettext;
	}

	public static boolean elementvisibletest(By webEle) {
		boolean gettext=driver.findElement(webEle).isEnabled();
		return gettext;
	}
	public static void explicitWait(By ele) {
		WebDriverWait wait=new WebDriverWait(TestBase.driver,2);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	
	
	
}
