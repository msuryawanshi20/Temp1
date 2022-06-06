package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Purch Ord"                                
               , summary=""
               , page="PurchOrd"
               , namespacePrefix="rstk"
               , object="rstk__pohdr__c"
               , connection="QARSFAdmin"
     )   
     
              
public class rstk__PurchOrd {

	public WebDriver driver;

	public rstk__PurchOrd(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']")
	public WebElement OrderNumer;
	@ChoiceListType()
//	@FindBy(name = "pg:fm:pb:pbs_Main:j_id702:pohdr_vendno__c:j_id705:j_id712")
//	public WebElement Vendor1;
	@FindBy(xpath = "//select[contains(@name,'pohdr_vendno__c')]")
	public WebElement Vendor;
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_lineItems']")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='poline_item_autocomplete__c']")
		public WebElement item;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='poline_qtyreq__c']")
		public WebElement qtyReq;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='poline_unitpricemcurr__c']")
		public WebElement unitPrice;
		@BooleanType()
		@FindBy(xpath = "//td[1]/input")
		public WebElement select;
		@ButtonType()
		@FindBy(xpath = "//button[@id='revBtn']")
		public WebElement revisions;
	}
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Itemlist;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='APPROVED']")
	public WebElement orderStatus;
	@ButtonType()
	@FindByLabel(label = "Submit PO to Vendor")
	public WebElement submitPOToVendor;
//	@ButtonType()
//	@VisualforceBy(componentXPath = "apex:form[@id='fm']//div[4]//button[2]")
//	public WebElement cancel;
	@FindBy(xpath = "//button[@onclick='printOptions_cancel();window.location.reload();']")
	public WebElement cancel;	
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Order Number')]/following::td//span[contains(@id,'pohdr_ordno__c')]//div/input")
	public WebElement orderNumber;
	@TextType()
	@FindBy(xpath = "//img[@name='Advanced']")
	public WebElement Advanced;
//	@TextType()
//	@FindBy(id = "img_pg:fm:pb:j_id739")
//	public WebElement Advanced1;
	@TextType()
	@FindBy(xpath = "//td[contains(@id,'pbs_tp_terms_lbl')]")
	public WebElement Termstab;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@name,'pohdr_frghtrm__c')]")
	public WebElement FreightTerms;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@name,'pohdr_terms__c')]")
	public WebElement PaymentTerms;
	@ButtonType()
	@FindByLabel(label = "Submit Change to Vendor")
	public WebElement submitChangeToVendor;
	@TextType()
	@FindBy(xpath = "//td[normalize-space(.)='VENDOR NOTIFIED']")
	public WebElement orderStatus1;
	@ButtonType()
//	@FindByLabel(label = "Add")
//	public WebElement add;
	@FindBy(xpath = "//span/input[@value='Add']")
	public WebElement add;
	
		public void selectOptions(String ItemName) throws InterruptedException {

		Thread.sleep(2000);

		WebElement option = driver.findElement(
				By.xpath("//div[@class='ac_results']/ul[@role='listbox']/li[contains(text(),'" + ItemName + "')]"));

		option.click();

	}

		@ButtonType()
		@FindBy(xpath = "//input[@value='Add New Item']")
		public WebElement addNewItem;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='Item Type']/parent::th/following-sibling::td//select")
		public WebElement poitem_type__c;
		@ChoiceListType()
		@FindBy(xpath = "//label[contains(text(),'PO Commodity Code')]/parent::th/following-sibling::td//select")
		public WebElement pocommcod;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Item Number']/parent::th/following-sibling::td//input")
		public WebElement itemNumber;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Item Description']/parent::th/following-sibling::td//input")
		public WebElement itemDescription;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='Purchasing UOM']/parent::th/following-sibling::td//select")
		public WebElement poitem_puruom__c;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='ODC ID']/parent::th/following-sibling::td//select")
		public WebElement poitem_odcid__c;
		@ButtonType()
		@FindBy(xpath = "//div[@class='modal']//button[@onclick='newItem_ok()']")
		public WebElement add1;
		@ButtonType()
		@FindBy(xpath = "//input[@value='Clone']")
		public WebElement clone;
		@TextType()
		@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Dates & Indicators']")
		public WebElement dateindicatortab;
		@BooleanType()
		@FindBy(name = "pg:fm:ovr_pb:modal_polinerev_closeshortind__c")
		public WebElement polinerev_closeshortind;
		@ButtonType()
		@FindBy(xpath = "//div[@id='revision']/button[normalize-space(.)='OK']")
		public WebElement oK;
		@TextType()
		@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Line Update Values']")
		public WebElement lineUpdates_tab;
		@ButtonType()
		@FindBy(xpath = "//td[10]//tr[1]/td[2]/input")
		public WebElement closeAllLinesShort;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='Default Receipt Site']/parent::span/parent::th/following-sibling::td[1]//select")
		public WebElement defaultreceiptsite;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='Receipt Location ID (Line Update)']/parent::span/parent::th/following-sibling::td[1]//select")
		public WebElement receiptlocid;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Receipt Location Number (Line Update)']/parent::span/parent::th/following-sibling::td[1]//input")
		public WebElement receiptLocationNumberLineUpdate;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Due Date (Line Update)']/parent::span/parent::th/following-sibling::td[1]//input")
		public WebElement dueDateLineUpdate;
		@TextType()
		@FindBy(xpath = "//label[normalize-space(.)='Dock Date (Line Update)']/parent::span/parent::th/following-sibling::td[1]//input")
		public WebElement dockDateLineUpdate;
		@ChoiceListType()
		@FindBy(xpath = "//label[normalize-space(.)='Organizational Dept. (Line Update)']/parent::span/parent::th/following-sibling::td[1]//select")
		public WebElement orgdeptlineupdate;
		@ButtonType()
		@FindBy(xpath = "//td[10]//tr[8]/td[1]/input")
		public WebElement updateLineValues;
	
}
