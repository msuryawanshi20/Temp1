package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Apply Ppy"                                
               , summary=""
               , page="ApplyPpy"
               , namespacePrefix="rstk"
               , object="rstk__soinv__c"
               , connection="QARSF_Admin"
     )             
public class rstk__ApplyPpy {

	/*@PageRow()
	public static class Table {

		@TextType()
		@FindBy(xpath = "//td[normalize-space(.)='54']")
		public WebElement prepayNumber;
	}

	@FindBy(id = "pg:frm:j_id90:ppyAvailPpyPbs:ppyTable:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;*/
	
	@TextType()
	@FindBy(xpath = "//input[@value='Apply Prepayments']/following::div[text()='Prepay Number']/following::td[3]")
	public WebElement PrepayNumber;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Apply Prepayments']/following::div[text()='Amt Available']/following::td[7]")
	public WebElement AmtAvailable;
	
	@BooleanType()
	@FindBy(xpath = "//input[@value='Apply Prepayments']/following::div[text()='Prepay Number']/following::td[1]//span//input[@type='checkbox']")
	public WebElement ApplyPrepaymentschkbox;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Apply Prepayments']/following::div[text()='Prepay Amount']/following::td//input[@class='amount']")
	public WebElement PrepayAmount;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Unapply Prepayments']/following::div[text()='New Amount']/following::td//input[@class='amount']")
	public WebElement NewAmount;
	
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'prepayments applied.')]")
	public WebElement PrepaymentsAppliedMsg;
	
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'prepayments updated.')]")
	public WebElement PrepaymentsModifiedMsg;
	
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'prepayments un-applied.')]")
	public WebElement PrepaymentsUnappliedMsg;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Apply Prepayments']")
	public WebElement ApplyPrepayments;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Modify Prepayment Amounts']")
	public WebElement ModifyPrepaymentAmounts;
	
	@ButtonType()
	@FindBy(xpath = "//button[text()='Close']")
	public WebElement Close;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Unapply Prepayments']/following::div[text()='Prepay Number']/following::td[2]")
	public WebElement PrepayNumber_PrepaymentsApplied;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Unapply Prepayments']/following::div[text()='Amount Applied']/following::td[3]")
	public WebElement AmountApplied_PrepaymentsApplied;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Apply Prepayments']/following::div[text()='Amount Applied']/following::td[4]")
	public WebElement AmountApplied_EligiblePrepayments;
	
	@BooleanType()
	@FindBy(xpath = "//input[@value='Unapply Prepayments']/following::div[text()='Amount Applied']/following::td[1]//input[@type='checkbox']")
	public WebElement UnApplyOrModifyPrepaymentschkbox;
	
	@BooleanType()
	@FindBy(xpath = "//input[@value='Unapply Prepayments']/following::div[text()='Manual Override of Amt']/following::td[6]//span//img")
	public WebElement ManualOverrideofAmtchkbox;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Unapply Prepayments']")
	public WebElement UnapplyAmounts;
}
