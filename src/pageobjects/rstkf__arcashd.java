package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__arcashd"                                
               , summary=""
               , page="arcashd"
               , namespacePrefix="rstkf"
               , object="rstkf__arcashd__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__arcashd {

	@TextType()
	@FindBy(xpath = "//input[@id='arcashd_paycust__c_autocomplete']")
	public WebElement CustomerWhoHasPaid;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'arcashd_payamt__c')]")
	public WebElement CustomerPayAmountPayCurr;
	
	@TextType()
	@FindBy(xpath = "//*[text()='Customer Pay Amount - Pay Curr']/following::td//span[1]")
	public WebElement CustomerPayAmountPayCurrLabel;
	
	@TextType()
	@FindBy(xpath = "//th[text()='Amt. Remaining to Apply - Home Currency']/following::td//span")
	public WebElement AmtRemainingtoApplyHomeCurrency;
	
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'arcashd_paymenttype__c')]")
	public WebElement CustomerPaymentMethod;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'arcashd_checkorref__c')]")
	public WebElement CheckOrOtherpaymentReference;
	
	@TextType()
	@FindBy(xpath = "//h2[text()='Cash Receipts Detail']")
	public WebElement CashReceiptsDetailTitle;
	
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']//ul//li")
	public WebElement Customer_Select;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement Save;
	
	@TextType()
	@FindBy(xpath = "//h2[@class='pageDescription']")
	public WebElement CashReceiptsDetailCreated;
	
	@TextType()
	@FindBy(xpath = "//th[text()='Cash Receipts']/following::td//span//a")
	public WebElement CashReceipts;
	
	@TextType()
	@FindBy(xpath = "//th[text()='Customer Payment Sequence']/following::td//span")
	public WebElement CustomerPaymentSequence;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='New Applications']")
	public WebElement NewApplications;
	
	@ButtonType()
	@FindBy(xpath = "//td[contains(@id,'tab_paymentdetails')]//table//table//td")
	public WebElement PaymentDetailsTab;
	
	@ButtonType()
	@FindBy(xpath = "//td[contains(@id,'tab_paymentdistribution')]//table//table//td")
	public WebElement PaymentDistributionTab;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdetails')]//tr//td[3]//span//a")
	public WebElement SalesInvoiceMemo;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdetails')]//tr//td[5]")
	public WebElement DocumentAmountDocumentCurrency;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdetails')]//tr//td[6]")
	public WebElement TransactionAmountARCurrency;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdistribution')]//tr[1]//td[5]")
	public WebElement DebitAmountRow1;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdistribution')]//tr[2]//td[5]")
	public WebElement DebitAmountRow2;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdistribution')]//tr[3]//td[5]")
	public WebElement DebitAmountRow3;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdistribution')]//tr[1]//td[6]")
	public WebElement CreditAmountRow1;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdistribution')]//tr[2]//td[6]")
	public WebElement CreditAmountRow2;
	
	@TextType()
	@FindBy(xpath = "//tbody[contains(@id,'pbt_paymentdistribution')]//tr[3]//td[6]")
	public WebElement CreditAmountRow3;
}
