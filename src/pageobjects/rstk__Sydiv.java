package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sydiv"                                
               , summary=""
               , page="Sydiv"
               , namespacePrefix="rstk"
               , object="rstk__sydiv__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Sydiv {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Division Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement divisionNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;
	@ChoiceListType()
	@FindBy(xpath = "//span/span/div/select")
	public WebElement Company;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Eng Revision Active']/parent::span/parent::th/following-sibling::td//input")
	public WebElement engRevisionActive;
	@ChoiceListType()
	@FindBy(xpath = "//div/div/div/table/tbody/tr/td/span/div/select")
	public WebElement Initial_Eng_Revision_Status;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Cost Method']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Cost_Method;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Account Source']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Acc_Source;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//span/input[2]")
	public WebElement delete;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='« Back to List: Division Master']")
	public WebElement backToListDivisionMaster;
	
}
