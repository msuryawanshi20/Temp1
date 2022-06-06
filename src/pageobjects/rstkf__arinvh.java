package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__arinvh"                                
               , summary=""
               , page="arinvh"
               , namespacePrefix="rstkf"
               , object="rstkf__arinvh__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__arinvh {

	@TextType()
	@FindBy(xpath = "//span[contains(@id,'trandate')]//span")
	public WebElement transactionDate;
	
	@TextType()
	@FindBy(xpath = "//span//span[contains(@id,'postdate')]")
	public WebElement postedDate;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'glyear')]//a")
	public WebElement FisaclYear;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'period')]//span")
	public WebElement Period;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'batchsource')]//span")
	public WebElement SessionSource;
	
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'poststatus')]//span")
	public WebElement Status;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Document Number']/following::tbody//tr[1]//td[3]")
	public WebElement DocumentNumber;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Transaction Type']/following::tbody//tr[1]//td[4]")
	public WebElement TransactionType;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Customer']/following::tbody//tr[1]//td[5]")
	public WebElement Customer;
	
	@TextType()
	@FindBy(xpath = "//h2[text()='Receivable Session']")
	public WebElement ReceivableSessionTitle;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Post Session']")
	public WebElement PostSession;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='New Session']")
	public WebElement NewSession;

	@PageTable(row = Table.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='memoData']")
	public List<Table> table;

	@PageRow(byColumn = true)
	public static class Table {

	@TextType()
	@FindByLabel(label = "Transaction Number")
	public WebElement transactionNumber;
		
	
	
	}
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'notes')]")
	public WebElement NotesAndAttachments;

	@LinkType()
	@FindBy(xpath = "//a[text()='View']")
	public WebElement View;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Close']")
	public WebElement Close;
	
}
