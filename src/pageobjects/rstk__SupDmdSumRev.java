package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sup Dmd Sum Rev"                                
               , summary=""
               , page="SupDmdSumRev"
               , namespacePrefix="rstk"
               , object="rstk__supdmd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SupDmdSumRev {

	@TextType()
	@FindBy(xpath = "//input[contains(@id,'pbsi_icitem:supdmd_icitem')][1]")
	public WebElement Item;
	
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Item_Select;
	
	@TextType()
	@FindBy(xpath = "//td[text()='Summary Review by Item']")
	public WebElement SummaryReviewbyItem_tab;
	
	@TextType()
	@FindBy(xpath = "//table[@id='pbt_buckets']")
	public WebElement SummaryReviewbyItem_table;
	
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
	
}
