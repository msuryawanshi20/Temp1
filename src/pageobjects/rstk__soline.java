package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__soline"                                
               , summary=""
               , page="soline"
               , namespacePrefix="rstk"
               , object="rstk__soline__c"
               , connection="QARSF_Admin"
     )             
public class rstk__soline {

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Data Not Available']")
	public WebElement SO_Line_Deleted;
	
}
