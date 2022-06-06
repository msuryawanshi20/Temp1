package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__icitemlot"                                
               , summary=""
               , page="Icitemlot"
               , namespacePrefix="rstk"
               , object="rstk__icitemlot__c"
               , connection="QARSF_Admin"
     )             
public class rstk__icitemlot {

	@TextType()
	@FindBy(xpath = "//label[normalize-space()='Item Number']//following::td[1]//a")
	public WebElement itemNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lot Number']//following::td[1]")
	public WebElement Lot_Number;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Consigned']//following::td[1]/span/span")
	public WebElement qtyConsigned;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Quantity On Hand']//following::td[1]/span/span/span")
	public WebElement quantityOnHand;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Non-Nettable']//following::td[1]/span/span/span")
	public WebElement qtyNonNettable;
	
}
