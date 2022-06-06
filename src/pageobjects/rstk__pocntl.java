package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__pocntl"                                
               , summary=""
               , page="pocntl"
               , namespacePrefix="rstk"
               , object="rstk__pocntl__c"
               , connection="QARSF_Admin"
     )             
public class rstk__pocntl {

	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement edit;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Price Decimals']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement priceDecimals;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Allow Approved Manufacturer Override']/parent::span/parent::th/following-sibling::td//input")
	public WebElement allowApprovedManufacturerOverride;
	@ButtonType()
	@FindBy(xpath = "//div[2]/div/div/div/div[1]//input[1]")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Price Decimals']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement priceDecimals1;
	
}
