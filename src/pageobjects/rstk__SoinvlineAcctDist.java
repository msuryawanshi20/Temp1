package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Soinvline Acct Dist"                                
               , summary=""
               , page="SoinvlineAcctDist"
               , namespacePrefix="rstk"
               , object="rstk__soinvline__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SoinvlineAcctDist {

	@ButtonType()
	@FindBy(xpath = "//form/div//span/input")
	public WebElement addAccountDistribution;

	/*@PageRow()
	public static class Table {

		@ChoiceListType()
		@FindByLabel(label = "Account:")
		public WebElement account;
	}

	@FindBy(id = "pg:frm:pbMain:j_id86:soinvlineAcctDistTable:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;*/
	
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'soinvlineAcctDistTable:0:lineSalesAccount')]")
	public WebElement Account;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'soinvlineAcctDistTable:0:pct')]")
	public WebElement Percentage;
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'soinvlineAcctDistTable:0:amt')]")
	public WebElement Amount;
	
	@ButtonType()
	@FindBy(xpath = "//a[text()='remove']")
	public WebElement remove;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Submit']")
	public WebElement Submit;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Distributions updated.']")
	public WebElement Distributionsupdated;
	
}
