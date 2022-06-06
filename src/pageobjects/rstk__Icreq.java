package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Icreq"                                
               , summary=""
               , page="Icreq"
               , namespacePrefix="rstk"
               , object="rstk__icreq__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Icreq {

	@TextType()
	@FindBy(id = "pg:fm:pb:pbs_Main:j_id119:icreq_ordno__c:j_id121:j_id127")
	public WebElement requisitionNo;
	@TextType()
	@FindBy(xpath = "//input[@name='icreq_item__c_autocomplete']")
	public WebElement icitem;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement icreqitemlist;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Planner']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement icreqplanner;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Requisition Qty']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement requisitionQty;
	@TextType()
	@FindBy(id = "//label[normalize-space(.)='Due Date']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement dueDate;
	@TextType()
	@FindBy(xpath = "//input[@name='icreq_proj__c_autocomplete']")
	public WebElement icreqproj;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement icreqprjlist;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Buyer']/parent::span/parent::th/following-sibling::td//select")
	public WebElement icreqbuyer;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='PO Price Override']/parent::th/following-sibling::td//input")
	public WebElement pOPriceOverride;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Save'][@type='submit']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Requisition No']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement requisitionNo1;
	@TextType()
	@FindBy(xpath = "//h2[@class='pageDescription']")
	public WebElement pageTitle;
	@ButtonType()
	@FindBy(xpath = "//div[@id='datePicker']/div/div")
	public WebElement dateselect;
	
}
