package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__iclocitem"                                
               , summary=""
               , page="Iclocitem"
               , namespacePrefix="rstk"
               , object="rstk__iclocitem__c"
               , connection="QARSF_Admin"
     )             
public class rstk__iclocitem {

	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Item Number')]/ancestor::th/following-sibling::td/span/a")
	public WebElement itemNumber;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Project')]/ancestor::th/following-sibling::td/span/a")
	public WebElement project;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Quantity')]/ancestor::th/following-sibling::td/span")
	public WebElement quantity;
	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Comments')]/ancestor::th/following-sibling::td[1]/span")
	public WebElement comments;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Location Number')]/ancestor::th/following-sibling::td/span")
	public WebElement locationNumber;
	
	@TextType()
	@FindBy(xpath = "//*[contains(text(),'Location ID')]/ancestor::th/following-sibling::td[1]/span")
	public WebElement locationID;
	@LinkType()
	@FindBy(linkText = "Rootstock Site Map")
	public WebElement rootstockSiteMap;
	
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Lot / Serial Number')]/ancestor::th/following-sibling::td/span")
	public WebElement lot_SerialNumber;
	
	
	
}
