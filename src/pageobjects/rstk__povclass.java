package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__povclass"                                
               , summary=""
               , page="povclass"
               , namespacePrefix="rstk"
               , object="rstk__povclass__c"
               , connection="QARSF_Admin"
     )             
public class rstk__povclass {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Vendor Class']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement vendorClass;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Buyer']/parent::span/parent::th/following-sibling::td//select")
	public WebElement respbuyer;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Payment Terms']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement payterms;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Accounts Payable User']/parent::th/following-sibling::td[1]//select")
	public WebElement apuser;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Expense Account (GL)']/parent::th/following-sibling::td[1]//select")
	public WebElement expenseglacct;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Bank Account Name']/parent::th/following-sibling::td[1]//select")
	public WebElement bankacctname;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Pay Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement povclass_paytype__c;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//h2[@class='pageDescription']")
	public WebElement pageTitle;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement edit;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Freight Terms']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement freightterm;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='FOB']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement fob;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Carrier']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement carrier;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Shipping Method']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement shippingmethod;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[2]")
	public WebElement delete;
	
}
