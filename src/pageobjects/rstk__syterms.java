package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__syterms"                                
               , summary=""
               , page="syterms"
               , namespacePrefix="rstk"
               , object="rstk__syterms__c"
               , connection="QARSF_Admin"
     )             
public class rstk__syterms {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Code']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement code;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Due in Days']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement dueInDays;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Receivables Discount Base Date Method']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Receivables_Discount_Base_Date_Method;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Discount Days from Base Date']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement discountDaysFromBaseDate;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Discount Percentage']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement discountPercentage;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Finance Charge Base Date Method']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Finance_Charge_Base_Date_Method;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Finance Charge Days from Base Date']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement financeChargeDaysFromBaseDate;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Finance Charge Percentage']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement financeChargePercentage;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Payables Discount Base Date Method']/parent::th/following-sibling::td//select")
	public WebElement Payables_Discount_Base_Date_Method;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Inc Tax and Freight in Discountable Amt']/parent::span/parent::th/following-sibling::td//input")
	public WebElement incTaxAndFreightInDiscountableAmt;
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
