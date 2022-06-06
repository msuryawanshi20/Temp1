package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;

@SalesforcePage( title="Rstk__peitemrev"                                
               , summary=""
               , page="Peitemrev"
               , namespacePrefix="rstk"
               , object="rstk__peitemrev__c"
               , connection="QARSF_Admin"
     )             
public class rstk__peitemrev {

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Revision Status']/parent::span/parent::th/following-sibling::td//select")
	public WebElement revisionStatus;
	
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
