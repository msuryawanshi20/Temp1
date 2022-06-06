package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__povendpoaddr"                                
               , summary=""
               , page="povendpoaddr"
               , namespacePrefix="rstk"
               , object="rstk__povendpoaddr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__povendpoaddr {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Street']/parent::span/parent::th/following-sibling::td[1]//textarea")
	public WebElement street;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='City']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement city;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='State/Province']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement stateProvince;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Zip/Postal Code']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement zipPostalCode;
	@TextType()
	@FindBy(xpath = "//td/table//div/input")
	public WebElement country;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Valid as a Mail-To Address']/parent::span/parent::th/following-sibling::td//input")
	public WebElement validAsAMailToAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Default Mail-To Address']/parent::span/parent::th/following-sibling::td//input")
	public WebElement defaultMailToAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Sync to Salesforce Ship-To Address']/parent::span/parent::th/following-sibling::td//input")
	public WebElement syncToSalesforceShipToAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Valid as a Remit-To Address']/parent::span/parent::th/following-sibling::td//input")
	public WebElement validAsARemitToAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Sync to Salesforce Bill-To Address']/parent::span/parent::th/following-sibling::td//input")
	public WebElement syncToSalesforceBillToAddress;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/span/input[1]")
	public WebElement save;
	
}
