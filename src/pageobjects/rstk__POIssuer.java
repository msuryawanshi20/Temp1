package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ PO Issuer"                                
               , summary=""
               , page="Poissuer"
               , namespacePrefix="rstk"
               , object="rstk__woiss__c"
               , connection="QARSFAdmin"
     )             
public class rstk__POIssuer {

	@TextType()
	@FindBy(xpath = "//input[@id='poissr_hdrordno__c_autocomplete']")
	public WebElement poissrponum;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement POlist;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:inputCheckbox[@id='selectAll']")
	public WebElement selectAll;
	@ButtonType()
	@FindBy(xpath = "//div/span/span/span/input")
	public WebElement reverseIssueSelectedComponents;
	
}
