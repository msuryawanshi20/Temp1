package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__icreqfirm"                                
               , summary=""
               , page="IcreqFirm"
               , namespacePrefix="rstk"
               , object="rstk__icreq__c"
               , connection="QARSF_Admin"
     )             
public class rstk__icreqfirm {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Req Status']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Reqstatus;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Buyer']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Buyer;
	@ButtonType()
	@FindByLabel(label = "Search Requisitions")
	public WebElement searchRequisitions;
	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_grid']")
	public List<Table> table;
	@PageRow(byColumn = true)
	public static class Table {

		@BooleanType()
		@FindBy(xpath = "//table[@class='list']//input[@type='checkbox']")
		public WebElement select;
	}
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//div[@id='btndiv']/input[5]")
	public WebElement approve;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Conversion Mode']/following-sibling::span//select")
	public WebElement conversionmode;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//div[@id='btndiv']/input[8]")
	public WebElement assignVendors;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Assigned Vendor']/parent::th/following-sibling::td//select")
	public WebElement assignvendor;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Perform Action']")
	public WebElement performAction;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//div[@id='btndiv']/input[9]")
	public WebElement convertToPO;
	@ButtonType()
	@FindBy(xpath = "//div[@id='datePicker']/div/div")
	public WebElement dateselect;
	@TextType()
	@FindBy(xpath = "//div[contains(@id,'icreq_duedte__c')]/span[1]/span")
	public WebElement dueDate;
	
}
