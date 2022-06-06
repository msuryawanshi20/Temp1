package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__poreq View"                                
               , summary=""
               , page="poreqView"
               , namespacePrefix="rstk"
               , object="rstk__poreq__c"
               , connection="QARSFAdmin"
     )             
public class rstk__poreqView {

	@ButtonType()
	@FindBy(xpath = "//span[2]/input[@id='icreqgrid_add']")
	public WebElement add;

	@PageRow()
	public static class Table {

		@TextType()
		@FindBy(xpath = "/td[3]/span[1]/input")
		public WebElement itemNo;
		@TextType()
		@FindBy(xpath = "//td[4]/input")
		public WebElement requisitionQty;
		@TextType()
		@FindBy(xpath = "//td[5]//input")
		public WebElement dueDate;
//		@TextType()
//		@FindBy(xpath = "//tr[1]/td[3]/span[1]/input")
//		public WebElement syreqitem;
	}

//	@FindBy(id = "pg:fm:j_id91:j_id92:j_id96:j_id97:j_id106:j_id108:j_id109:gridpbs:gridTable:tb")
	@FindBy(xpath = "//h3[contains(text(),'Inventory Requisition')]/parent::div/following::div[2]//table/tbody/tr[2]/td[1]//span//*[contains(@id,'gridpbs:gridTable:tb')]/tr")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement itemnolist;
	@ButtonType()
	@FindBy(xpath = "//span[2]//input[@id='icreqgrid_savebtn']")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//span[2]/input[@id='syreqind_add']")
	public WebElement add1;

	@PageRow()
	public static class Table1 {
	
		@TextType()
		@FindBy(xpath = "/td[3]/span[1]/input")
		public WebElement syreqitem;
		@TextType()
		@FindBy(xpath = "/td[4]/input")
		public WebElement qtyRequired;
		@TextType()
		@FindBy(xpath = "/td[5]//input")
		public WebElement dateRequired;
		@TextType()
		@FindBy(xpath = "/td[10]/input")
		public WebElement unitPrice;
	}

	@FindBy(xpath = "//h3[contains(text(),'Indirect Requisition')]/parent::div/following::div[2]//table/tbody/tr[2]/td[1]//span//*[contains(@id,'gridpbs:gridTable:tb')]/tr")
	@PageTable(firstRowContainsHeaders = false, row = Table1.class)
	public List<Table1> table1;
	@ButtonType()
	@FindBy(xpath = "//span[4]//input[@id='syreqind_savebtn']")
	public WebElement save1;
	
}
