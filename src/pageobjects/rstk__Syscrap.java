package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Syscrap"                                
               , summary=""
               , page="Syscrap"
               , namespacePrefix="rstk"
               , object="rstk__syscrap__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Syscrap {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Reason ID']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement reasonID;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	
}
