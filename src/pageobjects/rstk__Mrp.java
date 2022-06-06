package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Mrp"                                
               , summary=""
               , page="Mrp"
               , namespacePrefix="rstk"
               , object="rstk__mrplaunch__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Mrp {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='MRP Plan Option']/parent::span/parent::th/following-sibling::td//select")
	public WebElement MRP_Plan_Option;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='All Projects']/parent::span/parent::th/following-sibling::td//input")
	public WebElement AllProjects_chkbox;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='MRP Launch']")
	public WebElement MRP_pageTitle;
	@TextType()
	@FindBy(xpath = "//td[@id='popStatus1']")
	public WebElement MRP_running_popup;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Run Mrp Now']")
	public WebElement RunMrpNow;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Status']/parent::span/parent::th/following-sibling::td//input")
	public WebElement Status;
	@TextType()
	@FindBy(xpath = "//textarea[contains(@id,'mrplaunch_mrpstats__c')]")
	public WebElement MRPStats;
	
}
