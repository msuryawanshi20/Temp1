package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.AuraBy;
import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page(title = "wocst_LUI", summary = "", relativeUrl = "", connection = "QARSF_Admin"

)

public class wocst_LUI {

	public WebDriver driver;

	public wocst_LUI(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//label[normalize-space(.)='*Target Site']/following-sibling::div//button")
	public WebElement clearSite;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Target Site']/following-sibling::div//input")
	public WebElement site;

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li//lightning-formatted-text")
	public WebElement selectSite;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Item Number']/following-sibling::div//input")
	public WebElement ItemNumber;

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.currentRecord.rstk__wocst_ordno__c}']", qualifier = "rstk__wocst_ordno__c")
	public WebElement orderNumber;

	@TextType()
	@FindBy(xpath = "//input[@name='rstk__wocst_qtyreq__c']")
	public WebElement qtyRequired;

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div/span/lightning-formatted-text")
	public WebElement selectItem;

	@BooleanType()
	@FindBy(xpath = "//input[@name='rstk__wocst_reworkind__c']")
	public WebElement rework;

	@BooleanType()
	@FindBy(xpath = "//input[@name='rstk__wocst_refurbind__c']")
	public WebElement refurb;

	@TextType()
	@FindBy(xpath = "//input[@name='rstk__wocst_duedte__c']")
	public WebElement dueDate;

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='*Project']/following-sibling::div//button")
	public WebElement clearProject;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Project']/following-sibling::div//input")
	public WebElement project;

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li[1]/div")
	public WebElement selectProjectName;

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='*Project']/following-sibling::div//a")
	public WebElement selectedProjectName;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Project Charge Code']/following-sibling::div//input")
	public WebElement projectChargeCode;

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li[1]/div")
	public WebElement selectProjectChargeCode;

	@BooleanType()
	@FindBy(xpath = "//input[@name='rstk__wocst_consignind__c']")
	public WebElement consigned;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Save']")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Order Number']/following-sibling::div/lightning-formatted-text")
	public WebElement orderNumber1;

	public String readOrderNumber() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		String element = "//span[normalize-space(.)='Order Number']/following-sibling::div/lightning-formatted-text";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));

		return driver.findElement(By.xpath(element)).getText();

	}

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Status']/following-sibling::div/lightning-formatted-text")
	public WebElement status;

	@LinkType()
	@AuraBy(componentXPath = "//lightning:menuItem[@value= '{!quickAction.name}' and @label='Edit']")
	public WebElement edit;

	@TextType()
	@FindBy(xpath = "//input[@name='rstk__wocst_lotno__c']")
	public WebElement lotNumber;

	@TextType()
	@FindBy(xpath = "//input[@name='rstk__wocst_lotexpiredate__c']")
	public WebElement lotExpirationDate;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Save']")
	public WebElement save1;

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='ActionsShow menu']")
	public WebElement actions;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Generate Serials']")
	public WebElement generateSerials;

	@ChoiceListType()
	@FindBy(xpath = "//select[@name='Serial_Entry_Options']")
	public WebElement serialEntryOptions;

	public void setSerial(String serial) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Serial_Numbers_comma_separated']")));

		driver.findElement(By.xpath("//input[@name='Serial_Numbers_comma_separated']")).sendKeys(serial);
	}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;

	@TextType()
	@FindBy(xpath = "//lightning-formatted-rich-text//p")
	public WebElement serialAddSuccess;

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Finish']")
	public WebElement finish;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Extract Components']")
	public WebElement extractComponents;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Extract Operations']")
	public WebElement extractOperations;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Extract Operations & Components']")
	public WebElement extractOperationsAndComponets;

	@TextType()
	@FindBy(xpath = "//lightning-formatted-rich-text//b")
	public WebElement successMessage;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Allocate Components']")
	public WebElement allocateComponents;

	public String readToastMessageText() {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='toastMessage forceActionsText']")));

		return driver.findElement(By.xpath("//span[@class='toastMessage forceActionsText']")).getText();

	}

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Generate Picklist']")
	public WebElement generatePicklist;

	@BooleanType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label/span[1]")
	public WebElement includeBackflush_;

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Issue']")
	public WebElement issue;

	public void enterIssueFrom(String IssueFrom) {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		String locator = "//label[text()='Issue from:' or text()='Select a Location Id']/parent::div//following::input[1]";
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		driver.findElement(By.xpath(locator)).sendKeys(IssueFrom);
		String autoComplete = "//label[text()='Issue from:' or text()='Select a Location Id']/parent::div//following::ul[@role='listbox']/li";
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(autoComplete)));
		driver.findElement(By.xpath(autoComplete)).click();
	}

	@TextType()
	@FindBy(xpath = "//input[@name='Quantity_To_Issue']")
	public WebElement quantityToIssue;

}
