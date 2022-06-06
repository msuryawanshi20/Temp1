package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__cashreceiptsjournalreportview"                                
               , summary=""
               , page="cashreceiptsjournalreportview"
               , namespacePrefix="rstkf"
               , object="rstkf__customextf__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__cashreceiptsjournalreportview {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandbutton[@id='btn_postBatches']")
	public WebElement postSessions;
	
	@LinkType()
	@FindBy(xpath = "//span[contains(@id,'report')]//a[@class='savereturl']")
	public WebElement Session;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Debits']/following::tbody//tr/following::td[text()='Journal Totals']/following::td[1]")
	public WebElement JournalTotals_Debits;
	
	@TextType()
	@FindBy(xpath = "//div[text()='Debits']/following::tbody//tr/following::td[text()='Journal Totals']/following::td[2]")
	public WebElement JournalTotals_Credits;
	
	@TextType()
	@FindBy(xpath = "//th[contains(text(),'Posted?')]/following::tr//td[4]")
	public WebElement PostedStatus;
}
