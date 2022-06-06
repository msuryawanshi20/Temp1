package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sylocid"                                
               , summary=""
               , page="Sylocid"
               , namespacePrefix="rstk"
               , object="rstk__sylocid__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Sylocid {

	@ChoiceListType()
	@FindBy(xpath = "//span/div/select")
	public WebElement Site;
	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement inventoryLocationID;
	@ChoiceListType()
	@FindBy(xpath = "//span/div/div/select")
	public WebElement Inventory_Location_Type;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Default Available for Picking Indicator']/parent::span/parent::th/following-sibling::td//input")
	public WebElement defaultAvailableForPickingIndicator;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Do Not Delete Zero-Qty Location']/parent::span/parent::th/following-sibling::td//input")
	public WebElement doNotDeleteZeroQtyLocation;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Backflush Location']/parent::span/parent::th/following-sibling::td//input")
	public WebElement backflushLocation;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Inspection Order Location']/parent::span/parent::th/following-sibling::td//input")
	public WebElement inspectionOrderLocation;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Vendor Location']/parent::span/parent::th/following-sibling::td//input")
	public WebElement vendorLocation;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Issue Sequence for Backflush']/parent::span/parent::th/following-sibling::td//input")
	public WebElement issueSequenceForBackflush;
	
	
	
}
