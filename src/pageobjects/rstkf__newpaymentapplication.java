package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__newpaymentapplication"                                
               , summary=""
               , page="newpaymentapplication"
               , namespacePrefix="rstkf"
               , object="rstkf__arcashd__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__newpaymentapplication {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='New Payment Applications']")
	public WebElement NewPaymentApplicationsPageTitle;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'cr_fromdocnums__c')]")
	public WebElement FromDocumentNumber;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'cr_thrudocnums__c')]")
	public WebElement ThruDocumentNumber;
	
	@ButtonType()
	@FindBy(xpath = "//input[contains(@id,'cr_thrudocnums__c')]/following::td//input[contains(@id,'Search')]")
	public WebElement Search;
	
	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'pg:fm:pb:pbt_openitems:0:selected')]")
	public WebElement ChkboxDocumentNumber;
	
	@ButtonType()
	@FindBy(xpath = "//input[contains(@id,'SingleItemApplyUnapplyCash')]")
	public WebElement SingleItemApplyUnapplyCash;
	
	@TextType()
	@FindBy(xpath = "//h2[text()='Single Item Apply / Un-apply Cash']")
	public WebElement SingleItemApplyUnapplyCashPageTitle;
	
	@TextType()
	@FindBy(xpath = "//label[text()='Document Number']/following::td//span")
	public WebElement DocumentNumber;
	
	@TextType()
	@FindBy(xpath = "//label[text()='Transaction Amount - Txn Currency']/following::td//span")
	public WebElement TransactionAmountTxnCurrency;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'sie_arapplic_amtmaint__c')]")
	public WebElement TransactionAmountARCurrency;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'sie_discntAppliedInProgMaint')]")
	public WebElement NewDiscountTakenTxnCurrency;

	@ButtonType()
	@FindByLabel(label = "Accept")
	public WebElement accept;

	@TextType()
	@FindBy(xpath = "//td/div")
	public WebElement Msg_SaveCompleted;
	
	@TextType()
	@FindBy(xpath = "//label[text()='Customer Pay Amount - Pay Curr']/following::td//span")
	public WebElement CustomerPayAmountPayCurr;
	
	@TextType()
	@FindBy(xpath = "//label[text()='Net Total Applied - Payment Currency']/following::td//span")
	public WebElement NetTotalAppliedPaymentCurrency;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Bal Remaining in Txn Currency']/following::td[8]//span")
	public WebElement BalRemaininginTxnCurrency;

	@ButtonType()
	@FindByLabel(label = "Close")
	public WebElement close;
}
