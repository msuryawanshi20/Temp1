package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Povend View"                                
               , summary=""
               , page="PovendView"
               , namespacePrefix="rstk"
               , object="rstk__povend__c"
               , connection="QARSF_Admin"
     )             
public class rstk__PovendView {

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Data Not Available']")
	public WebElement povenddeleted;
	
}
