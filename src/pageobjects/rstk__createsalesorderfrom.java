package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__createsalesorderfrom"                                
               , summary=""
               , page="CreateSalesOrderFrom"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__createsalesorderfrom {

	@LinkType()
	@FindBy(xpath = "//label[normalize-space(.)='Created From']/parent::th/following-sibling::td[1]//a")
	public WebElement createdFrom;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Order Number']/parent::th/following-sibling::td[1]//input")
	public WebElement orderNumber;
	@TextType()
	@FindBy(xpath = "//select[contains(@id,'soline_prod__c')]//option[@selected='selected']")
	public WebElement ProductSelected;
	
}
