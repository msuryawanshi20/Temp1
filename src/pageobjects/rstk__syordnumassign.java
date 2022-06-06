package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__syordnumassign"                                
               , summary=""
               , page="syordnumassign"
               , namespacePrefix="rstk"
               , object="rstk__syordnumassign__c"
               , connection="QARSF_Admin"
     )             
public class rstk__syordnumassign {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last Purchase Order Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastPurchaseOrderNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last ECO Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastECONumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last Forecast Order No']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastForecastOrderNo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last Project Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastProjectNumber;
	@BooleanType()
	@FindBy(xpath = "//form//span/span/input")
	public WebElement suppressProjectAutoNumberInUI;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last Manufactured Lot Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastManufacturedLotNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last Purchased Lot Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastPurchasedLotNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Last Location Add Lot Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lastLocationAddLotNumber;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	
}
