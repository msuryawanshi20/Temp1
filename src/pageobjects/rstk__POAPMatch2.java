package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ POAP Match 2"                                
               , summary=""
               , page="POAPMatch2"
               , namespacePrefix="rstk"
               , object="rstk__poaphdr__c"
               , connection="QARSFAdmin"
     )             
public class rstk__POAPMatch2 {

	@TextType()
	@FindBy(xpath = "//input[@id='poaphdr_vendno__c_autocomplete']")
	public WebElement POAPVendor;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement POAPVendorlist;
	@TextType()
	@FindBy(xpath = "//input[@id='pohdr__c_autocomplete']")
	public WebElement POAPPOHDR;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement POAPHDRlist;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Select PO Receipts']")
	public WebElement selectPOReceipts;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Vendor Invoice Number')]/parent::span/parent::th/following::td[1]/input")
	public WebElement vendorInvoiceNumber;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Vendor Invoice Number')]/parent::span/parent::th/following::td[2]//input")
	public WebElement invoiceDate;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Vendor Invoice Number')]/parent::span/parent::th/following::td[3]//input")
	public WebElement totalInvoiceAmount;
	@BooleanType()
	@FindBy(xpath = "//input[@id='selectAll']")
	public WebElement POAPSelectAll;
	@ButtonType()
	@FindBy(xpath = "//label[contains(text(),'Amount Remaining')]/parent::th/parent::tr/following-sibling::tr//input")
	public WebElement submit;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='AP Match Indicator']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement aPMatchIndicator;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Close Batch']")
	public WebElement closeBatch;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Batch Number')]/parent::span/parent::th/following-sibling::td//span")
	public WebElement batchNumber;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Batch Number']/parent::span/parent::th/following-sibling::td//select")
	public WebElement closebatchNumber;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Batch 579 closed successfully.']//td/div")
	public WebElement batchclosests;
	@TextType()
	@FindBy(xpath = "//input[@id='addGLLine']")
	public WebElement addGLLine;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Amount Remaining')]/parent::th/following::td/span")
	public WebElement amountRemaining;
	@TextType()
	@FindBy(xpath = "//td[@class='messageCell']/div/span/h4")
	public WebElement BatchCloseStatus;
	
}
