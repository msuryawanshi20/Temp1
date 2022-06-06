package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Poitem View"                                
               , summary=""
               , page="PoitemView"
               , namespacePrefix="rstk"
               , object="rstk__poitem__c"
               , connection="QARSF_Admin"
     )             
public class rstk__PoitemView {

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Data Not Available']")
	public WebElement poitemdeleted;
	
}
