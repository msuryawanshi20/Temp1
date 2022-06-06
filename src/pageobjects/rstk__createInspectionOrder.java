package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TestLogger;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__create Inspection Order", summary = "", page = "createInspectionOrder", namespacePrefix = "rstk", object = "rstk__inspord__c", connection = "QARSF_Admin")
public class rstk__createInspectionOrder {
	public WebDriver driver;

	public rstk__createInspectionOrder(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//input[@id='inspord_icitem__c_autocomplete']")
	public WebElement inventoryItem;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Order Template']/ancestor::th/following-sibling::td[1]//select")
	public WebElement inspord_insptempl__c;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Originating Inventory Site']/ancestor::th/following-sibling::td//select")
	public WebElement Originating_Inventory_Site;

	@TextType()
	@FindBy(xpath = "//input[@id='inspord_frlocid__c_autocomplete']")
	public WebElement Originating_Location_ID;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Originating Location Number']/ancestor::th/following-sibling::td//select")
	public WebElement OriginatingLocationNumber;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TestLogger
	public Logger testLogger;

	public void selectInventoryItem(String InventoryItemName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		String elementLocator = "//input[@name='inspord_icitem__c_autocomplete']";
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementLocator)));
		WebElement ele=driver.findElement(By.xpath(elementLocator));
		ele.clear();
		ele.sendKeys(InventoryItemName);
		
		
		
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		
		String listLocator="//div[@class='ac_results'][1]/ul[@id='IDREF']/li";
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(listLocator)));
		
		List<WebElement> autoCompleteList = driver.findElements(By.xpath(listLocator));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(1000);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(InventoryItemName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	public void selectOriginatingLocationID(String OriginalLocID) throws InterruptedException {
		Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		String elementLocator = "//input[@id='inspord_frlocid__c_autocomplete']";
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementLocator)));
		WebElement ele=driver.findElement(By.xpath(elementLocator));
		
		
		
		ele.clear();
		ele.sendKeys(OriginalLocID);	
		Thread.sleep(2500);
		
		Actions actions = new Actions(driver);
		
		String listLocator="//div[@class='ac_results'][2]/ul[@id='IDREF']/li";
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(listLocator)));
		
		List<WebElement> autoCompleteList = driver.findElements(By.xpath(listLocator));
		
	
		testLogger.info("List Size" + autoCompleteList.size());
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(500);
			testLogger.info("List value" + i + ":" + autoCompleteList.get(i).getText());
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(OriginalLocID)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Quantity']/ancestor::th/following-sibling::td[1]//input")
	public WebElement inspectionQuantity;

	
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Serial Numbers']/ancestor::span/parent::th/following-sibling::td//textarea")
	public WebElement serialNumbers;

	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/ancestor::th/following-sibling::td[1]//a")
	public WebElement division;

	public static String serialList = "";

	public void setSerialNumbers(String serialNumber) {
		testLogger.info("Serial number Input::" + serialNumber);

		//serialNumbers.sendKeys(serialNumber);

		serialNumbers.sendKeys("\n" + serialNumber );
		serialList += serialNumber;
		testLogger.info("SErial List::" + serialList);

	}

}
