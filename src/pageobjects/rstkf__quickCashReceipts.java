package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__quick Cash Receipts"                                
               , summary=""
               , page="quickCashReceipts"
               , namespacePrefix="rstkf"
               , object="rstkf__crato__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__quickCashReceipts {

	@TextType()
	@FindBy(id = "crato_cust__c_autocomplete")
	public WebElement Customer;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'qcr_paymtamt__c')]")
	public WebElement PaymentAmount;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'crato_payref__c')]")
	public WebElement PaymentReference;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'crato_depref__c')]")
	public WebElement DepositReference;
	
	@ButtonType()
	@FindBy(xpath = "//img[@name='Filters']")
	public WebElement Filters;
	
	@TextType()
	@FindBy(xpath = "//textarea[contains(@id,'qcr_docnums__c')]")
	public WebElement DocumentNumbers;
	
	@ButtonType()
	@FindBy(xpath = "//input[contains(@name,'Search')]")
	public WebElement Search;
	
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']//ul//li")
	public WebElement Customer_Select;
	
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'pbt_aritems') and @type='checkbox']")
	public WebElement Selectchkbox;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Process Receipt']")
	public WebElement ProcessReceipt;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'qcr_remainingamt__c')]")
	public WebElement RemainingAmount;
	
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'amtApplied')]")
	public WebElement AmountBeingPaid;
	
	@TextType()
	@FindBy(xpath = "//span[@class='dateFormat']//a")
	public WebElement TransactionDate;
	
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'crato_bankacct')]")
	public WebElement BankAccount;
	
}
