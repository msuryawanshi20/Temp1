package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__arcashh 2"                                
               , summary=""
               , page="arcashh2"
               , namespacePrefix="rstkf"
               , object="rstkf__arcashh__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__arcashh2 {

	@TextType()
	@FindBy(xpath = "//input[contains(@id,'arcashh_batchamtbank__c')]")
	public WebElement DepositAmountBank;
	
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'arcashh_glbankacct__c')]")
	public WebElement BankAccount;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'arcashh_depref__c')]")
	public WebElement DepositReference;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save']")
	public WebElement Save;
	
	@TextType()
	@FindBy(xpath = "//*[text()='Deposit Number']/following::td//span[1]")
	public WebElement DepositNumber;
	
	@TextType()
	@FindBy(xpath = "//*[text()='Status']/following::td//span[1]")
	public WebElement Status;
	
	@TextType()
	@FindBy(xpath = "//h2[@class='pageDescription']")
	public WebElement PageTitle;
	
	@TextType()
	@FindBy(xpath = "//div[contains(@id,'payments')]")
	public WebElement PaymentsSection;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'arcashh_bankhomeexchrate')]")
	public WebElement ExchangeRate;
	
	@ButtonType()
	@FindBy(xpath = "//a[text()='New Customer Payment']")
	public WebElement NewCustomerPayment;
	
	@ButtonType()
	@FindBy(xpath = "//input[contains(@id,'setToPending')]")
	public WebElement SetStatustoPending;
}
