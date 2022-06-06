package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__ Void AP Payments"                                
               , summary=""
               , page="VoidAPPayments"
               , namespacePrefix="rstkf"
               , object="rstkf__glbankacct__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__VoidAPPayments {

	@ChoiceListType()
	@FindBy(xpath = "//select")
	public WebElement glbankacctList__c;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Bank Account Number']/parent::th/parent::tr/parent::tbody/parent::table/parent::div/parent::div/following-sibling::input[1]")
	public WebElement queryBankTransactions;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='From Transaction Date']/parent::th/following-sibling::td[1]//input")
	public WebElement fromTransactionDate;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/input")
	public WebElement search;
	@PageTable(row = DisplayList.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_transactions']")
	public List<DisplayList> displayList;
	@PageRow(byColumn = true)
	public static class DisplayList {

		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@id='selected']")
		public WebElement select;
		@BooleanType()
		@VisualforceBy(componentXPath = "apex:inputCheckbox[@id='glbanktxn_voidcheckind__c']")
		public WebElement voidedCheck;
	}
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/input[1]")
	public WebElement VoidPayment;
	
}
