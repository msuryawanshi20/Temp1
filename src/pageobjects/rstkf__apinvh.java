package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__apinvh"                                
               , page="apinvh"
               , namespacePrefix="rstkf"
               , object="rstkf__apinvh__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__apinvh {
public WebDriver driver;
	
		public rstkf__apinvh(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	@TextType()
	@FindBy(xpath = "//input[@name='apinvtxn_vendno__c_autocomplete']")
	public WebElement vendor;
	@TextType()
	@FindBy(xpath = "//div[@class='ac_results']/ul/li")
	public WebElement Vendorlist;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Document Number (e.g., Invoice Number)']/parent::th/following-sibling::td[1]//input")
	public WebElement documentNumberEGInvoiceNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Transaction Total (Txn Currency)']/parent::th/following-sibling::td[1]//input")
	public WebElement transactionTotalTxnCurrency;
	@ButtonType()
	@FindBy(xpath = "//span/input[@value='Save']")
	public WebElement save;
	@TextType()
	@VisualforceBy(componentXPath = "c:standardHeader//h2[contains(@class, \"pageDescription\")]")
	public WebElement pageTitle;
	@ButtonType()
	@FindBy(xpath = "//span/input[@value='Close Session']")
	public WebElement closeSession;
	@ButtonType()
	@FindBy(xpath = "//span/input[@value='Post Session']")
	public WebElement postSession;
	@ChoiceListType()
	@FindBy(xpath = "//label[contains(text(),'Transaction Type')]/parent::th/following::td/span/select[contains(@name,'apinvtxn_trantype__c')]")
	public WebElement apinvtxn_trantype__c;
	@TextType()
	@FindBy(xpath = "//td/table//table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[normalize-space(.)='Applied/Unapplied Amounts']")
	public WebElement tab_app_amts_lbl;
//	@ButtonType()
//	@FindBy(xpath = "//td/div/div//input")
//	public WebElement applyVendorCredit;
	@ButtonType()
	@FindBy(xpath = "//input[contains(@value,'Apply Vendor Credit')]")
	public WebElement applyVendorCreditInv;
	@PageTable(row = Vndtxns.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@id='pbt_vendtxns']")
	public List<Vndtxns> vndtxns;
	@PageRow(byColumn = true)
	public static class Vndtxns {

		@BooleanType()
		@FindBy(xpath = "//tr[5]//input[1]")
		public WebElement select;
	}
	
	public void chkbox(String Inv) throws InterruptedException
		{
			
					Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//span[contains(text(),'"+Inv+"')]/parent::td//ancestor::tr//input[1]"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }
					}

	@ButtonType()
	@FindBy(xpath = "//div[@id='popVendorTxns']/form//td[2]/input[1]")
	public WebElement applyVendorCredit1;
	@ButtonType()
	@FindBy(xpath = "//span/div/div/div/div/div/table//span/input")
	public WebElement copyVendorCreditFromInvoiceVendorDebit;
	@ButtonType()
	@FindBy(xpath = "//form//div/div/div/table/tbody/tr/td/span/span/input")
	public WebElement closeTransaction;
	@ButtonType()
	@FindBy(xpath = "//td[2]/span/span/input[2]")
	public WebElement postTransaction;
	
	}
	

