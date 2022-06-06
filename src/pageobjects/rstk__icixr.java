package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__icixr"                                
               , summary=""
               , page="Icixr"
               , namespacePrefix="rstk"
               , object="rstk__icixr__c"
               , connection="Devqaff"
     )             
public class rstk__icixr {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order No']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement orderNo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Type']/parent::span/parent::th/following-sibling::td//span")
	public WebElement orderType;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Status']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement status;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Parent Item No']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement parentItemNo;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Required']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement qtyRequired;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Remaining']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement qtyRemaining;
	
}
