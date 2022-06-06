package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Create New Invoice"                                
               , summary=""
               , page="CreateNewInvoice"
               , namespacePrefix="rstk"
               , object="rstk__soinv__c"
               , connection="QARSF_Admin"
     )             
public class rstk__CreateNewInvoice {

	@TextType()
	@FindBy(xpath = "//input[@id='soinv_custno__c_autocomplete']")
	public WebElement Customer;
	
	@BooleanType()
	@FindBy(xpath = "//input[contains(@name,'manualInvoiceSection')]")
	public WebElement ManualInvoicechkbox;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Create Invoice']")
	public WebElement CreateInvoice;
	
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Customer_Select;

	@ButtonType()
	@FindByLabel(label = "Create Credit Memo")
	public WebElement createCreditMemo;
	
	@TextType()
	@FindBy(xpath = "//h2[contains(text(),'New Credit Memo')]")
	public WebElement NewCreditMemoTitle;
	
}
