package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Csttransqry"                                
               , summary=""
               , page="Csttransqry"
               , namespacePrefix="rstk"
               , object="rstk__sytxncst__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Csttransqry {

	public WebDriver driver;

	public rstk__Csttransqry(WebDriver driver) {
		this.driver = driver;
	}

	public void selectInventoryItem(String InventoryItemName) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='sytxncst_icitem__c_autocomplete']")).sendKeys(InventoryItemName);
		Thread.sleep(2000);

		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		List<WebElement> autoCompleteList = driver
				.findElements(By.xpath("//div[@class='ac_results'][1]/ul[@id='IDREF']/li"));
		for (int i = 0; i < autoCompleteList.size(); i++) {
			Thread.sleep(1000);
			actions.moveToElement(autoCompleteList.get(i)).build().perform();
			if (autoCompleteList.get(i).getText().equalsIgnoreCase(InventoryItemName)) {
				actions.moveToElement(autoCompleteList.get(i)).click().build().perform();
				break;
			}
		}
	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Start Date']/parent::span/parent::th/following-sibling::td//input")
	public WebElement startDate;

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement submit;

	@PageRow()
	public static class CostTransactionTable {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='View']")
		public WebElement view;
	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@FindBy(xpath = "//div[contains(text(),'Item')]//parent::th//parent::tr//following::tr")
	@PageTable(firstRowContainsHeaders = false, row = CostTransactionTable.class)
	public List<CostTransactionTable> costTransactionTable;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction End Date']/parent::span/parent::th/following-sibling::td//input")
	public WebElement transactionEndDate;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction ID']/parent::span/parent::th/following-sibling::td//select")
	public WebElement TransactionID;

}
