package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Fastforecastentry"                                
               , summary=""
               , page="Fastforecastentry"
               , namespacePrefix="rstk"
               , object="rstk__customext__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Fastforecastentry {

	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Starting Date']/parent::span/parent::th/following-sibling::td[1]//a")
	public WebElement StartingDate;
	@ButtonType()
	@FindByLabel(label = "Load Grid")
	public WebElement LoadGrid;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Delete Selected']")
	public WebElement DeleteSelected;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save Run']")
	public WebElement SaveRun;
	@TextType()
	@FindBy(xpath = "//div[contains(text(),'Forecast run saved successfully. Number of entries saved: ')]")
	public WebElement SaveRun_Msg;
	
	
	
	@TextType()
	@FindBy(xpath = "//input[@value='Load Grid']/following::div/span//table")
	public WebElement GridTable;
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'numberofrows')]")
	public WebElement NumberOfRows;
	
	@TextType()
	@FindBy(xpath = "//input[@value='Load Grid']/following::div/span//table//input[1]")
	public WebElement GridTable_chkbox;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'fcstentry_icitem1')]")
	public WebElement Item1_GridTable;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'fcstentry_icitem2')]")
	public WebElement Item2_GridTable;
	
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Item_Select;
	
	@PageRow()
	public static class Table {
     	@TextType()
		@FindBy(xpath = ".//td[1]/input")
		public WebElement NumberOfBuckets;
		
		@TextType()
		@FindBy(xpath = ".//td[2]/input")
		public WebElement DefaultQty;
		
	}
	@FindBy(xpath = "//label[contains(text(),'Buckets')]/following::td//table//tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	
	
	@PageRow()
	public static class GridTable {
     	@TextType()
		@FindBy(xpath = ".//td[2]/input")
		public WebElement Item;
		
		
		
	}
	@FindBy(xpath = "//input[@value='Load Grid']/following::div/span//table//tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = GridTable.class)
	public List<Table> Gridtable;
	
}
