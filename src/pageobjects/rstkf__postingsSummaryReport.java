package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__postings Summary Report"                                
               , summary=""
               , page="postingsSummaryReport"
               , namespacePrefix="rstkf"
               , object="rstkf__customextf__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__postingsSummaryReport {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Year']/parent::th/following-sibling::td//select")
	public WebElement trialbalance_year__c;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Period']/parent::th/following-sibling::td//select")
	public WebElement trialbalance_period__c;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Select Source Data']/parent::span/parent::th/following-sibling::td//select")
	public WebElement trialbalance_sourcedata__c;
	@ButtonType()
	@FindBy(xpath = "//td/span/input[1]")
	public WebElement printReport;
	
}
