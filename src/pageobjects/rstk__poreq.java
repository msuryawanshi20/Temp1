package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__poreq"                                
               , summary=""
               , page="poreq"
               , namespacePrefix="rstk"
               , object="rstk__poreq__c"
               , connection="QARSFAdmin"
     )             
public class rstk__poreq {

	@ChoiceListType()
	@FindBy(xpath = "//label[contains(text(),'Vendor')]/parent::span/parent::th/following::td[1]//select")
	public WebElement PRVendor;
	@TextType()
	@FindBy(xpath = "//label[contains(text(),'Project')]/parent::span/parent::th/following::td[1]//input[@id='poreq_pjproj__c_autocomplete']")
	public WebElement PRProject;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement PRProjectlist;
	@ChoiceListType()
	@FindBy(xpath = "//label[contains(text(),'Organizational Department')]/parent::span/parent::th/following::td[1]//select")
	public WebElement orgdept;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save'][@type='submit']")
	public WebElement save;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Status']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Status;
	
}
