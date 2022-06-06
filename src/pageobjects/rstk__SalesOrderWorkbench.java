package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sales Order Workbench"                                
               , summary=""
               , page="SalesOrderWorkBench"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="Devqaff"
     )             
public class rstk__SalesOrderWorkbench {

	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	@BooleanType()
	@FindBy(id = "pg:fm:pb:j_id269:j_id280:soiss_createinvoice__c")
	public WebElement soiss_createinvoice__c;
	@ButtonType()
	@FindByLabel(label = "Process Selected Lines")
	public WebElement processSelectedLines;
//	@PageRow()
//	public static class Table {
//
//		@TextType()
//		@FindByLabel(label = "Qty Shipped")
//		public WebElement qtyShipped;
//		@LinkType()
//		@FindBy(xpath = "//span[contains(@id,'soship_invoice__c')]")
//		public WebElement invoiceNumber;
//		@TextType()
//		@FindByLabel(label = "Qty Shipped")
//		public WebElement qtyShipped1;
//		@TextType()
//		@FindBy(xpath = "//td[contains(@id,'soship_qtyship__c')]//span[1]")
//		public WebElement qtyShipped2;
//	}
//	@FindBy(id = "pg:fm:pb:j_id297:pbt:tb")
//	@PageTable(firstRowContainsHeaders = false, row = Table.class)
//	public List<Table> table;
	@PageRow()
	public static class Table {

		@TextType()
		@FindBy(xpath="//div[text()='Qty Shipped']/following::tbody//tr[1]//td[14]//span")
		public WebElement qtyShipped1;
		@LinkType()
		@JavascriptBy(jspath = "return document.querySelector('td:nth-child(17) > span > a')")
		public WebElement invoiceNumber;
		@TextType()
		@FindBy(xpath = ".//td[11]/span")
		public WebElement qtyAllocated1;
		@TextType()
		@FindBy(xpath = "//tr[2]/td[11]/span")
		public WebElement qtyAllocated2;
		@TextType()
		@FindBy(xpath = ".//td[12]/span")
		public WebElement qtyIssued;
		@TextType()
		@FindBy(xpath = "//tr[2]/td[12]/span")
		public WebElement qtyIssued2;
		@TextType()
		@FindBy(xpath = ".//td[13]/span/span")
		public WebElement qtyPackaged;
		@TextType()
		@FindBy(xpath = "//tr[2]/td[13]/span")
		public WebElement qtyPackaged2;
		@TextType()
		@FindBy(xpath = ".//td[4]/span")
		public WebElement Shipper;
		@TextType()
		@FindBy(xpath = "//tr[2]/td[4]/span")
		public WebElement Shipper2;
		@TextType()
		@FindBy(xpath = ".//td[14]/span/span")
		public WebElement qtyShipped;
		
		@TextType()
		@FindBy(xpath = ".//td[17]/span")
		public WebElement InvoiceNum;
		
		@TextType()
		@FindBy(xpath = "//td[2]/input[contains(@id,'procqty')]")
		public WebElement processQty;
		@ChoiceListType()
		@FindBy(xpath = "//tbody[contains(@id,'allocationTable')]//tr[1]//select[@class='serials']//option[1]")
		public WebElement ManualSerialEntry1;
		@ChoiceListType()
		@FindBy(xpath = "//tbody[contains(@id,'allocationTable')]//tr[2]//select[@class='serials']//option[1]")
		public WebElement ManualSerialEntry2;
		
	}
	@FindBy(xpath = "//table[@class='list']//tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'allocate')]")
	public WebElement soiss_allocate__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'rvalloc')]")
	public WebElement soiss_reverseallocate__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'pick') and (@type='checkbox')]")
	public WebElement soiss_pick__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'rvpick') and (@type='checkbox')]")
	public WebElement soiss_reversepick__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'package') and (@type='checkbox')]")
	public WebElement soiss_pack__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'rvpack') and (@type='checkbox')]")
	public WebElement soiss_reversepack__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'ship') and (@type='checkbox')]")
	public WebElement soiss_ship__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'rvship') and (@type='checkbox')]")
	public WebElement soiss_reverseship__c;
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'createInvoiceOnly')]")
	public WebElement soiss_invonly__c;
	
	
	@PageRow()
	public static class Table1 {

		@ChoiceListType()
		@JavascriptBy(jspath = "return document.querySelector('tr.dataRow.even.first > td:nth-child(11) > span > select > option')")
		//@JavascriptBy(jspath = "return document.querySelector('td:nth-child(11) > span > select > option')")
		public WebElement Serials1;
		
		@ChoiceListType()
		@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(2) > td:nth-child(11) > span > select > option')")
		public WebElement Serials2;

		/*@ChoiceListType()
		@FindBy(xpath = "//option[normalize-space(.)='130']")
		public WebElement Serials11;*/

		/*@ChoiceListType()
		@JavascriptBy(jspath = "return document.querySelector('tr:nth-child(2) > td:nth-child(11) > span > select > option')")
		public WebElement Serials3;*/
	}
	
	@FindBy(xpath = "//table[@class='list']//tbody[contains(@id,'componentsData:allocationTable')]//tr")
	@PageTable(firstRowContainsHeaders = false, row = Table1.class)
	public List<Table1> table1;
	@TextType()
	@FindBy(xpath = "//div[@class='messageText']")
	public WebElement ErrorMsg;
	
	/*@PageRow()
	public static class Table_sof {

		
		@TextType()
		@FindBy(xpath = "//td[11]/span")
		public WebElement qtyAllocated11;
	}
	@FindBy(id = "pg:fm:pb:j_id297:pbt:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table_sof.class)
	public List<Table_sof> table_sof;
	
	
	
	//Custom Table
	
	/*@PageRow()
	public static class SalesOrderFullfillment_Table {


		@TextType()
		@FindBy(xpath = ".//td[3]")
		public WebElement SalesOrder;
		
		@FindBy(xpath = ".//td[14]/span")
		public WebElement QtyShipped;
		
		@FindBy(xpath = ".//td[17]")
		public WebElement Invoice;
		
		
	}
	@FindBy(xpath="//table[contains(@id,'pg:fm:pb:j_id297:pbt')]/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = SalesOrderFullfillment_Table.class)
	public List<SalesOrderFullfillment_Table> SalesOrderFullfillment_Table;
	*/
	
	//custome table search criteria
	
	
}
