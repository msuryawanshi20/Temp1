package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__gltxn Inquiry"                                
               , summary=""
               , page="gltxnInquiry"
               , namespacePrefix="rstkf"
               , object="rstkf__customextf__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__gltxnInquiry {

	@TextType()
	@FindBy(xpath = "//input[@id='gti_glacct__c_autocomplete']")
	public WebElement glacc;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement gllist;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Fiscal Year']/parent::th/following-sibling::td[1]//select")
	public WebElement gti_glyear__c;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Period']/parent::th/following-sibling::td[1]//select")
	public WebElement gti_period__c;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Ending Balance']/parent::th/following-sibling::td[1]//input")
	public WebElement endingBalance;
	@ButtonType()
	@FindBy(xpath = "//td[3]/input[@value='Refresh Display']")
	public WebElement refreshDisplay;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Transaction Date']")
	public WebElement sortDiv;
	
}
