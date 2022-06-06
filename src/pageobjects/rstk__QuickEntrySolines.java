package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Quick Entry Solines"                                
               , summary=""
               , page="QuickEntrySolines"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="Devqaff"
     )             
public class rstk__QuickEntrySolines {

	@ButtonType()
	@FindByLabel(label = "Add")
	public WebElement Add_QuickEntry;
	
	/*@ButtonType()
	@FindBy(xpath = "//input[@value='Ok']")
	public WebElement Ok_QuickEntry;*/

	@PageRow()
	public static class TableQuickEntry {

		@TextType()
		@FindBy(xpath = "//input[contains(@class,'soline_qtyorder')]")
		public WebElement qtyOrdered_QuickEntry;
		
		@TextType()
		@FindBy(xpath = "//span[contains(@id,'gridTable')]//input[@class='ac_input']")
		public WebElement Product_QuickEntry;
		
		@TextType()
		@FindBy(xpath = "//div[@class='ac_results']//ul//li")
		public WebElement ProductSelect_QuickEntry;
		
		@TextType()
		@FindBy(xpath = "//input[contains(@class,'soline_price')]")
		public WebElement UnitPrice_QuickEntry;
		
		@TextType()
		@FindBy(xpath = "//input[contains(@class,'soline_discpct')]")
		public WebElement DiscounPct_QuickEntry;
		
		@TextType()
		@FindBy(xpath = "//input[contains(@class,'soline_firm')]")
		public WebElement Firm_QuickEntry;
		
	}

	@FindBy(xpath = "//table[@class='list']//tbody[contains(@id,'qesolines')]//tr")
	@PageTable(firstRowContainsHeaders = false, row = TableQuickEntry.class)
	public List<TableQuickEntry> tableQuickEntry;
	
}
