package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__icitemsrl"                                
               , summary=""
               , page="Icitemsrl"
               , namespacePrefix="rstk"
               , object="rstk__icitemsrl__c"
               , connection="QARSF_Admin"
     )             
public class rstk__icitemsrl {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Item Number']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement itemNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Serial Number']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement serialNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Origin Code']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement originCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Div']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement locationDiv;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Site']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement locationSite;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Location ID']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement locationID;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Stock Loc No']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement stockLocNo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Number']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement LotNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Stock Loc Type']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement stockLocType;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Stock Add Date']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement stockAddDate;
	@TextType()
	@FindBy(xpath = "//td[contains(text(),'Order')]")
	public WebElement tab_Order_lbl;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Type Code']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement orderTypeCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Div']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement orderDiv;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Site']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement orderSite;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order No']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement orderNo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Line']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement orderLine;

}
