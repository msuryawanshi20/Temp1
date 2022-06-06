package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Syorg"                                
               , summary=""
               , page="Syorg"
               , namespacePrefix="rstk"
               , object="rstk__syorg__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Syorg {

	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement organizationalDepartmentID;
	@TextType()
	@FindBy(xpath = "//td/span/div/input")
	public WebElement description;
	@ChoiceListType()
	@FindBy(xpath = "//div/div/div/table/tbody/tr/td/span//select")
	public WebElement General_Expense_Account;
	@TextType()
	@FindBy(xpath = "//input[@id='syorg_dimval__c_autocomplete']")
	public WebElement Accounting_Dimension_Value;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Purchasing Dept Indicator']/parent::span/parent::th/following-sibling::td//input")
	public WebElement purchasingDeptIndicator;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Department Group Indicator']/parent::span/parent::th/following-sibling::td//input")
	public WebElement creditDepartmentGroupIndicator;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Service Authorization ID']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Service_Auth_ID;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Indirect Material Authorization ID']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Indirect_Material_Auth_ID;
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
