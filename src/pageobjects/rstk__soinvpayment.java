package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__soinvpayment"                                
               , summary=""
               , page="SOInvPayment"
               , namespacePrefix="rstk"
               , object="rstk__soinv__c"
               , connection="QARSF_Admin"
     )             
public class rstk__soinvpayment {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Select Payment Operation']/parent::th/following-sibling::td//select")
	public WebElement selectPaymentOperation;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Amount']/parent::th/following-sibling::td//input")
	public WebElement amount;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Previous Payment Methods']/parent::th/following-sibling::td//select//option")
	public WebElement PreviousPaymentMethods;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Credit Card Number']/parent::th/following-sibling::td//input")
	public WebElement creditCardNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Security Code (CVV2)']/parent::th/following-sibling::td//input")
	public WebElement securityCodeCVV2;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Expires Month / Year']/parent::th/following-sibling::td//input[1]")
	public WebElement expiresMonth;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Expires Month / Year']/parent::th/following-sibling::td//input[2]")
	public WebElement expiresYear;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Address 1']/parent::th/following-sibling::td//input")
	public WebElement address1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Postal Code']/parent::th/following-sibling::td//input")
	public WebElement postalCode;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'sogateway')]")
	public WebElement sogateway;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'soinvpay')]")
	public WebElement SalesInvoicePayment;
	
}
