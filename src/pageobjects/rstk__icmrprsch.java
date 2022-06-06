package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__icmrprsch"                                
               , summary=""
               , page="Icmrprsch"
               , namespacePrefix="rstk"
               , object="rstk__icmrprsch__c"
               , connection="QARSF_Admin"
     )             
public class rstk__icmrprsch {

	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement Submit;
	
		@TextType()
		@FindBy(xpath = "//span[contains(@id,'MRPActionList')]//table")
		public WebElement ActionMessage_Table;
		
		@ButtonType()
	@FindBy(xpath = "//input[@value='Export to Excel' and @type='submit']")
	public WebElement ExporttoExcel;
	
}
