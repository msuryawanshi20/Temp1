package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__arinvtxn"                                
               , summary=""
               , page="arinvtxn"
               , namespacePrefix="rstkf"
               , object="rstkf__arinvtxn__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__arinvtxn {

	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='Receivable Transaction']")
	public WebElement ReceivableTransactionTitle;
	
	@TextType()
	@FindBy(xpath = "//th//label[contains(text(),'Document Number')]/following::td//span//span[contains(@id,'docno')]")
	public WebElement DocumentNumber;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Print Memo']")
	public WebElement PrintMemo;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Show Receivable Transaction Distributions']")
	public WebElement ShowReceivableTransactionDistributions;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Show Payment / Application Details']")
	public WebElement ShowPaymentApplicationDetails;
	
	
	
	
}
