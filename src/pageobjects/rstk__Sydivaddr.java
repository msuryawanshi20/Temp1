package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sydivaddr"                                
               , summary=""
               , page="Sydivaddr"
               , namespacePrefix="rstk"
               , object="rstk__sydivaddr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Sydivaddr {

	@ChoiceListType()
	@FindBy(xpath = "//span/div/div/select")
	public WebElement Address_Type;
	@TextType()
	@FindBy(name = "pg:fm:pb:pbs_Main:j_id134:sydivaddr_street__c:j_id136:j_id142")
	public WebElement street;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='City']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement city;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Zip/Postal Code']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement zipPostalCode;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Phone']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement phone;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Website']/parent::span/parent::th/following-sibling::td[1]")
	public WebElement website;
	@ChoiceListType()
	@FindBy(xpath = "//span/div/select")
	public WebElement Shipping_Zone;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='State/Province']/parent::span/parent::th/following-sibling::td//input")
	public WebElement stateProvince;
	@TextType()
	@FindBy(xpath = "//td/table//div/input")
	public WebElement country;
	@ChoiceListType()
	@FindBy(xpath = "//td/select")
	public WebElement Country_Code;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Fax']/parent::span/parent::th/following-sibling::td//input")
	public WebElement fax;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Contact Email']/parent::span/parent::th/following-sibling::td//input")
	public WebElement contactEmail;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[2]")
	public WebElement delete;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Website']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement website1;
	
}
