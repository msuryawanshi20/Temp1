package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__sylocnum"                                
               , summary=""
               , page="sylocnum"
               , namespacePrefix="rstk"
               , object="rstk__sylocnum__c"
               , connection="QARSF_Admin"
     )             
public class rstk__sylocnum {

	@ChoiceListType()
	@FindBy(xpath = "//span//select")
	public WebElement Inventory_Loc_ID;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Inventory Location Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement inventoryLocationNumber;
	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement description;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Pick Sequence']/parent::span/parent::th/following-sibling::td//input")
	public WebElement pickSequence;
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
