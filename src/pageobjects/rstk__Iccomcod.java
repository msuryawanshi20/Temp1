package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Iccomcod"                                
               , summary=""
               , page="Iccomcod"
               , namespacePrefix="rstk"
               , object="rstk__iccomcod__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Iccomcod {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Commodity Code']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement commodityCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Resp Planner']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Resp_Planner;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inventory UOM']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Inventory_UOM;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='ABC Class']/parent::span/parent::th/following-sibling::td//input")
	public WebElement ABCClass;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Eng Status']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Eng_Status;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Eng Type']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Eng_Type;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Inventory Source']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Inventory_Source;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Resp Engineer']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Resp_Engineer;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Eng UOM']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Eng_UOM;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Serial Tracking']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Serial_Tracking;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Tracking']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Lot_Tracking;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save1;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[3]")
	public WebElement clone;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	
}
