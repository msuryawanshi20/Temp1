package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__gljh"                                
               , summary=""
               , page="gljh"
               , namespacePrefix="rstkf"
               , object="rstkf__gljh__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__gljh {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Entry Description']/parent::th/following-sibling::td//textarea")
	public WebElement entryDescription;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='saveEntry']")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='details']")
	public WebElement jEDetailMaintenance;
	@ButtonType()
	@FindBy(xpath = "//span[2]/input[@id='gljdctl_add']")
	public WebElement add;
//	@TextType()
//	@FindBy(xpath = "//li[normalize-space(.)='6622 (Cash Account)']")
//	public WebElement jeaccount;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement acclist;
	@PageRow()
	public static class Table {

		@TextType()
		@FindBy(xpath = ".//td[3]/span[1]/input")
		public WebElement account;
		@TextType()
		@FindBy(xpath = ".//td[4]/input")
		public WebElement debitAmount;
		@TextType()
		@FindBy(xpath = ".//td[5]/input")
		public WebElement creditAmount;
	}
//	@FindBy(id = "pg:fm:j_id251:j_id252:j_id256:j_id257:j_id266:j_id268:j_id269:gridpbs:gridTable:tb")
	@FindBy(xpath = "//table[contains(@id,'gridpbs:gridTable')]/tbody/tr")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	@ButtonType()
	@FindBy(xpath = "//span[4]//input[@id='gljdctl_savebtn']")
	public WebElement save1;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='testEntry']")
	public WebElement testEntry;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@id='postEntry']")
	public WebElement postEntry;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Reversing Entry']/parent::th/following-sibling::td//input")
	public WebElement reversingEntry;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Status']/parent::th/following-sibling::td[1]//span")
	public WebElement status;

	
}
