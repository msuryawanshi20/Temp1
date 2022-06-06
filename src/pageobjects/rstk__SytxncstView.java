package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sytxncst View"                                
               , summary=""
               , page="SytxncstView"
               , namespacePrefix="rstk"
               , object="rstk__sytxncst__c"
               , connection="QARSFAdmin"
     )             
public class rstk__SytxncstView {

	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::span/parent::th/parent::tr/parent::tbody/parent::table/parent::div/parent::div/parent::span/following-sibling::div//a")
	public WebElement inventoryItemMaster;
	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Account']/parent::span/parent::th/following-sibling::td//a")
	public WebElement creditaccount;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Account']/parent::span/parent::th/parent::tr/following-sibling::tr[1]/td[1]/span")
	public WebElement transactionID;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Account']/parent::span/parent::th/parent::tr/following-sibling::tr[1]/td[2]/span")
	public WebElement quantityOnHand;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Sequence No']/parent::span/parent::th/parent::tr/following-sibling::tr[1]/td[1]/span")
	public WebElement transactionQty;
//	@LinkType()
//	@FindBy(xpath = "//div/div/div[1]/div/div/table/tbody/tr[11]/td[1]/span")
//	public WebElement Project;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Accounting Date')]//following::td[1]/span")
	public WebElement accountingDate;
	@TextType()
	@FindBy(xpath = "//span/label[contains(text(),'Fiscal Year')]//following::td[1]")
	public WebElement fiscalYear;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Fiscal Period')]//following::td[1]")
	public WebElement fiscalPeriod;
	@LinkType()
	@FindBy(xpath = "//table/tbody/tr/th[contains(text(),'Purchase Order')]/following::td[1]//a")
	public WebElement purchaseOrder;
	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='PO Item Receipt No']/parent::span/parent::th/parent::tr/following-sibling::tr[1]//a")
	public WebElement pOReceiptTransaction;
	@LinkType()
	@FindBy(xpath = "//div/div/div[1]/div/div/table/tbody/tr[11]/td[1]/span")
	public WebElement inventoryItemMaster1;
	@LinkType()
	@FindBy(xpath = "//div/div/div[1]/div/div/table/tbody/tr[11]/td[1]/span")
	public WebElement Project;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Purchase Orders']")
	public WebElement tab_Orders_lbl;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Debit Account']/parent::span/parent::th/following-sibling::td")
	public WebElement debitAccount;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Division Dimension')]/following::td[1]//span[1]")
	public WebElement divisionDimension;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Customer Dimension')]/following::td[1]//span[1]")
	public WebElement customerDimension;
	@LinkType()
	@FindBy(xpath = "//th[text()='Sales Order']/following::span[contains(@id,'pbs_Orders')]//a[1]")
	public WebElement salesOrder;
	@TextType()
	@FindBy(xpath = "//span[text()='Order Type']/following::td//span[contains(@id,'pbs_Orders')][1]")
	public WebElement orderType;
	@TextType()
	@FindBy(xpath = "//span[text()='Customer']/following::td//span[contains(@id,'pbs_Orders')][1]")
	public WebElement Customer;
	@TextType()
	@FindBy(xpath = "//th[contains(normalize-space(.),'Inventory Item Master')]//following-sibling::td//span//a")
	public WebElement inventoryItemMaster2;
	
}
