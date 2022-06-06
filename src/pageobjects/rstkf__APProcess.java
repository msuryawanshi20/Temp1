package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__ AP Process"                                
               , summary=""
               , page="APProcess"
               , namespacePrefix="rstkf"
               , object="rstkf__apinvtxn__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__APProcess {

	@TextType()
	@FindBy(xpath = "//input[@id='apinvtxn_vendno__c_autocomplete']")
	public WebElement vendname;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Document Number (e.g., Invoice Number)']/parent::th/following-sibling::td[1]//input")
	public WebElement documentNumberEGInvoiceNumber;
	@ButtonType()
	@FindBy(xpath = "//td/form//td[2]/input[1]")
	public WebElement search;
	@PageTable(row = Table.class)
//	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_results']")
	@FindBy(xpath = "//table[contains(@id,'pbt_results')]/tbody/tr")
	public List<Table> table;
//	@PageRow(byColumn = true)
	@PageRow()
	public static class Table {

		@BooleanType()
		@FindBy(xpath = ".//td[1]/input[@type='checkbox']")
		public WebElement select;
	}
	@ButtonType()
	@FindBy(xpath = "//span//td[2]/input[2]")
	public WebElement changeToCheckEFTBankCard;
	@ChoiceListType()
	@FindBy(xpath = "//span[normalize-space(.)='Pay Type CheckEFTBank CardPay with Bank Card Account --None--Bank Card 2 testUMCU']//tr[1]/td/select")
	public WebElement payType;
	@ButtonType()
	@FindBy(xpath = "//div[@id='popChangePaytype']//tbody//td/input")
	public WebElement changePaytype;
	
}
