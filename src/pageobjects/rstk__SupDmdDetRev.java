package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sup Dmd Det Rev"                                
               , summary=""
               , page="SupDmdDetRev"
               , namespacePrefix="rstk"
               , object="rstk__supdmd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SupDmdDetRev {

	@TextType()
	@FindBy(xpath = "//input[contains(@id,'pbsi_icitem:supdmd_icitem')][1]")
	public WebElement Item;
	
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Item_Select;
	
	@TextType()
	@FindBy(xpath = "//td[text()='Supply Demand Review']")
	public WebElement SupplyDemandReview_tab;
	
	@TextType()
	@FindBy(xpath = "//td[@id='pg:fm:pb:tab_Subdmds']")
	public WebElement SupplyDemandReview_table;
	
	@TextType()
	@FindBy(xpath = "//td[text()='MRP Policies']")
	public WebElement MRPPolicies_tab;
	
	@TextType()
	@FindBy(xpath = "//td[text()='Lead Times']")
	public WebElement LeadTimes_tab;
	
	@TextType()
	@FindBy(xpath = "//td[text()='Inventory']")
	public WebElement Inventory_tab;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Submit' and @type='submit']")
	public WebElement Submit;
	
	@BooleanType()
	@FindBy(xpath = "//td[text()='1-Planned']/following::td[6]//input[contains(@id,'firmcb')]")
	public WebElement Firm_chkbox;
	
	@TextType()
	@FindBy(xpath = "//td[text()='1-Planned']/preceding::td[4]")
	public WebElement OrderNo;
	
	@ButtonType()
	@FindBy(xpath = "//input[@value='Firm / Unfirm']")
	public WebElement FirmUnfirm;
}
