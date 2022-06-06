package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__povclass View"                                
               , summary=""
               , page="povclassView"
               , namespacePrefix="rstk"
               , object="rstk__povclass__c"
               , connection="QARSF_Admin"
     )             
public class rstk__povclassView {

	@TextType()
	@FindBy(xpath = "//td[@id='bodyCell']//tr[1]/td")
	public WebElement vendclassdeleted;
	
}
