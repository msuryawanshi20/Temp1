package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Soibatch View"                                
               , summary=""
               , page="SoibatchView"
               , namespacePrefix="rstk"
               , object="rstk__soibatch__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SoibatchView {


    @TextType()
	@FindBy(xpath = "//h2[@class='pageDescription']")
	public WebElement InvBatchPageTitle;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Add to Batch']")
	public WebElement addToBatch;
	@ButtonType()
	@FindBy(xpath = "//form[@id='pg:frm']//table[@class='detailList']/following::input[@name='popupCancelButton' and @value='Close'][2]")
	public WebElement closeAfterSelect;
	@ButtonType()
	@FindBy(xpath = "//form[@id='pg:frm']//table[@class='detailList']/following::input[@name='popupCancelButton' and @value='Close'][1]")
	public WebElement closeBeforeSelect;
	@ButtonType()
	@FindBy(xpath = "//form[@id='pg:frm']//table[@class='detailList']/following::input[@name='popupCancelButton' and @value='Close'][3]")
	public WebElement closeAfterRemove;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Show Invoices']")
	public WebElement ShowInvoices;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Remove From Batch']")
	public WebElement RemoveFromBatch;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Approve Batch']")
	public WebElement ApproveBatch;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Closed']/following::td//img")
	public WebElement Closed;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Approved']/following::td//img")
	public WebElement Approved;
	@ButtonType()
	@FindBy(xpath = "//input[@value='De-Approve Batch']")
	public WebElement DeApproveBatch;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Re-Open Batch']")
	public WebElement ReOpenBatch;
	@TextType()
	@FindBy(xpath = "//span[text()='Date Closed']/following::td//span")
	public WebElement DateClosed;
	@TextType()
	@FindBy(xpath = "//span[text()='Date Approved']/following::td//span")
	public WebElement DateApproved;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Print Invoice Batch']")
	public WebElement PrintInvoiceBatch;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'emailTemplate')]")
	public WebElement InvoiceFormTemplate;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@id,'creditEmailTemplate')]")
	public WebElement CreditMemoFormTemplate;
	@ButtonType()
	@FindBy(xpath = "//input[@name='popupOkButton']")
	public WebElement Ok;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Printed']/following::td//img[@title='Checked']")
	public WebElement Printed;
	@TextType()
	@FindBy(xpath = "//span[text()='Date Printed']/following::td//span")
	public WebElement DatePrinted;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Transfer Batch']")
	public WebElement TransferBatch;
	@BooleanType()
	@FindBy(xpath = "//span[text()='Transferred']/following::td//img[@title='Checked']")
	public WebElement Transferred;
	@TextType()
	@FindBy(xpath = "//span[text()='Date Transferred']/following::td//span")
	public WebElement DateTransferred;
}
