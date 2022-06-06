package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__icitemproj"                                
               , summary=""
               , page="Icitemproj"
               , namespacePrefix="rstk"
               , object="rstk__icitemproj__c"
               , connection="QARSF_Admin"
     )             
public class rstk__icitemproj {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Item Number']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement itemNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Project']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement project;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty On Hand']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement qtyOnHand;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Non-Nettable']/parent::span/parent::th/following-sibling::td//span")
	public WebElement qtyNonNettable;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Consigned']/parent::span/parent::th/following-sibling::td//span")
	public WebElement qtyConsigned;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty VMI']/parent::span/parent::th/following-sibling::td//span")
	public WebElement qtyVMI;
	
}
