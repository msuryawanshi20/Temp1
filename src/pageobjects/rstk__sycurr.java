package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__sycurr"                                
               , summary=""
               , page="sycurr"
               , namespacePrefix="rstk"
               , object="rstk__sycurr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__sycurr {

	@ChoiceListType()
	@FindBy(xpath = "//span//div/select")
	public WebElement Currency_Code;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;

	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement currentExchangeRate;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement Edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;
	
}
