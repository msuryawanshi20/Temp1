package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__syvatclass"                                
               , summary=""
               , page="syvatclass"
               , namespacePrefix="rstk"
               , object="rstk__syvatclass__c"
               , connection="QARSF_Admin"
     )             
public class rstk__syvatclass {

	@TextType()
	@FindBy(xpath = "//span/div/input")
	public WebElement VATClass;
	@TextType()
	@FindBy(name = "pg:fm:j_id92:pbs_main:j_id112:j_id116")
	public WebElement description;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Exempt Classification']/parent::span/parent::th/following-sibling::td//input")
	public WebElement exemptClassification;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Intra-EU Community VAT']/parent::span/parent::th/following-sibling::td//input")
	public WebElement intraEUCommunityVAT;
	@ChoiceListType()
	@FindBy(xpath = "//div/select")
	public WebElement Incoming_VAT_Account;
	@ChoiceListType()
	@FindBy(xpath = "//span[normalize-space(.)='--None--']/select")
	public WebElement Outgoing_VAT_Account;
	@ChoiceListType()
	@FindBy(xpath = "//span[normalize-space(.)='--None--1165 (VAT Input Account)2160 (Sales Tax)2165 (VAT Output Account)2250 (Sales Tax)']/select")
	public WebElement VAT_Clearing_Account;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='VAT Percent']/parent::span/parent::th/following-sibling::td//input")
	public WebElement VATPercent;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='VAT Recovery Percent']/parent::span/parent::th/following-sibling::td//input")
	public WebElement VATRecoveryPercent;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Intra-EU Community VAT Percent']/parent::span/parent::th/following-sibling::td//input")
	public WebElement intraEUCommunityVATPercent;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='PO Price Excludes VAT']/parent::span/parent::th/following-sibling::td//input")
	public WebElement pOPriceExcludesVAT;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='VAT Class is Inactive']/parent::span/parent::th/following-sibling::td//input")
	public WebElement vATClassIsInactive;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	
}
