package pageobjects;

import java.util.List;

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
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Rtdept"                                
               , summary=""
               , page="Rtdept"
               , namespacePrefix="rstk"
               , object="rstk__rtdept__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Rtdept {
	public WebDriver driver;

	public rstk__Rtdept(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Manufacturing Department Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement manufacturingDepartmentNumber;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inventory Site']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement inventorySite;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Manager']/parent::span/parent::th/following-sibling::td//select")
	public WebElement responsibleManager;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Planner']/parent::span/parent::th/following-sibling::td//select")
	public WebElement responsiblePlanner;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Organizational Department']/parent::span/parent::th/following-sibling::td//select")
	public WebElement organizationalDepartment;

	public void selectAccDim(String AccountingDimension) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		String elementLocator = "//input[@name='rtdept_dimval__c_autocomplete']";

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementLocator)));

		WebElement ele = driver.findElement(By.xpath(elementLocator));
		ele.clear();
		ele.sendKeys(AccountingDimension);

		Actions actions = new Actions(driver);

		String listLocator = "//div[@class='ac_results'][1]/ul[@id='IDREF']/li";
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(listLocator)));

		List<WebElement> autoCompleteList = driver.findElements(By.xpath(listLocator));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(300);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(AccountingDimension)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Labor Ohd Option']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement laborOhdOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Sim Ohd Rate, Labor']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement simOhdRateLabor;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Std Ohd Rate, Labor']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement stdOhdRateLabor;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Fringe Ohd Option']/parent::span/parent::th/following-sibling::td//select")
	public WebElement fringeOhdOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Sim Ohd Rate, Fringe']/parent::span/parent::th/following-sibling::td//input")
	public WebElement simOhdRateFringe;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Std Ohd Rate, Fringe']/parent::span/parent::th/following-sibling::td//input")
	public WebElement stdOhdRateFringe;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;

	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Manufacturing Department Number']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement manufacturingDepartmentNumber1;

}
