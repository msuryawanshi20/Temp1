package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage(title = "Rstk__salesorder",summary="",page = "SalesOrder",namespacePrefix = "rstk", object = "rstk__sohdr__c", connection = "QARSF_Admin")
public class rstk__salesorder {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Sales Order']")
	public WebElement pageTitle;
	@TextType()
	@FindBy(xpath = "//input[contains(@name,'sohdr_order__c')]")
	public WebElement orderNumber;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'sohdr_custno__c')]")
	public WebElement Customer;
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Customer_Select;
	/*@TextType()
	@FindBy(xpath = "//span[@name='SOtotal']")
	public WebElement SOtotal;*/
	@PageTable(row = LineItems.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_lineitems']")
	public List<LineItems> lineItems;
	@PageRow(byColumn = true)
	public static class LineItems {

		@TextType()
		@VisualforceBy(componentXPath = "apex:inputText[@id='soline_textproduct__c']")
		public WebElement product;
		@TextType()
		@FindBy(xpath = "//input[contains(@id,'soline_qtyorder__c')]")
		public WebElement qtyOrdered;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_price__c']")
		public WebElement unitPrice;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_firm__c']")
		public WebElement firm;
		@TextType()
		//@VisualforceBy(componentXPath = "apex:outputField[@id='soline_linestatustext__c']")
		@FindBy(xpath="//span[contains(@id,'soline_linestatustext__c')]")
		public WebElement Firmed;
		@ChoiceListType()
		//@VisualforceBy(componentXPath = "apex:selectlist[@id='soline_prodtype__c']")
		@FindBy(xpath="//select[contains(@id,'soline_prodtype__c')]//option")
		public WebElement productType;
		@TextType()
		@VisualforceBy(componentXPath = "apex:inputField[@id='soline_discpct__c']")
		public WebElement discountPct;
		@TextType()
		@FindBy(xpath = "//input[contains(@id,'soline_duedate__c')]")
		public WebElement dueDate;
		@LinkType()
		@VisualforceBy(componentXPath = "apex:outputField[@id='dsp_soline_prod__c']/a")
		public WebElement product1;	
				
	}
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Product_Select;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	
	@ButtonType()
	@FindByLabel(label = "Order Fulfillment")
	public WebElement orderFulfillment;
	@ButtonType()
	@FindByLabel(label = "Add")
	public WebElement add;
	@ButtonType()
	@FindByLabel(label = "Firm All Lines")
	public WebElement Firm_All_Lines;
	@ButtonType()
	@FindByLabel(label = "Add New Order")
	public WebElement addNewOrder;
	@ButtonType()
	@FindByLabel(label = "Clone")
	public WebElement clone;
	@ButtonType()
	@FindByLabel(label = "Quick Entry")
	public WebElement quickEntry;
	@ButtonType()
	@FindByLabel(label = "Addresses")
	public WebElement Addresses;
	@TextType()
	@FindBy(xpath = "//div[@id='quickEntryGridPopup']/span//div/h3")
	public WebElement Sales_Order_Line_Quick_Entry_Header;
	@ButtonType()
	@FindByLabel(label = "Ok")
	public WebElement ok;
	@ButtonType()
	@FindByLabel(label = "Set Due Date on All Lines")
	public WebElement setDueDateOnAllLines;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'dueDateOverride')][1]")
	public WebElement dueDateOverride;
	@ButtonType()
	@FindBy(xpath = "//h3[text()='Due Date Override']/following::div//table[@class='detailList']//input[@name='popupOkButton' and @value='Continue']")
	public WebElement continue_;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Process Authorizations and Payments']")
	public WebElement ProcessAuthorizationsandPayments;
	
	@TextType()
	@FindBy(xpath = "//h3[text()='Process Authorizations and Payments']")
	public WebElement ProcessAuthorizationsandPaymentsTitle;
	@ButtonType()
	@FindByLabel(label = "Commit")
	public WebElement commit;
	
	@TextType()
	@FindBy(xpath = "//div[contains(@id,'sohdrpays')]//table[@class='list']//tr[2]//td[6]")
	public WebElement PaymentStatus;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Lines Total:']/following-sibling::span[1]")
	public WebElement SOtotal;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Ship-To']")
	public WebElement tabShipTo_lbl;
	@BooleanType()
	@FindBy(xpath = "//td[2]//td/span//th[1]/span/input")
	public WebElement Override_Ship_To;
	@TextType()
	@FindBy(id = "pg:fm:j_id246:j_id318:j_id321:shipto_soaddr_name__c")
	public WebElement Name_CustomerShipToTab;
	@ButtonType()
	@FindBy(xpath = "//h2[text()='Sales Order Addresses']/following::input[@name='SelectRelatedCustomerAddress'][1]")
	public WebElement selectRelatedCustomerAddress;
	@TextType()
	@FindBy(xpath = "//h3[normalize-space(.)='Related Customer Addresses']")
	public WebElement Related_Customer_Addresses_popup;
	@TextType()
	@FindBy(xpath = "//table[@id='relatedCustomerAddressTable']//tr[2]//td[1]//span")
	public WebElement CustomerNumber_Related;
	@ButtonType()
	@FindBy(xpath = "//div[@id='popupAddresses']//button[text()='OK']")
	public WebElement OK;
	@ButtonType()
	@FindBy(xpath = "//button[@id='lineDetailBtn']")
	public WebElement Additional;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'soline_soaddr_name__c')]")
	public WebElement Name_Customer_SOLine;
	@ButtonType()
	@FindBy(xpath = "//div[@id='popupLineDetails']//button[text()='OK']")
	public WebElement OK_SOLine;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@id,'lineAddress')]//input[@name='SelectRelatedCustomerAddress']")
	public WebElement SelectRelatedCustomerAddress_SOLine;
	@TextType()
	@FindBy(id = "img_pg:fm:pb:advancedBlock")
	public WebElement advancedBlock;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'sohdr_opportunity__c')]//a")
	public WebElement opportunity;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'sohdr_quotesf__c')]//a")
	public WebElement quote;
	
	
}
