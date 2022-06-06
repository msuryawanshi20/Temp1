package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Poitem"                                
               , summary=""
               , page="Poitem"
               , namespacePrefix="rstk"
               , object="rstk__poitem__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Poitem {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Item Type']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement itemtype;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='PO Commodity Code']/parent::span/parent::th/following-sibling::td//select")
	public WebElement pocommcod;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Item Number']/parent::span/parent::th/following-sibling::td[1]//input[contains(@name,'poitem_itemno__c')]")
	public WebElement itemNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Item Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement itemDescription;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='ODC ID']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement odcid;
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
	@FindBy(xpath = "//label[normalize-space(.)='Indirect/Service Expense Account']/parent::span/parent::th/following-sibling::td//select")
	public WebElement expenseacct;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[2]")
	public WebElement delete;
	
}
