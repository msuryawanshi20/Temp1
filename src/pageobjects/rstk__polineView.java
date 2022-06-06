package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__poline View"                                
               , summary=""
               , page="polineView"
               , namespacePrefix="rstk"
               , object="rstk__poline__c"
               , connection="QARSF_Admin"
     )             
public class rstk__polineView {

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Data Not Available']")
	public WebElement PO_Line_Deleted;
	@TextType()
	@FindBy(xpath = "//table/tbody/tr/td/span[contains(text(),'Data Not Available')]")
	public WebElement polinedeleted1;
	
}
